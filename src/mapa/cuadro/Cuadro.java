package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {
	
	public int x;
	public int y;
	

	 public Sprite sprite;
	 private boolean solido;
	 
	 public static final int LADO = 32;
	 
	 
	 //coleccion de cuadros
	 public static final Cuadro VACIO = new Cuadro(Sprite.VACIO,true);
	 public static final Cuadro ASFALTO = new Cuadro(Sprite.ASFALTO);
	 public static final Cuadro ARENA = new Cuadro(Sprite.ARENA);
	 public static final Cuadro PASTO = new Cuadro(Sprite.PASTO);
	 public static final Cuadro BORDE_CARRETERA = new Cuadro(Sprite.BORDE_CARRETERA);
	 public static final Cuadro BORDE_CARRETERA_DERECHA = new Cuadro(Sprite.BORDE_CARRETERA_DERECHA);
	 public static final Cuadro BORDE_CARRETERA_SUPERIOR = new Cuadro(Sprite.BORDE_CARRETERA_SUPERIOR);
	 public static final Cuadro CENTRO_CARRETERA = new Cuadro(Sprite.CENTRO_CARRETERA);
	 public static final Cuadro CENTRO_CARRETERA_DERECHA = new Cuadro(Sprite.CENTRO_CARRETERA_DERECHA);
	 public static final Cuadro ESQUINA_CARRETERA = new Cuadro(Sprite.ESQUINA_CARRETERA);
	 public static final Cuadro PARED_PIEDRA = new Cuadro(Sprite.PARED_PIEDRA,true);
	 public static final Cuadro PIEDRA_CAMINO = new Cuadro(Sprite.PIEDRA_CAMINO);
	 public static final Cuadro MURO = new Cuadro(Sprite.MURO,true);
	 public static final Cuadro MURO_CENTRO = new Cuadro(Sprite.MURO_CENTRO,true);
	 public static final Cuadro COLUMNA = new Cuadro(Sprite.COLUMNA,true);
	 public static final Cuadro REJA = new Cuadro(Sprite.REJA,true);
	 public static final Cuadro CASETA_SUPERIOR_IZQUIERDA = new Cuadro(Sprite.CASETA_SUPERIOR_IZQUIERDA,true);
	 public static final Cuadro CASETA_INFERIOR_IZQUIERDA  = new Cuadro(Sprite.CASETA_INFERIOR_IZQUIERDA,true );
	 public static final Cuadro CASETA_CENTRO_SUPERIOR = new Cuadro(Sprite.CASETA_CENTRO_SUPERIOR,true);
	 public static final Cuadro PARED_SUPERIOR_IZQUIERDA = new Cuadro(Sprite.PARED_SUPERIOR_IZQUIERDA,true);
	 public static final Cuadro PARED_INFERIOR_IZQUIERDA = new Cuadro(Sprite.PARED_INFERIOR_IZQUIERDA,true);
	 public static final Cuadro CASETA_CENTRO_INFERIOR = new Cuadro(Sprite.CASETA_CENTRO_INFERIOR,true);
	 public static final Cuadro CASETA_SUPERIOR_DERECHA = new Cuadro(Sprite.CASETA_SUPERIOR_DERECHA,true);
	 public static final Cuadro CASETA_INFERIOR_DERECHA = new Cuadro(Sprite.CASETA_INFERIOR_DERECHA,true);
	 public static final Cuadro PARED_SUPERIOR_DERECHA = new Cuadro(Sprite.PARED_SUPERIOR_DERECHA,true);
	 public static final Cuadro PARED_INFERIOR_DERECHA = new Cuadro(Sprite.PARED_INFERIOR_DERECHA,true);
	 public static final Cuadro LINEAS = new Cuadro(Sprite.LINEAS);
	 public static final Cuadro CHACRA = new Cuadro(Sprite.CHACRA);
	 public static final Cuadro CHACRA_SUPERIOR = new Cuadro(Sprite.CHACRA_SUPERIOR,true);
	 public static final Cuadro CHACRA_INFERIOR = new Cuadro(Sprite.CHACRA_INFERIOR,true);
	 public static final Cuadro CHACRA_ESQUINA_DERECHA = new Cuadro(Sprite.CHACRA_ESQUINA_DERECHA,true);
	 public static final Cuadro CHACRA_ESQUINA_DERECHA_ABAJO= new Cuadro(Sprite.CHACRA_ESQUINA_DERECHA_ABAJO,true);
	 public static final Cuadro ESQUINA_CARRETERA_SUPE= new Cuadro(Sprite.ESQUINA_CARRETERA_SUPE);
	 public static final Cuadro ESQUINA_CARRETERA_INFE= new Cuadro(Sprite.ESQUINA_CARRETERA_INFE);
	 public static final Cuadro ESQUINA_CARRETERA_SUPE_XD= new Cuadro(Sprite.ESQUINA_CARRETERA_SUPE_XD);
	 public static final Cuadro ESQUINA_CARRETERA_INFE_XD= new Cuadro(Sprite.ESQUINA_CARRETERA_INFE_XD);
	 public static final Cuadro CHACRA_LINEAL_DERECHA= new Cuadro(Sprite.CHACRA_LINEAL_DERECHA,true);
	 public static final Cuadro CAMINO = new Cuadro(Sprite.CAMINO);
	 public static final Cuadro LINEA_CHACRA = new Cuadro(Sprite.LINEA_CHACRA);
	 public static final Cuadro ARBOL_SUPERIOR_FRONTAL= new Cuadro(Sprite.ARBOL_SUPERIOR_FRONTAL,true);
	 public static final Cuadro ARBOL_SUPERIOR_FRONTAL_LINEAL= new Cuadro(Sprite.ARBOL_SUPERIOR_FRONTAL_LINEAL,true);
	 public static final Cuadro ARBOL_SUPERIOR_DERECHA= new Cuadro(Sprite.ARBOL_SUPERIOR_DERECHA,true);
	 public static final Cuadro ARBOL_INFERIOR_DERECHA= new Cuadro(Sprite.ARBOL_INFERIOR_DERECHA,true);
	 public static final Cuadro ARBOL_SUPERIOR_IZQUIERDA= new Cuadro(Sprite.ARBOL_SUPERIOR_IZQUIERDA,true);
	 public static final Cuadro ARBOL_INFERIOR_EZQUIERDA= new Cuadro(Sprite.ARBOL_INFERIOR_EZQUIERDA,true);
	 public static final Cuadro TIERRA= new Cuadro(Sprite.TIERRA);
	 public static final Cuadro RECTA= new Cuadro(Sprite.RECTA);
	 public static final Cuadro BUS_1_ABAJO= new Cuadro(Sprite.BUS_1_ABAJO,true);
	 public static final Cuadro BUS_1_ARRIBA= new Cuadro(Sprite.BUS_1_ARRIBA,true);
	 public static final Cuadro BUS_2_ABAJO= new Cuadro(Sprite.BUS_2_ABAJO,true);
	 public static final Cuadro BUS_2_ARRIBA= new Cuadro(Sprite.BUS_2_ARRIBA,true);
	 public static final Cuadro BUS_3_ABAJO= new Cuadro(Sprite.BUS_3_ABAJO,true);
	 public static final Cuadro BUS_3_ARRIBA= new Cuadro(Sprite.BUS_3_ARRIBA,true);
	 public static final Cuadro BUS_4_ABAJO= new Cuadro(Sprite.BUS_4_ABAJO,true);
	 public static final Cuadro BUS_4_ARRIBA= new Cuadro(Sprite.BUS_4_ARRIBA,true);
	 public static final Cuadro LINEA_FINAL= new Cuadro(Sprite.LINEA_FINAL);
	 public static final Cuadro ESQUINA_CHACR= new Cuadro(Sprite.ESQUINA_CHACR);
	 public static final Cuadro PINO_DERECHA_ABAJO= new Cuadro(Sprite.PINO_DERECHA_ABAJO,true);
	 public static final Cuadro PINO_DERECHA_ARRIBA= new Cuadro(Sprite.PINO_DERECHA_ARRIBA,true);
	 public static final Cuadro PINO_IZQUIERDA_ABAJO= new Cuadro(Sprite.PINO_IZQUIERDA_ABAJO,true);
	 public static final Cuadro PINO_IZQUIERDA_ARRIBA= new Cuadro(Sprite.PINO_IZQUIERDA_ARRIBA,true);
	 public static final Cuadro PINO_CENTRAL_DERECHA= new Cuadro(Sprite.PINO_CENTRAL_DERECHA,true);
	 public static final Cuadro PINO_CENTRAL_IZQUIERDA= new Cuadro(Sprite.PINO_CENTRAL_IZQUIERDA,true);
	 public static final Cuadro PINO_NEGRO_1= new Cuadro(Sprite.PINO_NEGRO_1,true);
	 public static final Cuadro PINO_NEGRO_2= new Cuadro(Sprite.PINO_NEGRO_2,true);
	 
	
	 
	 
	 
	 //fin de la coleccion
	 
	 public Cuadro(Sprite sprite){
		 this.sprite = sprite;
		 solido = false;
	 }
	 public Cuadro(Sprite sprite, boolean solido){
		 this.sprite = sprite;
		 this.solido = solido;
	 }
	 public void mostrar(int x, int y, Pantalla pantalla){
		 pantalla.mostrarCuadro(x << 5, y << 5, this);
		 
	 }
	 public boolean esSolido(){
		 return solido;
	 }
}