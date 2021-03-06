package entes.criaturas;

import control.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;

public class Jugador extends Criatura {
	
	private Teclado teclado;
	private int animacion;
	
	
    public 	Jugador(Mapa mapa,Teclado teclado, Sprite sprite){
    	this.mapa = mapa;
    	this.teclado = teclado;
    	this.sprite = sprite;
    	}
    public Jugador (Mapa mapa,Teclado teclado,Sprite sprite, int posicionX, int posicionY){
    	this.mapa = mapa;
    	this.teclado = teclado;
    	this.sprite = sprite;
    	this.x = posicionX;
    	this.y = posicionY;
    }
    public void actualizar(){
    	
    	int desplazamientoX = 0;
    	int desplazamientoY = 0;
    	if(animacion< 32767){
    		animacion++;
    	}else{
    		animacion = 0;
    	}
    	
    	if (teclado.arriba){
    		desplazamientoY--;
    		
    	}
    	if (teclado.abajo) {
    		desplazamientoY++;;
    		
    	}
    	if(teclado.izquierda) {
    		desplazamientoX--;
    	}
    	if(teclado.derecha){
    		desplazamientoX++;
    	}
    	if(desplazamientoX != 0 || desplazamientoY != 0){
    		mover(desplazamientoX,desplazamientoY);
    		enMovimiento = true;
    	}else {
    		enMovimiento = false;
    	}
    	if(direccion == 'n'){
			sprite = sprite.ARRIBA0;
			if(enMovimiento){
				if(animacion % 30 > 15){
					sprite = Sprite.ARRIBA1;
				}else{
					sprite = Sprite.ARRIBA2;
				}
			}
		}
		if(direccion == 's' ){
			sprite = sprite.ABAJO0;
			if(enMovimiento){
				if(animacion % 30 > 15){
					sprite = Sprite.ABAJO1;
				}else{
					sprite = Sprite.ABAJO2;
				}
			}
		}
		if(direccion == 'o') {
			sprite = Sprite.IZQUIERDA0;
			sprite = sprite.IZQUIERDA0;
			if(enMovimiento){
				if(animacion % 30 > 15){
					sprite = Sprite.IZQUIERDA1;
				}else{
					sprite = Sprite.IZQUIERDA2;
				}
			}
		}
		if(direccion == 'e'){
			sprite = Sprite.DERECHA0;
			sprite = sprite.DERECHA0;
			if(enMovimiento){
				if(animacion % 30 > 15){
					sprite = Sprite.DERECHA1;
				}else{
					sprite = Sprite.DERECHA2;
				}
			}
		}
		
	}
    
    public void mostrar(Pantalla pantalla){
    	pantalla.mostrarJugador(x, y, this);
    	
    }
    
}
