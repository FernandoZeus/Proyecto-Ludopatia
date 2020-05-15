package general;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CampoJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creación de ventana
		JFrame ventana = new JFrame("Juego");
		ventana.setSize(1000, 1000);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		//creación de Jlabel que contenga la imagen
		JLabel imagenDeFondo = new JLabel(new ImageIcon(CampoJuego.class.getResource("/recursos/dos.gif")));
		imagenDeFondo.setBorder(BorderFactory.createLineBorder(Color.RED));
	
	
		//Contenedor que tenga todo
		JPanel panelDeContenido = new JPanel();
		panelDeContenido.add(imagenDeFondo);
		ventana.setContentPane(panelDeContenido);
		
	}

}
