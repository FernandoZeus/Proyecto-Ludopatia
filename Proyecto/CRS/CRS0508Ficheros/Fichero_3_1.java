package CRS0508Ficheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero_3_1 {
	public static void main(String[] args) {
		
        try {

    		String leido;
            FileReader notas = new FileReader("C:\\Users\\xd\\Desktop\\notas.txt");
            BufferedReader BufferReader = new BufferedReader(notas);
            FileWriter notas2 = new FileWriter("C:\\Users\\xd\\Desktop\\notas_.txt");

            while((leido = BufferReader.readLine())!=null) {
                for (int i = 0; i < leido.length(); i++) {
                    leido = leido.replaceAll("suspenso", "aprobado");
                }
                notas2.write(leido + "\n");
              }
            notas2.flush();
            notas2.close();
            BufferReader.close();
        }catch(IOException e) {
            System.out.println("Prueba con otro directorio");
        }
        //para cambiar el nomBufferReadere a notas.txt haBufferReadera que usar el metodo renameTo pero no entendia por que no se cambiaba 
        
	}
}
