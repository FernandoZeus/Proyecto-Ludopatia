package FZO0508Ejercicio6;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i;
		int numeroDeVeces;
		
		String cadena;
		String nombreFichero;
		Scanner lector = new Scanner(System.in);
		
		Scanner lectorFichero;
		
		
		
		System.out.println("Cadena : ");
		cadena = lector.nextLine();
		
		System.out.println("Nombre del fichero : ");
		nombreFichero = lector.nextLine();
		
		System.out.println("Número de veces : ");
		numeroDeVeces = lector.nextInt();
		
		try {
			
				
				//Creamos un fichero con extension txt
				FileWriter fichero1 = new FileWriter(nombreFichero +".txt");
				 //Recorremos el array ,por cada entero escribimos una línea de hola mundo 
				for ( i = 0 ; i <= numeroDeVeces; i++) {
						fichero1.write(cadena + "\n");	
				}
				//creamos un lector de fichero
				//lectorFichero = new Scanner(fichero1);
				fichero1.close();
		} 		
		finally {
			//System.out.print("El resultado es" + fichero1.getMessage());
			
		}
		//COSAS PREGUNTAR :POR QUE OBLIGATORIAMIENTO TIEN QUE CONTENER LA CLASE IO EXCEPTIO
		//Asociar cada item a un 
	}

}


