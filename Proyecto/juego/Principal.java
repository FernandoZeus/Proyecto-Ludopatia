package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Principal {

	//muchos atributos
	public static int reiniciaJuego = -1;
	public static JFrame ventanaPrincipal;
	public static JLabel etiqueta;
	public static JButton boton;
	public static JLabel tablaJugador;
	public static JButton botonFichero;
	public static JFrame ventana;
	public static boolean juegoIniciado = false;

	//main
	public static void main(String[] args) throws InterruptedException {

		menuPrincipal();
		juego();
	}

	//aqui creamos el menu principal 
	public static void menuPrincipal() throws InterruptedException {

		ventanaPrincipal = new JFrame("Menu Principal");
		ventanaPrincipal.setSize(600, 900);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setLocationRelativeTo(null);
		
		String htmlJugadores = "<html><H2 style=\"text-align:center; color: #FF33FC; font-size: 1em; text-decoration: underline;\">JUGADORES</H2><div style=\"text-align:center;\">";
		
		//crear jugadores
		try {
			FileReader archivo = new FileReader("Nombres.txt");
			
			BufferedReader br = new BufferedReader(archivo);
			
			String lineaActual = "";
			
			//printar jugadores antiguos
			while((lineaActual = br.readLine()) != null) { 
				htmlJugadores  += "<p>" + lineaActual + "</p>" ;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo de jugadores.");
		} catch (IOException e) {
			System.out.println("Error en contenido del fichero.");
		}
		//listar jugadores
		htmlJugadores += "</div></html>";
		
		tablaJugador = new JLabel(htmlJugadores);
		tablaJugador.setBounds(232,250,400,500);
		tablaJugador.setForeground(Color.decode("#FCFF33"));
		tablaJugador.setBackground(Color.decode("#080226"));
		tablaJugador.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		tablaJugador.setOpaque(true);
		
		//scroll a los jugadores
		JScrollPane scroller = new JScrollPane(tablaJugador, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.setBounds(232,280,150,500);
		scroller.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));;
		scroller.setBorder(BorderFactory.createEmptyBorder());
		
		//titulo
		etiqueta = new JLabel("WELCOME TO THE JUNGLE");
		etiqueta.setBounds(55, 30, 500, 100);
		etiqueta.setForeground(Color.decode("#FF33FC"));
		etiqueta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

		//boton de jugar
		boton = new JButton("JUGAR");
		boton.setBounds(200, 130, 200, 80);
		boton.setForeground(Color.decode("#1D49BD"));
		boton.setBackground(Color.decode("#FCFF33"));
		boton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		boton.setFocusable(false);

		//cosas del panel
		JPanel panel = new JPanel();
		panel.add(etiqueta);
		panel.add(boton);
		panel.add(scroller);
		panel.setLayout(null);
		panel.setVisible(true);
		ventanaPrincipal.setContentPane(panel);
		ventanaPrincipal.setVisible(true);
		panel.setBackground(Color.decode("#080226"));

		boton.addActionListener(new ActionListener() {
			//cuando pulsas el boton jugar
			@Override
			public void actionPerformed(ActionEvent arg0) {

				//abrimos otra pestaña para introducir el nombre
				JFrame VentanaPequeña = new JFrame("Nombre");

				//tamaño ventana
				VentanaPequeña.setSize(300, 200);
				VentanaPequeña.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				VentanaPequeña.setVisible(true);
				VentanaPequeña.setLocationRelativeTo(null);

				//introducimos nombre
				JLabel nombre = new JLabel("Ingresa nombre de jugador");
				JTextField campoDeTexto = new JTextField(20);
				campoDeTexto.setDocument(new JTextFieldLimit(12));
				JButton botonAceptar = new JButton("Aceptar");
				
				//personalizacion del boton
				botonAceptar.setForeground(Color.decode("#1D49BD"));
				botonAceptar.setBackground(Color.decode("#FCFF33"));

				//panel
				JPanel panelDeContenido = new JPanel();
				panelDeContenido.add(nombre);
				panelDeContenido.add(campoDeTexto);
				panelDeContenido.add(botonAceptar);

				VentanaPequeña.setContentPane(panelDeContenido);

				panelDeContenido.setBackground(Color.decode("#080226"));
				nombre.setForeground(Color.decode("#FF33FC"));
				botonAceptar.addActionListener(new ActionListener() {
					//cuando pulsas el boton de aceptar
					@Override
					public void actionPerformed(ActionEvent arg0) {
						//guarda el usuario
						LinkedList<String> nombres = new LinkedList<String>();
						if (arg0.getActionCommand().equals("Aceptar")) {
							guardarUsuario(campoDeTexto, VentanaPequeña);
						}
					}
				});
			}
		});
	}

	//metodo para guardar printado al usuario.
	public static void guardarUsuario(JTextField campoDeTexto, JFrame ventanaPequenia) {
		LinkedList<String> nombres = new LinkedList<String>();

		String nombreJugador;

		nombreJugador = campoDeTexto.getText();
		nombres.push(nombreJugador);
		//crear archivo con el nombre.
		try {
			FileWriter texto = new FileWriter("Nombres.txt",true);
            BufferedWriter bw = new BufferedWriter(texto);
            bw.write(nombreJugador + "\n");
            bw.close();
            texto.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//valor importante sin el que se buguea.
		juegoIniciado = true;
		
		
		ventanaPequenia.dispose();
		ventanaPrincipal.dispose();
	}

	//metodo del juego 
	public static void juego() throws InterruptedException {
		//necesario
		while (!juegoIniciado) {
			Thread.sleep(1000);
		}
		
		//crear ventana
		JFrame ventana = new JFrame("Juego");
		Juego juego = new Juego();
		ventana.add(juego);
		ventana.setSize(1300, 400);
		ventana.setLocation(70, 200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			//si pierdes
			if (Juego.juegoFinalizado) {
				reiniciaJuego = JOptionPane.showConfirmDialog(null, "�Quieres volver a jugar?", "Has perdido.",
						JOptionPane.YES_NO_OPTION);
				//si le das a volver a jugar
				if (reiniciaJuego == 0) {
					reiniciaValores();
					//si no le das
				} else if (reiniciaJuego == 1) {
					System.exit(0);
				}
				//si sigues vivo
			} else {
				juego.repaint();
				Thread.sleep(10);
					//cuando pierdes vida
				if (Juego.pierdeVida == true) {
					JOptionPane.showMessageDialog(null, "Has perdido una vida.");
					Juego.pierdeVida = false;
					Juego.vidas--;
					Personaje.y_inicial = 270;
					Personaje.saltando = false;
					Obstaculo.x_inicial = 1300;
				}
			}
		}
	}
	//metodo para reiniciar los valores en caso de que mueras 3 veces.
	public static void reiniciaValores() {

		Juego.juegoFinalizado = false;
		Obstaculo.x_auxiliar = -4;
		Juego.puntos = 0;
		Juego.nivel = 1;
		Juego.vidas = 3;
		reiniciaJuego = -1;
		Obstaculo.x_inicial = 1300;
	}
}
