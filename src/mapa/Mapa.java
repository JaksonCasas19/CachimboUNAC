package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
	protected int ancho;
	protected int alto;
	
	protected int[] cuadros;
	protected Cuadro[] cuadrosCatalogo;
	
	
	public Mapa(int ancho, int alto){
		this.ancho = ancho;
		this.alto = alto;
		
		cuadros = new int[ancho * alto];
		generarMapa();
		}
	public Mapa(String ruta){
		cargarMapa(ruta);
		generarMapa();
		
	}
	
	protected void generarMapa() {
		
		}
protected void cargarMapa(String ruta){
	
}
      public void actualizar(){
    	  
      }
      
      public void mostrar(final int compensacionX,final int compensacionY,final Pantalla pantalla){
    	  
    	  pantalla.estableceDiferencia(compensacionX, compensacionY);
    	  
    	  int o = compensacionX >> 5; // /32
    	  int e = (compensacionX + pantalla.obtenAncho() + Cuadro.LADO)>> 5;
    	  int n = compensacionY >> 5; 
    	  int s = (compensacionY + pantalla.obtenAlto() + Cuadro.LADO) >> 5;
    	  
    		  for (int y = n; y < s; y++){
    			  for ( int x = 0; x < e; x++){
//    				  obtenCuadro(x, y).mostrar(x, y, pantalla);
    				  if(x < 0 || y < 0 || x >= ancho || y >= alto){
    					  Cuadro.VACIO.mostrar(x, y, pantalla);
    				  }else {
    					 cuadrosCatalogo[x + y * ancho].mostrar(x, y, pantalla);
    					 
    				  }
    				  
    			  }
    		  }
    	  
      }
      public Cuadro obtenerCuadroCatalogo(int posicion){
    	  
    	  return cuadrosCatalogo[posicion];
      }
      public int obtenerAncho(){
    	  return ancho;
      }
      public Cuadro obtenCuadro(final int x, final int y) {
    	  if(x < 0 || y < 0|| x >= ancho || y >= alto){
    		  return Cuadro.VACIO;
    	  }
    	  switch (cuadros[x + y * ancho]){
    	  case 0:
    	      return Cuadro.ASFALTO;
    	  case 1:
    		  return Cuadro.ARENA;
    	  case 2:
    		  return Cuadro.PASTO;
    	  case 3:
    		  return Cuadro.BORDE_CARRETERA;
    	  case 4:
    		  return Cuadro.CENTRO_CARRETERA;
    	  case 5:
    		  return Cuadro.ESQUINA_CARRETERA;
    	  case 6:
    		  return Cuadro.PARED_PIEDRA;
    	  case 7: 
    		  return Cuadro.PIEDRA_CAMINO;
    	 case 8:
    		  return Cuadro.MURO;
    	  case 9:
    		  return  Cuadro.MURO_CENTRO;
    	  case 10: 
    		  return Cuadro.COLUMNA;
    	  case 11:
    		  return Cuadro.REJA;
    	  case 12:
    		  return Cuadro.CASETA_SUPERIOR_IZQUIERDA;
    	  case 13:
    	      return Cuadro.CASETA_INFERIOR_IZQUIERDA;
    	  case 14:
    		  return Cuadro.CASETA_CENTRO_SUPERIOR;
    	  case 15:
    		  return Cuadro.PARED_SUPERIOR_IZQUIERDA;
    	  case 16:
    		  return Cuadro.PARED_INFERIOR_IZQUIERDA;
    	  case 17:
    		  return Cuadro.CASETA_CENTRO_INFERIOR;
    	  case 18:
    		  return Cuadro.CASETA_SUPERIOR_DERECHA;
    	  case 19:
    		  return Cuadro.LINEAS;
    	  case 20:
    		  return Cuadro.CHACRA;
    	  case 21:
    		  return Cuadro.CHACRA_SUPERIOR;
    	  case 22:
    		  return Cuadro.CHACRA_INFERIOR;
    	  case 23:
    		  return Cuadro.CHACRA_ESQUINA_DERECHA;
    	  case 24:
    		  return Cuadro.CHACRA_ESQUINA_DERECHA_ABAJO;
    	  case 25:
    		  return Cuadro.ESQUINA_CARRETERA_SUPE;
    	  case 26:
    		  return Cuadro.ESQUINA_CARRETERA_INFE;
    	  case 27:
    		  return Cuadro.ESQUINA_CARRETERA_SUPE_XD;
    	  case 28:
    		  return Cuadro.ESQUINA_CARRETERA_INFE_XD;  
    	  case 29:
    		  return Cuadro.CHACRA_LINEAL_DERECHA;
    	  case 30:
    		  return Cuadro.CAMINO;
    	  case 31:
    		  return Cuadro.LINEA_CHACRA;
    	  case 32:
    		  return Cuadro.ARBOL_SUPERIOR_FRONTAL;
    	  case 33:
    		  return Cuadro.ARBOL_SUPERIOR_FRONTAL_LINEAL;
    	  case 34:
    		  return Cuadro.ARBOL_SUPERIOR_DERECHA;
    	  case 35:
    		  return Cuadro.ARBOL_INFERIOR_DERECHA;
    	  case 36:
    		  return Cuadro.ARBOL_SUPERIOR_IZQUIERDA;
    	  case 37:
    		  return Cuadro.ARBOL_INFERIOR_EZQUIERDA;
    	  case 38:
    		  return Cuadro.TIERRA;
    	  case 39:
    		  return Cuadro.RECTA;
    	  case 40:
    		  return Cuadro.BUS_1_ABAJO;
    	  case 41:
    		  return Cuadro.BUS_1_ARRIBA;
    	  case 42:
    		  return Cuadro.BUS_2_ABAJO;
    	  case 43:
    		  return Cuadro.BUS_2_ARRIBA;
    	  case 44:
    		  return Cuadro.BUS_3_ABAJO;
    	  case 45:
    		  return Cuadro.BUS_3_ARRIBA;
    	  case 46:
    		  return Cuadro.BUS_4_ABAJO;
    	  case 47:
    		  return Cuadro.BUS_4_ARRIBA;
    	  case 48:
    		  return Cuadro.LINEA_FINAL;
    	  case 49:
    		  return Cuadro.PINO_DERECHA_ABAJO;
    	  case 50:
    		  return Cuadro.PINO_DERECHA_ARRIBA;
    	  case 51:
    		  return Cuadro.PINO_IZQUIERDA_ABAJO;
    	  case 52:
    		  return Cuadro.PINO_IZQUIERDA_ARRIBA;
    	  case 53:
    		  return Cuadro.PINO_CENTRAL_DERECHA;
    	  case 54:
    		  return Cuadro.PINO_CENTRAL_IZQUIERDA;
    	  case 55:
    		  return Cuadro.PINO_NEGRO_1;
    	  case 56:
    		  return Cuadro.PINO_NEGRO_2;
    				 
    		  
    	  
    	  default:
    	 
    		  return Cuadro.VACIO;
    		  
    	  }
    	 
      }
      }
