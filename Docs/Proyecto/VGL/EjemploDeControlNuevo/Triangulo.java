package VLG.EjemploDeControlNuevo;
import java.io.*;
import javax.swing.*;

//este es un ejemplo sencillo que he realizado para calcular el area de un rectangulo.

public class Triangulo {
	
	//calcular area del rectangulo
	 public static void main(String[] args){
		 int base, altura;
		 double area;
		 base=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un lado: "));
		 altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el otro lado"));
		 area=(base*2) +(altura*2);
		 JOptionPane.showMessageDialog(null,"El area del rectangulo es: "+area);
	 }
	 
}



