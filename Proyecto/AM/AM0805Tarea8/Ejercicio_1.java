package AM0805Tarea8;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_1 {

	public static void main(String[] args) throws IOException {

		
		String holaMundo = "¡Hola Mundo!";
		
		FileWriter fichero = new FileWriter("holamundo.txt");
		
		try {
			for (int i = 0; i <= 6; i++) {
				fichero.write(holaMundo + "\n");
			}
			fichero.close();
		}catch(Exception excepcion) {
			System.out.println("Algo ha salido mal " + excepcion.getMessage());
		}
	}
	//¿Dónde crea el fichero? Lo crea en la ruta donde se encuentra el proyecto
}
