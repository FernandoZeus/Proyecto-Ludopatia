package balas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Bala {
	int posX, posY, tam;
	public Bala(int posX) {
		this.posX=posX;
		this.posY=0;
		this.tam=10;
		
	}
	public Bala() {
		this.posX=(int)(Math.random()*480);
		this.posY=0;
		this.tam=5;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	public void moverBala() {
		this.posY=this.posY+1;
		
	}
	public void pintarBala(Graphics g) {
		this.moverBala();
		g.drawOval(posX,posY,tam,tam);
		
	
	}
}
