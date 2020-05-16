package general;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu_Principal {
	public static void main(final String[] args) {
		JFrame ventana = new JFrame("Menu Principal");
		ventana.setSize(600, 350);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiqueta = new JLabel("WELCOME TO THE JUNGLE");
		JButton boton = new JButton("JUGAR");
		JButton Fichero = new JButton("LISTA JUGADORES");
		boton.setBounds(200, 0, 200, 80);
		Fichero.setBounds(200, 120, 200, 80);
		etiqueta.setBounds(100, 220, 400, 100);
		boton.setForeground(Color.decode("#1D49BD"));
		boton.setBackground(Color.decode("#FCFF33"));
		Fichero.setForeground(Color.decode("#1D49BD"));
		Fichero.setBackground(Color.decode("#FCFF33"));
		etiqueta.setForeground(Color.decode("#FF33FC"));
		etiqueta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		boton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		Fichero.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		boton.setFocusable(false);
		Fichero.setFocusable(false);
		
		boton.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		Fichero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}

		});

		JPanel Panel = new JPanel();
		Panel.add(etiqueta);
		Panel.add(boton);
		Panel.add(Fichero);
		Panel.setLayout(null);
		Panel.setVisible(true);
		ventana.setContentPane(Panel);
		ventana.setVisible(true);
		Panel.setBackground(Color.decode("#080226"));
	}

}
