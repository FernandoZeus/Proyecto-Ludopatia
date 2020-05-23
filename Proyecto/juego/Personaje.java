package juego;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;

import javax.swing.ImageIcon;

public class Personaje {

	//cosas
	Juego juego;
	
	static boolean saltando = false;
	boolean sube = false;
	boolean baja = false;
	
	Area persona,hitbox ;
	
	int anchoPersonaje = 112;
	int altoPersonaje = 78;
	
	//variables auxiliares
	static int x_inicial=50;
	static int y_inicial=270;
	
	int x_auxiliar=0;
	int y_auxiliar=0;
	
	//constructor
	public Personaje(Juego juego) {
		this.juego = juego;
	}
	
	
	//metodo 
	public void mover() {
		if(x_inicial + x_auxiliar>0&& x_inicial + x_auxiliar<juego.getWidth()-anchoPersonaje){
			x_inicial+=x_auxiliar;
		}
		if(saltando) {
			if(y_inicial==270) { //si vegeta esta en el suelo
				sube = true;
				y_auxiliar=-4;
				baja=false;
			}
			if(y_inicial==150) {//limite del salto
				baja=true;
				y_auxiliar=4;
				sube=false;
			}
			
			if(sube) {
				y_inicial+=y_auxiliar;	//cuando salta
			}
			
			if(baja) {
				y_inicial+=y_auxiliar;
				if(y_inicial==270) { // si llega al suelo
					saltando=false;
				}
			}
		}
	}
	//pinta
	public void paint(Graphics2D g ) {
		ImageIcon personaje = new ImageIcon(getClass().getResource("/multimedia/main.png"));
		g.drawImage(personaje.getImage(),x_inicial,y_inicial,anchoPersonaje,altoPersonaje,null);;
	}
	//evento del espacio, si saltas
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			saltando = true;
		}
		
	}
	//pilla el area
	public Area getBounds() {
		Rectangle forma1 = new Rectangle(x_inicial,y_inicial,95,62);
		persona = new Area(forma1);
		hitbox=persona;
		hitbox.add(persona);
		return hitbox;
	}
}
