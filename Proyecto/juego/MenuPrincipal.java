package juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MenuPrincipal {
	
	private JFrame ventanaPrincipal;
	private JLabel etiqueta;
	private JButton boton;
	private JButton botonFichero;
	public static int reiniciaJuego=-1;
	
	public boolean MenuPrincipal() {
		
		ventanaPrincipal = new JFrame("Menu Principal");
		ventanaPrincipal.setSize(600, 900);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setLocationRelativeTo(null);
		
		etiqueta = new JLabel("WELCOME TO THE JUNGLE");
		etiqueta.setBounds(100, 750, 400, 100);
		etiqueta.setForeground(Color.decode("#FF33FC"));
		etiqueta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		
		//botonFichero = new JButton("LISTA JUGADORES");
		//botonFichero.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		//botonFichero.setBounds(200, 160, 200, 80);
		//botonFichero.setForeground(Color.decode("#1D49BD"));
		//botonFichero.setBackground(Color.decode("#FCFF33"));
		//botonFichero.setFocusable(false);
		
		boton = new JButton("JUGAR");
		boton.setBounds(200, 30, 200, 80);
		boton.setForeground(Color.decode("#1D49BD"));
		boton.setBackground(Color.decode("#FCFF33"));
		boton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		boton.setFocusable(false);
		
		JPanel Panel = new JPanel();
		Panel.add(etiqueta);
		Panel.add(boton);
		//Panel.add(botonFichero);
		Panel.setLayout(null);
		Panel.setVisible(true);
		ventanaPrincipal.setContentPane(Panel);
		ventanaPrincipal.setVisible(true);
		Panel.setBackground(Color.decode("#080226"));
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame VentanaPequeña = new JFrame("Nombre");
				
				VentanaPequeña.setSize(300, 200);
				VentanaPequeña.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				VentanaPequeña.setVisible(true);
				VentanaPequeña.setLocationRelativeTo(null);
				
				JLabel nombre = new JLabel("Ingresa nombre de jugador");
				JTextField campoDeTexto = new JTextField(20);
				JButton botonAceptar = new JButton("Aceptar");
				
				botonAceptar.setForeground(Color.decode("#1D49BD"));
				botonAceptar.setBackground(Color.decode("#FCFF33"));
				
				JPanel panelDeContenido = new JPanel();
				panelDeContenido.add(nombre);
				panelDeContenido.add(campoDeTexto);
				panelDeContenido.add(botonAceptar);
				
				VentanaPequeña.setContentPane(panelDeContenido);
				
				panelDeContenido.setBackground(Color.decode("#080226"));
				nombre.setForeground(Color.decode("#FF33FC"));
				
				
			       
				botonAceptar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						LinkedList<String>nombres = new LinkedList<String>();
						
						String nombreJugador;
						
						nombreJugador = campoDeTexto.getText();
						nombres.push(nombreJugador);
						
						try {
							FileWriter texto = new FileWriter("Nombres.txt");
							texto.write(nombreJugador);
							texto.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						
						VentanaPequeña.dispose();
						ventanaPrincipal.dispose();
					}
				});
			}
		});
		return true;

		}
			public void juego() throws InterruptedException {
				
				
				JFrame ventana = new JFrame("juego");
				Juego juego = new Juego();
				ventana.add(juego);
				ventana.setSize(1300,400);
				ventana.setLocation(70,200);
				ventana.setVisible(true);
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				while(true) {
					
					if(juego.juegoFinalizado) {
						reiniciaJuego=JOptionPane.showConfirmDialog(null,"Quieres volver a jugar"
								+ ".0?","has perdido", JOptionPane.YES_NO_OPTION);
						if(reiniciaJuego==0) {
							reiniciaValores();
						}else if(reiniciaJuego==1) {
							System.exit(0);
						}
					}else {
						juego.repaint();
						Thread.sleep(10);
						
						if(Juego.pierdeVida==true) {
							JOptionPane.showMessageDialog(null,"has perdido una vida");
							Juego.pierdeVida=false;
							Juego.vidas--;
							Personaje.y_inicial=270;
							Personaje.saltando=false;
							Obstaculo.x_inicial=1300;
						}
					}

				}
			}
			public static void reiniciaValores() {
				Juego.juegoFinalizado=false;
				Obstaculo.x_auxiliar=-4;
				Juego.puntos=0;
				Juego.nivel=1;
				Juego.vidas=3;
				reiniciaJuego=-1;
				Obstaculo.x_inicial=1300;
			}
			
		
		/*botonFichero.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame ventana = new JFrame("Lista de jugadores");
				ventana.setSize(500, 1000);
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventana.setVisible(true);
				ventana.setLocationRelativeTo(null);
				
				JButton boton = new JButton("Presiona para ver los jugadores");
				boton.setBounds(200, 200, 200, 200);
				boton.setForeground(Color.decode("#1D49BD"));
				boton.setBackground(Color.decode("#FCFF33"));
				boton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
				boton.setFocusable(false);
				
				ventana.add(boton);
				
				JTextField listaNombres = new JTextField();
				
				
				
			}
		});*/
	}
