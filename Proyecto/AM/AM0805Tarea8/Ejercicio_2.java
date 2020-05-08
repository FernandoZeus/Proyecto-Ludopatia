package AM0805Tarea8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		try {
			String nombreFichero, ruta, cadena;
			int numRepetir;
			
			System.out.println("Escribe el nombre del fichero: ");
			nombreFichero = teclado.next();
			System.out.println("Escribe la ruta del fichoro: ");
			ruta = teclado.next();
			System.out.println("Número de veces que quieres que se repita la cadena: ");
			numRepetir = teclado.nextInt();
			System.out.println("Dime la cadena: ");
			cadena = teclado.next();
			
			FileWriter fichero = new FileWriter(ruta + "\\" + nombreFichero + ".txt");
			
			for (int i = 0; i <= numRepetir; i++) {
				fichero.write(cadena + "\n");
			}
			
			fichero.flush();
			fichero.close();
		}catch(Exception excepcion) {
			System.out.println("Algo ha salido mal");
		}
		teclado.close();
	}
}
