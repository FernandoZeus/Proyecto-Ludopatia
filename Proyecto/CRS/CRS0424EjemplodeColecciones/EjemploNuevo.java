package CRS0424EjemplodeColecciones;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploNuevo {
	
      
	public static void main(String[] args) {
	       	JFrame ventana = new JFrame("Botones");
	        ventana.setSize(400, 250);
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JButton boton  = new JButton("Elige el medio de Transporte");
	        boton.setText("Enviar Resultado");
	        JRadioButton Coche =new JRadioButton("Coche");
	        
	        JRadioButton Moto =new JRadioButton("Moto");
	       
	        JRadioButton Autobus =new JRadioButton("Autobus");
	        
	        JRadioButton Avion =new JRadioButton("Avion");
	        
	        TextField Testo=new TextField();
	        Testo.setBounds(50,150,60,30);
	        ventana.add(boton);
	        ventana.add(Testo);
	        
	        boton.addActionListener(new ActionListener(){  
	            public void actionPerformed(ActionEvent e){  
	                    Testo.setText("ok.");  
	            }  
	            });
	        
	
	      
	      JPanel Panel = new JPanel();
	        
	        Panel.add(Coche);
	        Panel.add(Moto);
	        Panel.add(Autobus);
	        Panel.add(Avion);
	        Panel.add(boton);
	        Panel.add(Testo);
	        ventana.setContentPane(Panel);
	        ventana.setVisible(true);
	        ventana.setLayout(null);
	
	  
	


	}

		
	} 

