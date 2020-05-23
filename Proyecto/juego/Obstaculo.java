package juego;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;

import javax.swing.ImageIcon;

public class Obstaculo {
	//cosas de obstaculo
	Juego juego;
	
	Area hitbox, cuerpo;
	
	int anchoObstaculo=70;
	int altoObstaculo=70;
	
	//variables de ayuda para desplazamientos.
	static int x_inicial=1300;
	static int y_inicial=270;
	
	static int x_auxiliar=-6;
	
	//constructor
	public Obstaculo(Juego juego) {
		this.juego=juego;
	}
	
	public void mover() {
		
		if(x_inicial<=-100) {
			juego.puntos++;
			x_inicial=1300;
			if(juego.puntos%5==0) {// arreglado lo de los niveles, mamadismo a partir del 9
				x_auxiliar+=-2;
				juego.nivel++;
			}
		}else {
			
			//en caso de colision
			if(colision()) {
				if(juego.vidas==0) {
					juego.finJuego();
				}else {
					juego.pierdeVida();
				}
			}else {
				x_inicial+=x_auxiliar;
			}
		}
	}
	//pinta el obstaculo
	public void paint(Graphics2D g) {
		ImageIcon vegeta= new ImageIcon(getClass().getResource("/multimedia/pj.png"));
		g.drawImage(vegeta.getImage(),x_inicial,y_inicial,anchoObstaculo,altoObstaculo,null);
	
	}
	//pilla el area del obstaculo
	public Area getBounds() {
		Rectangle forma1 = new Rectangle(x_inicial+12,y_inicial+16,40,53); // hitbox arrglada
		cuerpo = new Area(forma1);
		hitbox=cuerpo;
		hitbox.add(cuerpo);
		return hitbox;
	}
	//metodo para colisionar.
	public boolean colision() {
		Area areaA= new Area(juego.personaje.getBounds());
		areaA.intersect(getBounds());
		
		return !areaA.isEmpty();
	}
}
