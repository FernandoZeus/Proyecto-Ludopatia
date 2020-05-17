package juego;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;

public class Fondo {

	Juego juego;
	
	int anchoFondo=1300;
	int altoFondo=400;
	
	int x1=1300;
	int y1=0;
	 
	int x2=0;
	int y2=0;
	
	
	public Fondo(Juego juego) {
		this.juego=juego;
	}
	
	public void mover() {
		x1-=2;
		x2-=2;
		if(x1==0&& x2==-1300) {
			x1=1300;
			x2=0;
		}
	}
	
	public void paint(Graphics2D g) {
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/multimedia/fondo.png"));
		g.drawImage(imagenFondo.getImage(),x1,y1,anchoFondo,altoFondo,null);
		g.drawImage(imagenFondo.getImage(),x2,y2,anchoFondo,altoFondo,null);
	}
}
