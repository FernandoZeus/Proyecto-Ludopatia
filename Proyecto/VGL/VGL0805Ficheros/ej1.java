package VGL0805Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {
	
	//no se porque no me escribe.

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("escribe el texto que quieres que printexd");
		String contenido = in.next();	
		
		
		try {
				System.out.println("escribe donde quieres que se guarde el fichero y su respectivo nombre");
				String ruta = in.next();
				//System.out.println("escribe como quieres que se llame el txt");
				//String nombre = in.next();
				//File fichero = new File(ruta,nombre);
				File fichero = new File(ruta);
				fichero.createNewFile();
				
				FileWriter fw = new FileWriter(ruta);				
				System.out.println("escribe el numero de veces que quieres que haga loop");
				fw.write(contenido);
				for (int i = 0 ; i <= in.nextInt() ; i++) {
						fw.write(contenido + "\n");
				}
				fw.flush();
				fw.close();
				System.out.println("realizado");
		}catch(Exception e){// es cutre pero de momento lo dejo asixd
			System.out.println("algo ha falladoxd");
		}
		

	}

}