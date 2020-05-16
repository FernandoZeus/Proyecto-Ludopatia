package balas;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Balas extends JPanel {
	
	//Bala Balita;
	ArrayList<Bala> balitas= new ArrayList<Bala>();
	public Balas() {
		//this.Balita=new Bala(200);
	}
	
	public static void main(final String[] args) throws InterruptedException {
		JFrame ventana = new JFrame("Titulo de la ventana");
		ventana.setSize(500, 720);
		ventana.setVisible(true);
		Balas Balass=new Balas();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(Balass);
		Balass.crearBalas(5);
		
		
	
		while(true) {
			ventana.repaint();
			Balass.repaint();
			Thread.sleep(10);
		}
		
	
	}
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		for(Bala a :balitas) {
			a.pintarBala(g);
		}
	}
	public void crearBalas(int cantidad) {
		for(int i=0;i<cantidad;i++) {
			this.balitas.add(new Bala());
		}
	}
}
