package graficos;

public final class Sprite {
 private final int lado;
 
 private int x;
 private int y;

 public int[] pixeles;
 private  HojaSprites hoja;
 
 //coleccion de Sprites el jugador
 public static final Sprite ABAJO0 = new Sprite(32,0,0,0, HojaSprites.jugador);
 public static final Sprite ABAJO1 = new Sprite(32,0,1,0, HojaSprites.jugador);
 public static final Sprite ABAJO2 = new Sprite(32,0,2,0, HojaSprites.jugador);
 
 public static final Sprite ARRIBA0 = new Sprite(32,1,0,0, HojaSprites.jugador);
 public static final Sprite ARRIBA1 = new Sprite(32,1,1,0, HojaSprites.jugador);
 public static final Sprite ARRIBA2 = new Sprite(32,1,2,0, HojaSprites.jugador);
 
 public static final Sprite DERECHA0 = new Sprite(32,2,0,0, HojaSprites.jugador);
 public static final Sprite DERECHA1 = new Sprite(32,2,1,0, HojaSprites.jugador);
 public static final Sprite DERECHA2 = new Sprite(32,2,2,0, HojaSprites.jugador);
 
 public static final Sprite IZQUIERDA0 = new Sprite(32,3,0,0, HojaSprites.jugador);
 public static final Sprite IZQUIERDA1 = new Sprite(32,3,1,0, HojaSprites.jugador);
 public static final Sprite IZQUIERDA2 = new Sprite(32,3,2,0, HojaSprites.jugador);
 
 //fin de la coleccion 
 
 //Colección de Sprites del mapa desertico
 
