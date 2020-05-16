package general;


import java.awt.Color;

import javax.print.DocFlavor.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


public class CampoDJuego extends JPanel {

		
	public CampoDJuego() {
		//creación de ventana
		JFrame ventana = new JFrame("Juego");
		ventana.setSize(1024,1024 );
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		//creación de Jlabel que contenga la imagen
		JLabel imagenDeFondo = new JLabel(new ImageIcon(CampoDJuego.class.getResource("/recursos/fondo.png")));
		imagenDeFondo.setBounds(48,48,45,56);
		//Contenedor que tenga todo
		JPanel panelDeContenido = new JPanel();
		panelDeContenido.add(imagenDeFondo);
		ventana.setContentPane(panelDeContenido);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampoDJuego f = new CampoDJuego();
		
		
	}

}
