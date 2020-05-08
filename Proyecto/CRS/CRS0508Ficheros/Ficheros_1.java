package CRS0508Ficheros;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros_1 {
	public static void main(String[] args) {

		try {
			FileWriter HolaMundo = new FileWriter("C:\\Users\\xd\\Desktop\\holamundo.txt");
			String hola = "Hola Mundo";
			for (int i = 0; i <= 7; i++) {
				HolaMundo.write(hola + " ");

			}
			HolaMundo.close();
		} catch (IOException e) {
			System.out.println("La ruta no es correcta ");

		}
	}
}