 public static final Sprite VACIO = new Sprite(32, 0x000000);
 public static final Sprite ASFALTO = new Sprite(32, 0, 0, 0, HojaSprites.desierto);
 public static final Sprite ARENA = new Sprite(32, 2, 0,0, HojaSprites.desierto);
 public static final Sprite PASTO = new Sprite(32,0, 1, 0, HojaSprites.desierto);
 public static final Sprite BORDE_CARRETERA = new Sprite(32, 3, 0,0, HojaSprites.desierto);
 public static final Sprite BORDE_CARRETERA_DERECHA = new Sprite(32, 3, 0,1, HojaSprites.desierto);
 public static final Sprite BORDE_CARRETERA_SUPERIOR= new Sprite(32, 3, 0,5, HojaSprites.desierto);
 public static final Sprite CENTRO_CARRETERA = new Sprite(32, 3, 1, 0, HojaSprites.desierto);
 public static final Sprite CENTRO_CARRETERA_DERECHA = new Sprite(32, 3, 1, 5, HojaSprites.desierto);
 public static final Sprite ESQUINA_CARRETERA = new Sprite(32, 2, 1,0, HojaSprites.desierto);
 public static final Sprite PARED_PIEDRA = new Sprite(32, 6, 0,0, HojaSprites.desierto);
 public static final Sprite PIEDRA_CAMINO = new Sprite(32, 1, 0,0, HojaSprites.desierto);
 public static final Sprite MURO = new Sprite(32, 5, 0,0, HojaSprites.desierto);
 public static final Sprite MURO_CENTRO = new Sprite(32, 4, 0,0, HojaSprites.desierto);
 public static final Sprite COLUMNA = new Sprite(32, 4, 1,0, HojaSprites.desierto);
 public static final Sprite REJA = new Sprite(32, 6, 2,0, HojaSprites.desierto);
 public static final Sprite CASETA_SUPERIOR_IZQUIERDA = new Sprite(32, 7, 0,0, HojaSprites.desierto);
 public static final Sprite CASETA_INFERIOR_IZQUIERDA = new Sprite(32, 7, 1,0, HojaSprites.desierto);
 public static final Sprite CASETA_CENTRO_SUPERIOR = new Sprite(32,8, 0,0, HojaSprites.desierto);
 public static final Sprite PARED_SUPERIOR_IZQUIERDA = new Sprite(32,5, 1,0, HojaSprites.desierto);
 public static final Sprite PARED_INFERIOR_IZQUIERDA = new Sprite(32,6, 1,0, HojaSprites.desierto);
 public static final Sprite CASETA_CENTRO_INFERIOR = new Sprite(32,8, 1,0, HojaSprites.desierto);
 public static final Sprite CASETA_SUPERIOR_DERECHA = new Sprite(32,9, 0,0, HojaSprites.desierto);
 public static final Sprite CASETA_INFERIOR_DERECHA = new Sprite(32,7, 1,1, HojaSprites.desierto);
 public static final Sprite PARED_SUPERIOR_DERECHA = new Sprite(32,5, 1,1, HojaSprites.desierto);
 public static final Sprite PARED_INFERIOR_DERECHA = new Sprite(32,6, 1,1, HojaSprites.desierto);
 public static final Sprite LINEAS = new Sprite(32, 1, 1,0, HojaSprites.desierto);
 public static final Sprite CHACRA = new Sprite(32, 2, 3,0, HojaSprites.desierto);
 public static final Sprite CHACRA_SUPERIOR = new Sprite(32, 2, 2,0, HojaSprites.desierto);
 public static final Sprite CHACRA_INFERIOR= new Sprite(32, 2, 4,0, HojaSprites.desierto);
 public static final Sprite CHACRA_ESQUINA_DERECHA= new Sprite(32, 4, 2,0, HojaSprites.desierto);
 public static final Sprite CHACRA_ESQUINA_DERECHA_ABAJO= new Sprite(32, 4, 4,0, HojaSprites.desierto);
 public static final Sprite ESQUINA_CARRETERA_SUPE= new Sprite(32, 1, 2,0, HojaSprites.desierto);
 public static final Sprite ESQUINA_CARRETERA_INFE= new Sprite(32, 1, 3,0, HojaSprites.desierto);
 public static final Sprite ESQUINA_CARRETERA_SUPE_XD= new Sprite(32, 1, 4,0, HojaSprites.desierto);
 public static final Sprite ESQUINA_CARRETERA_INFE_XD= new Sprite(32, 2, 5,0, HojaSprites.desierto);
 public static final Sprite CHACRA_LINEAL_DERECHA= new Sprite(32, 4, 3,0, HojaSprites.desierto);
 public static final Sprite CAMINO = new Sprite(32, 5, 2,0, HojaSprites.desierto);
 public static final Sprite LINEA_CHACRA = new Sprite(32, 3, 3,0, HojaSprites.desierto);
 public static final Sprite ARBOL_SUPERIOR_FRONTAL= new Sprite(32, 5, 5,0, HojaSprites.desierto);
 public static final Sprite ARBOL_SUPERIOR_FRONTAL_LINEAL= new Sprite(32, 6, 5,0, HojaSprites.desierto);
 public static final Sprite ARBOL_SUPERIOR_DERECHA= new Sprite(32, 5, 3,0, HojaSprites.desierto);
 public static final Sprite ARBOL_INFERIOR_DERECHA= new Sprite(32, 5, 4,0, HojaSprites.desierto);
 public static final Sprite ARBOL_SUPERIOR_IZQUIERDA= new Sprite(32, 6, 3,0, HojaSprites.desierto);
 public static final Sprite ARBOL_INFERIOR_EZQUIERDA= new Sprite(32, 6, 4,0, HojaSprites.desierto);
 public static final Sprite TIERRA= new Sprite(32, 7, 3,0, HojaSprites.desierto);
 public static final Sprite RECTA= new Sprite(32, 7, 5,0, HojaSprites.desierto);
 public static final Sprite BUS_1_ABAJO= new Sprite(32, 1, 7,0, HojaSprites.desierto);
 public static final Sprite BUS_1_ARRIBA= new Sprite(32, 1, 6,0, HojaSprites.desierto);
 public static final Sprite BUS_2_ABAJO= new Sprite(32, 2, 7,0, HojaSprites.desierto);
 public static final Sprite BUS_2_ARRIBA= new Sprite(32, 2, 6,0, HojaSprites.desierto);
 public static final Sprite BUS_3_ABAJO= new Sprite(32, 3, 7,0, HojaSprites.desierto);
 public static final Sprite BUS_3_ARRIBA= new Sprite(32, 3, 6,0, HojaSprites.desierto);
 public static final Sprite BUS_4_ABAJO= new Sprite(32, 4, 7,0, HojaSprites.desierto);
 public static final Sprite BUS_4_ARRIBA= new Sprite(32, 4, 6,0, HojaSprites.desierto);
 public static final Sprite LINEA_FINAL= new Sprite(32, 7, 2,0, HojaSprites.desierto);
 public static final Sprite ESQUINA_CHACR= new Sprite(32, 3, 2,0, HojaSprites.desierto);
 public static final Sprite PINO_DERECHA_ABAJO= new Sprite(32, 8, 6,0, HojaSprites.desierto);
 public static final Sprite PINO_DERECHA_ARRIBA= new Sprite(32, 8, 5,0, HojaSprites.desierto);
 public static final Sprite PINO_IZQUIERDA_ABAJO= new Sprite(32, 9, 6,0, HojaSprites.desierto);
 public static final Sprite PINO_IZQUIERDA_ARRIBA= new Sprite(32, 9, 5,0, HojaSprites.desierto);
 public static final Sprite PINO_CENTRAL_DERECHA= new Sprite(32, 8, 4,0, HojaSprites.desierto);
 public static final Sprite PINO_CENTRAL_IZQUIERDA= new Sprite(32, 9, 4,0, HojaSprites.desierto);
 public static final Sprite PINO_NEGRO_1= new Sprite(32, 8, 3,0, HojaSprites.desierto);
 public static final Sprite PINO_NEGRO_2=  new Sprite(32, 9, 3,0, HojaSprites.desierto);
 
 
 
 
 //Fin de la Colección
 
 
 public Sprite(final int lado, final int columna, final int fila,final int version, final HojaSprites hoja)
 {
	 this.lado = lado;
	 pixeles = new int[lado * lado];
	 
	 this.x = columna * lado;
	 this.y = fila * lado;
	 this.hoja = hoja;
	 cargarSprite(version);

 }
 
