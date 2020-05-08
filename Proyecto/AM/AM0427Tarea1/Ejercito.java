package AM0427Tarea1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercito {
	
	private String nombre;
	private int tamTropas;
	private UnidadArmada[]arrayEjer;
	private UnidadArmada[]sobrevivientes;
	
	
	public Ejercito (String nombre, int tamTropas) {
		this.nombre = nombre;
		this.tamTropas = tamTropas;
		arrayEjer = new UnidadArmada[tamTropas];
		
		for (int i = 0; i < arrayEjer.length; i++) {
			arrayEjer[i] = UnidadArmada.generarUnidad();
		}
	}
	
	public Ejercito(String nombre) {
		this.nombre = nombre;
		tamTropas = 10;
		arrayEjer = new UnidadArmada[tamTropas];
		
		for (int i = 0; i < arrayEjer.length; i++) {
			arrayEjer[i] = UnidadArmada.generarUnidad();
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void formacion() {
		List <UnidadArmada> arrayDesordenado = Arrays.asList(arrayEjer);
		Collections.shuffle(arrayDesordenado);
	}
	
	public void ataca(Ejercito adversario) {
		
		for (int i = 0; i < arrayEjer.length; i++) {
			int ale = ((int)Math.random()*(adversario.tamTropas));
			arrayEjer[i].atacar(adversario.arrayEjer[ale]);
		}
	}
	
	public void retirarFallecidos() {
		
		int tamVivos = 0;
		
		for (int i = 0; i < arrayEjer.length; i++) {
			if (arrayEjer[i].estaViva() == true) {
				tamVivos++;
			}
		}
		
		sobrevivientes = new UnidadArmada[tamVivos];
		
		for (int i = 0; i < arrayEjer.length; i++) {
			if(arrayEjer[i].estaViva() == true) {
				for (int j = 0; j < sobrevivientes.length; j++) {
					arrayEjer[i] = sobrevivientes[j]; 
					sobrevivientes = arrayEjer;
				}
			}
		}
	}
	
	public boolean puedeLuchar() {
		
		int contVivos = 0;
		
		for (int i = 0; i < arrayEjer.length; i++) {
			if(arrayEjer[i].estaViva() == true) {
				contVivos++;
			}
		}
		
		if(contVivos == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public String toString() {
		return "Gran ejército llamado: " + nombre + "\nY su grandeza es de " + tamTropas + " unidades.";
	}
}

