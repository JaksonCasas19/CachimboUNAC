package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa {
	
	private int [] pixeles;
	

	public MapaCargado(String ruta) {
		super(ruta);
		
	}
 protected void cargarMapa(String ruta) {
	 try {
		BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
		
		
		ancho = imagen.getWidth();
		alto = imagen.getHeight();
		
		cuadrosCatalogo = new Cuadro[ancho * alto];
		pixeles = new int[ancho * alto];
		
		imagen.getRGB(0,0, ancho, alto, pixeles, 0, ancho);
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
 }
 
 protected void generarMapa(){
	 for (int i = 0; i < pixeles.length; i++){
		 switch(pixeles[i]){
		 case 0xff1b1b1b:
			 cuadrosCatalogo[i] = Cuadro.ASFALTO;
			 continue;
		 case 0xffe9cb70:
			 cuadrosCatalogo[i] = Cuadro.ARENA;
			 continue;
		 case 0xff20b103:
			 cuadrosCatalogo[i] = Cuadro.PASTO;
			 continue;
		 case 0xffffbe00:
		     cuadrosCatalogo[i] = Cuadro.BORDE_CARRETERA;
		     continue;
		 case 0xffd39d00:
		     cuadrosCatalogo[i] = Cuadro.BORDE_CARRETERA_SUPERIOR;
		     continue;
		 
		
		 case 0xff303030:
	     cuadrosCatalogo[i] = Cuadro.CENTRO_CARRETERA;
	     continue;
		 case 0xff48df9d:
		     cuadrosCatalogo[i] = Cuadro.CENTRO_CARRETERA_DERECHA;
		     continue;
		 case 0xffeb6c6c:
	     cuadrosCatalogo[i] = Cuadro.ESQUINA_CARRETERA;
	     continue;
		 case 0xff868686:
	     cuadrosCatalogo[i] = Cuadro.PARED_PIEDRA;
	     continue;
		 case 0xff605931:
	     cuadrosCatalogo[i] = Cuadro.PIEDRA_CAMINO;
	     continue;
		 case 0xff2295e0:
		     cuadrosCatalogo[i] = Cuadro.MURO;
		     continue;
		 case 0xff07598e:
		     cuadrosCatalogo[i] = Cuadro.MURO_CENTRO;
		     continue;
		 case 0xff8c7a7a:
		     cuadrosCatalogo[i] = Cuadro.COLUMNA;
		     continue;
		 case 0xffafafaf:
		     cuadrosCatalogo[i] = Cuadro.REJA;
		     continue;
		 case 0xffd72929:
			 cuadrosCatalogo[i] = Cuadro.CASETA_SUPERIOR_IZQUIERDA;
			 continue;
		 case 0xffa63333:
			 cuadrosCatalogo[i] = Cuadro.CASETA_INFERIOR_IZQUIERDA;
			 continue;
		 case 0xffa51111:
			 cuadrosCatalogo[i] = Cuadro.CASETA_CENTRO_SUPERIOR;
			 continue;
		 case 0xff337baa:
			 cuadrosCatalogo[i] = Cuadro.PARED_SUPERIOR_IZQUIERDA;
			 continue;
		 case 0xff479cd4:
			 cuadrosCatalogo[i] = Cuadro.PARED_INFERIOR_IZQUIERDA;
			 continue;
		 case 0xffff7878:
			 cuadrosCatalogo[i] = Cuadro.CASETA_CENTRO_INFERIOR;
			 continue;
		 case 0xffb73e3e:
			 cuadrosCatalogo[i] = Cuadro.CASETA_SUPERIOR_DERECHA;
			 continue;
		 case 0xffe33d3d:
			 cuadrosCatalogo[i] = Cuadro.CASETA_INFERIOR_DERECHA;
			 continue;
		 case 0xff0c5a8c:
			 cuadrosCatalogo[i] = Cuadro.PARED_SUPERIOR_DERECHA;
			 continue;
		 case 0xff397297:
			 cuadrosCatalogo[i] = Cuadro.PARED_INFERIOR_DERECHA;
			 continue;
		 case 0xffd1aa38:
			 cuadrosCatalogo[i] = Cuadro.BORDE_CARRETERA_DERECHA;
			 continue;
		 case 0xff26e200:
			 cuadrosCatalogo[i] = Cuadro.LINEAS;
			 continue;
		 case 0xff9c1471:
			 cuadrosCatalogo[i] = Cuadro.CHACRA;
			 continue;
		 case 0xff969e37:
			 cuadrosCatalogo[i] = Cuadro.CHACRA_SUPERIOR;
			 continue;
		 case 0xffc61313:
			 cuadrosCatalogo[i] = Cuadro.CHACRA_INFERIOR;
			 continue;
		 case 0xff64a42c:
			 cuadrosCatalogo[i] = Cuadro.CHACRA_ESQUINA_DERECHA;
			 continue;
		 case 0xff548728:
			 cuadrosCatalogo[i] = Cuadro.CHACRA_ESQUINA_DERECHA_ABAJO;
			 continue;
		 case 0xffbb4495:
			 cuadrosCatalogo[i] = Cuadro.ESQUINA_CARRETERA_SUPE;
			 continue;
		 case 0xffc2188c:
			 cuadrosCatalogo[i] = Cuadro.ESQUINA_CARRETERA_INFE;
			 continue;
		 case 0xffd63636:
			 cuadrosCatalogo[i] = Cuadro.ESQUINA_CARRETERA_SUPE_XD;
			 continue;
		 case 0xffa11f1f:
			 cuadrosCatalogo[i] = Cuadro.ESQUINA_CARRETERA_INFE_XD;
			 continue;
		 case 0xff7f8728:
			 cuadrosCatalogo[i] = Cuadro.CHACRA_LINEAL_DERECHA;
			 continue;
		 case 0xff885c3c:
			 cuadrosCatalogo[i] = Cuadro.CAMINO;
			 continue;
		 case 0xff312887:
			 cuadrosCatalogo[i] = Cuadro.LINEA_CHACRA;
			 continue;
		 case 0xffc01153:
			 cuadrosCatalogo[i] = Cuadro.ARBOL_SUPERIOR_FRONTAL;
			 continue;
		 case 0xff8f1342:
			 cuadrosCatalogo[i] = Cuadro.ARBOL_SUPERIOR_FRONTAL_LINEAL;
			 continue;
		 case 0xfff0508c:
			 cuadrosCatalogo[i] = Cuadro.ARBOL_SUPERIOR_DERECHA;
			 continue;
		 case 0xffff7aac:
			 cuadrosCatalogo[i] = Cuadro.ARBOL_INFERIOR_DERECHA;
			 continue;
			 //SDEE
		 case 0xff97536d:
			 cuadrosCatalogo[i] = Cuadro.ARBOL_SUPERIOR_IZQUIERDA;
			 continue;
		 case 0xffd37699:
			 cuadrosCatalogo[i] = Cuadro.ARBOL_INFERIOR_EZQUIERDA;
			 continue;
		 case 0xffffae00:
			 cuadrosCatalogo[i] = Cuadro.TIERRA;
			 continue;
		 case 0xffff6c00:
			 cuadrosCatalogo[i] = Cuadro.RECTA;
			 continue;
			 //BUS
		 case 0xffcf7500:
			 cuadrosCatalogo[i] = Cuadro.BUS_1_ABAJO;
			 continue;
		 case 0xffe7a754:
			 cuadrosCatalogo[i] = Cuadro.BUS_1_ARRIBA;
			 continue;
		 case 0xffffb95d:
			 cuadrosCatalogo[i] = Cuadro.BUS_2_ABAJO;
			 continue;
		 case 0xffd9a664:
			 cuadrosCatalogo[i] = Cuadro.BUS_2_ARRIBA;
			 continue;
		 case 0xffad7c3c:
			 cuadrosCatalogo[i] = Cuadro.BUS_3_ABAJO;
			 continue;
		 case 0xffb49062:
			 cuadrosCatalogo[i] = Cuadro.BUS_3_ARRIBA;
			 continue;
		 case 0xffd48d31:
			 cuadrosCatalogo[i] = Cuadro.BUS_4_ABAJO;
			 continue;
		 case 0xff9d825f:
			 cuadrosCatalogo[i] = Cuadro.BUS_4_ARRIBA;
			 continue;
		 case 0xff384d9b:
			 cuadrosCatalogo[i] = Cuadro.LINEA_FINAL;
			 continue;
		 case 0xffbdcb15:
			 cuadrosCatalogo[i] = Cuadro.ESQUINA_CHACR;
			 continue;
		 case 0xff03b159:
			 cuadrosCatalogo[i] = Cuadro.PINO_DERECHA_ABAJO;
			 continue;
		 case 0xff1ac36e:
			 cuadrosCatalogo[i] = Cuadro.PINO_DERECHA_ARRIBA;
			 continue;
		 case 0xff34664d:
			 cuadrosCatalogo[i] = Cuadro.PINO_IZQUIERDA_ABAJO;
			 continue;
		 case 0xff5d9a7b:
			 cuadrosCatalogo[i] = Cuadro.PINO_IZQUIERDA_ARRIBA;
			 continue;
		 case 0xff29f28c:
			 cuadrosCatalogo[i] = Cuadro.PINO_CENTRAL_DERECHA;
			 continue;
		 case 0xff7bc8a1:
			 cuadrosCatalogo[i] = Cuadro.PINO_CENTRAL_IZQUIERDA;
			 continue;
		 case 0xff3ed689:
			 cuadrosCatalogo[i] = Cuadro.PINO_NEGRO_1;
			 continue;
		 case 0xff199c5a:
			 cuadrosCatalogo[i] = Cuadro.PINO_NEGRO_2;
			 continue;
			 
			 
			 
		 
	
			 
			 
			 
		      default:
			cuadrosCatalogo[i] = Cuadro.VACIO;
			 
			 
		 
		 
		 }
	 }
	 
	 
	 
	 
	 
 }
}
