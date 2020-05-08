package AM0805Tarea8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_grupal {

	public static void main(String[] args) throws IOException {
		
		String leido;
		FileReader leerFichero = new FileReader("D:\\Users\\Carlo\\Desktop\\notas.txt");
		BufferedReader br = new BufferedReader(leerFichero);
		FileWriter notas2 = new FileWriter("notas_.txt");
		
		try {
			while((leido = br.readLine())!=null) {
	            for (int i = 0; i < leido.length(); i++) {
	            	leido = leido.replaceAll("sobresaliente", "aprobado");
				}
	            notas2.write(leido + "\n");
	      	}
			notas2.flush();
		}catch(Exception e) {
			System.out.println("Algo ha salido mal.");
		}
		notas2.close();
		br.close();
		
		//¿Qué tendrías que hacer para que el nuevo fichero se llamará "notas.txt"?
		//Llamarlo de la misma manera.
	}
}
