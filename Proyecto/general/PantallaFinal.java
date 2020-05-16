package general;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PantallaFinal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame ventana = new JFrame("pantalla final");
		ventana.setSize(800, 600);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
		          // Pedir confirmación antes de cerrar el programa
				int option = JOptionPane.showConfirmDialog(ventana,"¿Estás seguro de que quieres cerrar la aplicación?","Confirmación de cierre", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
					if (option == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
			}
		});
		
		JButton boton = new JButton(" VOLVER AL MENU PRINCIPAL");
		boton.setBounds(250, 200, 500, 150);
		boton.setForeground(Color.decode("#1D49BD"));
		boton.setBackground(Color.decode("#FCFF33"));
		boton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		boton.setFocusable(false);
		
		JTextField titulo = new JTextField(" ¡ ¡  HAS PERDIDO ! !",50);
		titulo.setForeground(Color.decode("#1D49BD"));
		titulo.setBackground(Color.decode("#FCFF33"));
		titulo.setBounds(425,100,140,40);
		
		JPanel Panel = new JPanel();
		Panel.add(boton);
		Panel.setLayout(null);
		Panel.setVisible(true);
		Panel.add(titulo);
		ventana.setContentPane(Panel);
		ventana.setVisible(true);
		Panel.setBackground(Color.decode("#080226"));
		
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new MenuPrincipal();
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		
	}
}




