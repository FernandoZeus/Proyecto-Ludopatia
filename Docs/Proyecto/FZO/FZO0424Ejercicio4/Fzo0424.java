package FZO0424Ejercicio4;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.event.*;

public class Fzo0424 extends JFrame{

JRadioButton jRadioButton1;  
    JRadioButton jRadioButton2;
    JButton jButton;
    JButton jButton2;
    ButtonGroup G1; //agrupación de radio button
    JLabel L1;
    JLabel L2;
    Border loweredbevel;
   
    public Fzo0424() {
 
        this.setLayout(null);    
        setVisible(true);
        this.setBounds(100, 100, 400, 200);
        //color del framethis.setBackground(Color.CYAN);
     
        //color del jpanel
        this.getContentPane().setBackground(Color.CYAN);
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton1.setText("M");
        jRadioButton2.setText("F");
        jRadioButton1.setBackground(Color.GRAY);
        jRadioButton2.setBackground(Color.GRAY);

        jRadioButton1.setBounds(200, 30, 120, 50);
        jRadioButton2.setBounds(315, 30, 120, 50);
       
        jButton = new JButton("SI");
        jButton.setBounds(125, 120, 80, 30);
        jButton2 = new JButton("NO");
        jButton2.setBounds(225, 120, 80, 30);
       
        L1 = new JLabel("Elegir género");
        L2 = new JLabel ("¿ Te ha gustado el programa?");
        L1.setBorder(BorderFactory.createLineBorder(Color.black));
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        L1.setBorder(loweredbevel);
        L1.setBounds(20, 30, 150, 50);
        L2.setBounds(110,60,250,100);
       
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jButton);
        this.add(jButton2);
        this.add(L1);
        this.add(L2);
       
        G1 = new ButtonGroup();
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
       
       
    }
}


class Boton {

    public static void main(String args[]) {
     
    Fzo0424 f = new Fzo0424();
       
        f.setTitle("BOTÓN");
       
 
    }
    
}