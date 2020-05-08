package CRS0508Ficheros;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero_2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		try {
			String nombre, ruta, cadena;
			int veces;
			System.out.println("Dime el nombre que quieres para tu fichero");
			nombre=teclado.nextLine();
			System.out.println("Dime donde quieres guardar el fichero");
			ruta=teclado.nextLine();
			System.out.println("Dime la cadena de texto que quieres guardar en el fichero");
			cadena=teclado.nextLine();
			System.out.println("Dime cuantas veces quieres repetir la cadena");
			veces=teclado.nextInt();
			FileWriter HolaMundo = new FileWriter(ruta+"\\"+nombre+".txt");
			String hola = "Hola Mundo";
			for (int i = 0; i <= veces; i++) {
				HolaMundo.write(cadena + " ");

			}
			HolaMundo.flush();
			HolaMundo.close();
		} catch (IOException e) {
			System.out.println("Ruta erronea Prueba a poner otra o hazlo nuevamente");

		}
	}

}
