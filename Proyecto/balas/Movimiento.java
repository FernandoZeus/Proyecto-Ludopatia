package balas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Movimiento implements KeyListener {
	
	public static void main(String[] args) throws IOException {
		new Movimiento();
	}
	
	BufferedImage img;
	JLabel etiqueta1;
	int x, y;
	
	public Movimiento () throws IOException {
		
		JFrame ventana = new JFrame("Titulo de la ventana");
		ventana.setSize(800, 800);
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		img = ImageIO.read(ConImagen.class.getResource("/recursos/pj.png"));
		etiqueta1 = new JLabel(new ImageIcon(img));
		etiqueta1.setForeground(Color.BLUE);
		JPanel panelDeContenido = new JPanel();
		panelDeContenido.add(etiqueta1);
		panelDeContenido.setLayout(null);
		x = 100;
		y = 600;
		etiqueta1.setBounds(x, y, img.getHeight(), img.getHeight());
		ventana.setContentPane(panelDeContenido);
		ventana.addKeyListener(this);
		ventana.setVisible(true);
	}

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
			    r.x-=5;
				break;
			
			case 39:
				if(r.x==700) {
					break;
				}
				radianesRotación = Math.PI/2;
			    r.x+=5;
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
}
