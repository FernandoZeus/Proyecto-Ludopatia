package FZO0508Ejercicio6;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class MostrarPrácticas {

		public void abrir(String ruta) {
			
			try {
					
					File rutarchivo = new File (ruta);
				
						//con este método se obtiene el método de escritorio y se maneja, en este caso lanza el archivo : open(abre ruta)
					Desktop.getDesktop().open(rutarchivo);
			
		   }catch (IOException error) {
				
					System.out.println(error );
					System.out.println(" no se ha abierto el archivo correctamente : ");	
					System.out.println(" ERROR EN LA RUTA , NOMBRE DE ARCHIVO MAL ESCRITO");
					
		   
		   }
			
		}

		
		//Preguntar que por que se delcara aqui y si habria otra forma de hacerlo
		public void botonparabrir (ActionEvent evento) {
			
			abrir("/home/fernando/eclipse-workspace/Proyecto/daw.html");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Creamos un JFrame (una ventana principal)
	
	//JFrame marco = new JFrame();
	
	//Creamos un JDialog que espondrá el archivo html
	
	//JDialog ventana = new JDialog();
	
	//Creamos un Boton para que al hacer click habrá el archivo
	
	//JButton boton = new JButton(" Abrir página ");
	
	//Añadimos todos los controles 
	

	MostrarPrácticas fernando = new MostrarPrácticas();
		
	fernando.abrir("/home/fernando/eclipse-workspace/Proyecto/daw.html");
	//fernando.botonparabrir();
	
	
	}

}
