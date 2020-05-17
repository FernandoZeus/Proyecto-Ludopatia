package juego;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;

import javax.swing.ImageIcon;

public class Obstaculo {

	Juego juego;
	
	Area hitbox,cuerpo;
	
	int anchoObstaculo=70;
	int altoObstaculo=70;
	
	static int x_inicial=1300;
	static int y_inicial=270;
	
	static int x_auxiliar=-6;
	
	public Obstaculo(Juego juego) {
		this.juego=juego;
	}
	
	public void mover() {
		if(x_inicial<=-100) {
			juego.puntos++;
			x_inicial=1300;
			if(juego.puntos==3 | juego.puntos==6 | juego.puntos==9 | juego.puntos==12) {
				x_auxiliar+=-2;
				juego.nivel++;
			}
		}else {
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
	
	public void paint(Graphics2D g) {
		ImageIcon animal= new ImageIcon(getClass().getResource("/multimedia/pj.png"));
		g.drawImage(animal.getImage(),x_inicial,y_inicial,anchoObstaculo,altoObstaculo,null);
	
	}
	
	public Area getBounds() {
		Rectangle forma1 = new Rectangle(x_inicial+12,y_inicial+16,50,53);
		cuerpo = new Area(forma1);
		hitbox=cuerpo;
		hitbox.add(cuerpo);
		return hitbox;
	}
	
	public boolean colision() {
		Area areaA= new Area(juego.personaje.getBounds());
		areaA.intersect(getBounds());
		
		return !areaA.isEmpty();
	}
}
