package balas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class muñecoBalas extends JPanel {

	private static final long serialVersionUID = 1L;
	ArrayList<Bala> balitas = new ArrayList<Bala>();

	public static void main(final String[] args) throws InterruptedException, IOException {
			BufferedImage img;
			JLabel etiqueta1;
			int x, y;
			
		JFrame ventana = new JFrame("Titulo de la ventana");
		ventana.setSize(800, 900);
		ventana.setVisible(true);
		muñecoBalas Balass= new muñecoBalas(); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(Balass);
		Balass.crearBalas(5);
		img = ImageIO.read(ConImagen.class.getResource("/recursos/pj.png"));
		etiqueta1 = new JLabel(new ImageIcon(img));
		etiqueta1.setForeground(Color.BLUE);
		x = 100;
		y = 600;
		etiqueta1.setBounds(x, y, 10, 10);
		ventana.add(etiqueta1);
		ventana.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int k = arg0.getKeyCode();
				Rectangle r = etiqueta1.getBounds();
				double radianesRotación = 0;
				// Códigos: 37,38,39,40
				
				switch(k) {
					case 37:
						if(r.x==-10) {
							break;
						}
						radianesRotación = -Math.PI/2;
					    r.x-=10;
						break;
					
					case 39:
						if(r.x==700) {
							break;
						}
						radianesRotación = Math.PI/2;
					    r.x+=10;
						break;
				}
				
				etiqueta1.setBounds(r);
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		while(true) {
			ventana.repaint();
			Balass.repaint();
			Thread.sleep(10);
		}
	
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Bala a : balitas) {
			a.pintarBala(g);
		}
	}

	public void crearBalas(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			this.balitas.add(new Bala());
		}
	}
	
}
