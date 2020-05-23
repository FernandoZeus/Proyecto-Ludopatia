package juego;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.JPanel;

public class Juego extends JPanel{

	//sonido del juego
	URL direccionSonidoSalto,direccionSonidoChoque;
	AudioClip sonidoChoque,sonidoSalto;
	
	//objetos de las otras clases
	Personaje personaje = new Personaje(this);
	Obstaculo obstaculo = new Obstaculo(this);
	Fondo fondo = new Fondo(this);
	
	//variables para el juego
	
	public static boolean juegoFinalizado=false;
	public static boolean pierdeVida= false;
	public static int vidas=3;
	public static int puntos=0;
	public static int nivel=1;
	
	//constructor
	public Juego() {
		//atributos para los sonidos
		//cuando te chocas
		direccionSonidoChoque=getClass().getResource("/multimedia/choque.wav");
		sonidoChoque = Applet.newAudioClip(direccionSonidoChoque);
		//cuando saltas
		direccionSonidoSalto=getClass().getResource("/multimedia/salto.wav");
		sonidoSalto = Applet.newAudioClip(direccionSonidoSalto);
		
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			//cuando pulsas el space
			@Override
			public void  keyPressed(KeyEvent e) {
				//salto activado
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					sonidoSalto.play();
					personaje.keyPressed(e);
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
	setFocusable(true);
		
	}
	
	//metodo para mover las cosas
	public void mover() {
		obstaculo.mover();
		personaje.mover();
		fondo.mover();
	}
	
	//metodo para pintar
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		dibujar(g2);
		dibujarPuntaje(g2);
	}
	
	//metodo para dibujar
	public void dibujar(Graphics2D g) {
		fondo.paint(g);
		personaje.paint(g);
		obstaculo.paint(g);
		mover();
	}
	
	//aqui mostramos los puntos
	public void dibujarPuntaje(Graphics2D g) {
		Graphics2D g1=g, g2=g;
		Font score = new Font("Arial",Font.BOLD,30);
		g.setFont(score);
		g.setColor(Color.yellow);
		g1.drawString("Puntos: "+ puntos,1100,30);
		g1.drawString("Vidas: "+ vidas,20,30);
		g1.drawString("Nivel: "+ nivel,570,30);
		
		if(juegoFinalizado) {
			g2.setColor(Color.red);
			g2.drawString("has perdido",((float)getBounds().getCenterX()/2)+170,70);
		}
	}
	
	//fin 
	public void finJuego() {
		juegoFinalizado=true;
		sonidoChoque.play();
	}
	
	//menos vida
	public void pierdeVida() {
		sonidoChoque.play();
		pierdeVida=true;
	}
	
}
