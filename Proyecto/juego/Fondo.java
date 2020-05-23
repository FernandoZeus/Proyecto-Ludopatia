package juego;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;

public class Fondo {
	//atributos
	Juego juego;
	
	int anchoFondo=1300;
	int altoFondo=400;
	
	//variables para la ayuda del desplazamiento
	int x1=1300;
	int y1=0;
	 
	int x2=0;
	int y2=0;
	
	//constructor
	public Fondo(Juego juego) {
		this.juego=juego;
	}
	//desplazamiento de derecha a izquierda
	public void mover() {
		x1-=2;
		x2-=2;
		if(x1==0&& x2==-1300) {
			x1=1300;
			x2=0;
		}
	}
	//pinta el fondo
	public void paint(Graphics2D g) {
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/multimedia/fondo.png"));
		g.drawImage(imagenFondo.getImage(),x1,y1,anchoFondo,altoFondo,null);
		g.drawImage(imagenFondo.getImage(),x2,y2,anchoFondo,altoFondo,null);
	}
}
