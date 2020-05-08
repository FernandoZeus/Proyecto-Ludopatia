package VGL0805Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String cadena;
		System.out.println("escribe el directorio de las practicas");
		String directorio= in.next();
		
		
		File fichero = new File(directorio);
		File[] ficheros = fichero.listFiles();
		System.out.println("nombre de los ficheros:");
		System.out.println();
		for (int i=0;i<ficheros.length;i++) {
			System.out.println(ficheros[i].getName());
		}
		
		System.out.println();
		System.out.println("escribe el nombre del archivo html");
		String archivo=in.next();
		
		String ruta = directorio +"\\" + archivo;
		
		FileReader f = new FileReader(ruta);
		BufferedReader b = new BufferedReader(f);
		while((cadena = b.readLine())!=null) {
			System.out.println(cadena);
		}
		b.close();
		
		
		
	}

}