 public Sprite(final int lado, final int color){
	 this.lado = lado;
	 pixeles = new int [lado * lado];
	 
	 for (int i = 0; i < pixeles.length; i++) {
		 pixeles[i] = color; 
	 }
 }
 public int obtenLado() {
	 return lado;
 }
 
 private void cargarSprite(int version){
	 if(version == 0){
		 cargaNormal();
	 }else{
		 cargaManipulada(version);
		 
	 }
 }
 private void cargaNormal(){
	 for (int y = 0; y < lado; y++) {
		 for (int x =0; x < lado; x++ ) {
		 
	pixeles[x + y * lado] = hoja.pixeles[(x + this.x)
		                                    + (y + this.y) * hoja.obtenAncho()];
		 }
	 }
	 
 }
 private void cargaManipulada(int version){
	 int[] pixelesTemporales = iniciarPixelesTemporales();
	 
	 switch(version){
	 case 1:
		 invertirX(pixelesTemporales);
		 break;
	 case 2:
		 invertirY(pixelesTemporales);
		 break;
	 case 3:
		 invertirXY(pixelesTemporales);
		 break;
	 case 4:
		 rotar90I(pixelesTemporales);
		 break;
	 case 5:
		 rotar90D(pixelesTemporales);
		 break;
	 case 6:
		 rotarI90InvertidoY(pixelesTemporales);
		 break;
	 case 7:
		 rotarD90InvertidoY(pixelesTemporales);
		 break;
		 
	 default :
		 cargaNormal();
		 }
 }
 private int[] iniciarPixelesTemporales(){
	 int[] pixelesTemporales = new int [lado * lado];
	 
	 for (int y = 0; y < lado; y++) {
		 for (int x =0; x < lado; x++ ) {
		 
	pixelesTemporales[x + y * lado] = hoja.pixeles[(x + this.x)
		                                    + (y + this.y) * hoja.obtenAncho()];
		 }
	 }
	 return pixelesTemporales;
 }
 
     //1
 private void invertirX(int[] pixelesTemporales){
	 int i = 0;
	 for (int y = 0; y < lado; y++){
		 for ( int x = lado -1; x > -1; x--){
			 pixeles[i] = pixelesTemporales[x + y * lado];
			 i++;
		 }
	 }
	 	 }
//2
 private void invertirY(int[] pixelesTemporales){
	 
	 int i = 0;
	 for (int y = lado -1; y < -1; y--){
		 for ( int x = 0; x < lado; x++){
			 pixeles[i] = pixelesTemporales[x + y * lado];
			 i++;
		 }
	 }
	 
	 }
//3
 private void invertirXY(int[] pixelesTemporales){
	 for (int i = 0; i < pixeles.length; i++){
		 pixeles[i] = pixelesTemporales[pixelesTemporales.length - 1 - i];
		 
	 }
	 }
 //4
 private void rotar90I(int[] pixelesTemporales){
	 int i = 0;
	 for (int x = lado - 1; x > - 1; x++){
		 for ( int y = 0; y < lado -1; y++){
			 pixeles[i] = pixelesTemporales[x + y * lado];
			 i++;
		 }
	 }
 }
 //5
 private void rotar90D(int[] pixelesTemporales){
	 int i = 0;
	 for (int x = 0; x < lado ; x++){
		 for ( int y = lado - 1; y > -1 ; y--){
			 pixeles[i] = pixelesTemporales[x + y * lado];
			 i++;
		 }
	 }
	 }
 //6
 private void rotarI90InvertidoY(int[] pixelesTemporales){
	 int i = 0;
	 for (int x = 0; x < lado ; x++){
		 for ( int y = 0; y < lado ; y++){
			 pixeles[i] = pixelesTemporales[x + y * lado];
			 i++;
		 }
	 }
	 }
 //7
 private void rotarD90InvertidoY (int[] pixelesTemporales) {
	 int i = 0;
	 for (int x = lado -1; x > - 1 ; x--){
		 for ( int y = lado - 1; y > -1; y--){
			 pixeles[i] = pixelesTemporales[x + y * lado];
			 i++;
		 }
	 }
	 
 }
}