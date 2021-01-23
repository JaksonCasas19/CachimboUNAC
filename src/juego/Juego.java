package juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import control.Raton;
import control.Teclado;
import entes.criaturas.Jugador;
import graficos.Pantalla;
import graficos.Sprite;
import herramientas.CargadorRecursos;
import mapa.Mapa;
import mapa.MapaCargado;
import mapa.MapaGenerado;

import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;


public class Juego extends Canvas implements Runnable{

  private static final long serialVersionUID = 1L;
  
  private static final int ANCHO = 600;
  private static final int ALTO = 500;
  
  private static volatile boolean  enFuncionamiento = false;
  
  private static String NOMBRE = "El Cachimbo - Jakson Casas"; 
  
  private static String CONTADOR_APS = "";
  private static String CONTADOR_FPS = "";
 
  
  
  private static int aps = 0;
  private static int fps = 0;
  
  

  private static JFrame ventana;
  private static Thread thread;
  private static Teclado teclado;
  private static Raton raton;
  private static Pantalla pantalla;
  private static Mapa mapa;
  private static Jugador jugador;
  
  
  
  private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
  private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
  

  private static final ImageIcon icono = new ImageIcon(Juego.class.getResource("/icono/iconos.png"));
  BufferedImage logo = CargadorRecursos.cargarImagenCompatibleTranslucida("/iconos/logotipos.png");
  BufferedImage logos = CargadorRecursos.cargarImagenCompatibleTranslucida("/iconos/logotipo.png");


  private Juego() {
	    setPreferredSize(new Dimension(ANCHO,ALTO));
	    
	   
	    
	    pantalla = new Pantalla(ANCHO, ALTO);
	    
//	    mapa = new MapaGenerado(128, 128);
	    
		 
	    raton = new Raton();
	    setCursor(raton.obtenerCursor());
	    
	    teclado = new Teclado();
	    addKeyListener (teclado);
	    
	    mapa = new MapaCargado("/mapas/mapaDesiertox.png");
	    jugador = new Jugador(mapa,teclado,Sprite.ARRIBA0,320,1023);
	    
	  
	    ventana = new JFrame(NOMBRE);
	    ventana.setIconImage(icono.getImage());
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana.setResizable(false);
	    ventana.setLayout(new BorderLayout());
	    ventana.add(this, BorderLayout.CENTER);
	    ventana.setUndecorated(true);
	    ventana.pack();
	    ventana.setLocationRelativeTo(null);
	    ventana.setVisible(true);
	    
	    
  }
  
  public static void main(String[]args) {
	  Juego juego = new Juego();
	  juego.iniciar();
     }

 private synchronized void iniciar(){
	 enFuncionamiento = true;
	 
	 thread = new Thread(this, "Graficos"); 
     thread.start();
 }
 
 private synchronized void detener(){
	 enFuncionamiento = false;
 
	 try {
		thread.join();
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	 
	 }
 
    private void actualizar() {
    	teclado.actualizar();
    jugador.actualizar();
//    	if(teclado.arriba){
//    		y--;
//    	}	
//    	if(teclado.abajo){
//        	y++;
//    	}
//        	if(teclado.izquierda){
//            		x--;
//        	}	
//            		if(teclado.derecha){
//                	x++;
//    	}
            		
            		if (teclado.salir){
            			System.exit(0);
            		}
    	aps++;
    	
    }
    private void mostrar(){
    	BufferStrategy estrategia = getBufferStrategy();
    	if (estrategia == null){
    		createBufferStrategy(3);
    		return;
    		
    	}
    	pantalla.limpiar();
    	mapa.mostrar(jugador.obtenerPosicionX() - pantalla.obtenAncho()/2 + jugador.obtenSprite().obtenLado()/2, 
    			jugador.obtenerPosicionY() - pantalla.obtenAlto()/2+ jugador.obtenSprite().obtenLado()/2, pantalla);
    	jugador.mostrar(pantalla);
    	
//    	pantalla.mostrar(x, y);
    	
    	System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
    	

//    	for (int i = 0;  i < pixeles.length; i++){
//    		pixeles[i] = pantalla.pixeles[i];
//    		
//    	}
    	
    	Graphics g = estrategia.getDrawGraphics();
    	g.drawImage(imagen, 0, 0, getWidth(), getWidth(),null);
    	g.setColor(Color.white);
    	
    	g.drawString(CONTADOR_APS, 10, 20);
    	g.drawString(CONTADOR_FPS, 10, 35);
    	g.drawString("x:"+ jugador.obtenerPosicionX(),10 , 50);
    	g.drawString("y:"+jugador.obtenerPosicionY(),10, 65);
    	g.drawImage(logo,604- logo.getWidth() - 1, 510-logo.getHeight() - 1 ,null);
    	g.drawImage(logos,640- logos.getWidth() - 5, 100-logos.getHeight() - 5 ,null);
    	g.dispose();
     
        
        estrategia.show();
    	
    	
    	
    	
    	fps++;
    	
    }
 public void run() {
	 final int NS_POR_SEGUNDO = 1000000000;
	 final byte	 APS_OBJETIVO = 60;
	 final double NS_POR_ACTUALZACION = NS_POR_SEGUNDO / APS_OBJETIVO;
	 
	 long referenciaActualizacion = System.nanoTime();
	 long referenciaContador = System.nanoTime();
	 
	 
	 double tiempoTranscurrido;
	 double delta = 0;
	 
	 requestFocus();

	while (enFuncionamiento){
		
		final long inicioBucle = System.nanoTime();
		tiempoTranscurrido = inicioBucle - referenciaActualizacion;
		referenciaActualizacion = inicioBucle;
		
		delta += tiempoTranscurrido / NS_POR_ACTUALZACION;
		
		while (delta>=1) {
				
			actualizar();
		   delta --;
		}
			
			mostrar();
			if(System.nanoTime()- referenciaContador > NS_POR_SEGUNDO ) {
				CONTADOR_APS = "APS:"+ aps;
				CONTADOR_FPS = "FPS:" + fps;
//				System.out.println(fps);
				
				aps = 0;
				fps = 0;
				
			referenciaContador = System.nanoTime();
		
			}
			
 
	}
	
}

 }
