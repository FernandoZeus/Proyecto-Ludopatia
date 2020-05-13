package FZO0508Ejercicio6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CrearFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		int i;
	
		final String HOLAMUNDO = " ¡ Hola Mundo !";
		
		Scanner lectorFichero;
		
		
		try {
				 //Creamos un fichero con extension txt
				FileWriter fichero1 = new FileWriter("fichero.txt");
				 //Recorremos el array ,por cada entero escribimos una línea de hola mundo 
				for ( i = 0 ; i <= 6 ; i++) {
						fichero1.write(HOLAMUNDO + "\n");	
				}
				//creamos un lector de fichero
				//lectorFichero = new Scanner(fichero1);
				fichero1.close();
		} 		
		finally {
			//System.out.print("El resultado es" + fichero1.getMessage());
			
		}
		//COSAS PREGUNTAR :POR QUE OBLIGATORIAMIENTO TIEN QUE CONTENER LA CLASE IO EXCEPTIO

	}

}
