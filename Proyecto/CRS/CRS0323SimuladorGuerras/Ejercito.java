package CRS0323SimuladorGuerras;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercito {
	private String nombre;
	private int tamanioEjercito;
	unidadArmada[] Ejercito ;
	unidadArmada[] ejercitosMuertos ;
	
	
	public Ejercito(String nombre, int tamanioEjercito) {
		this.nombre=nombre;
		this.tamanioEjercito=tamanioEjercito;
		
		Ejercito = new unidadArmada[tamanioEjercito];
		for(int i=0; i<Ejercito.length;i++) {
		
			Ejercito [i]=unidadArmada.generarUnidad();
			}
	
		
	}
	public Ejercito (String nombre) {
		this.nombre=nombre;
		tamanioEjercito=10;
		Ejercito = new unidadArmada[tamanioEjercito];
		for(int i=0; i<Ejercito.length;i++) {
			Ejercito [i]=unidadArmada.generarUnidad();
			}
	
		
		}
	public void formacion() {
		List <unidadArmada> arrayDesordenado = Arrays.asList(Ejercito);
        Collections.shuffle(arrayDesordenado);
		
	}
		
		
		
	public String getNombre() {
        return nombre;
    }
	
	public void setNombre(String nombre) {
         this.nombre=nombre;
    }
	public void ataca(Ejercito ejercito2) {
		int aleatorio1= (int)(Math.random())*(ejercito2.tamanioEjercito);
		for(int i=0;i<Ejercito.length;i++) {
			Ejercito [i].atacar(ejercito2.Ejercito [aleatorio1]);
			}
	}
	public void retirarFallecidos() {

        int tamVivos = 0;

        for (int i = 0; i < Ejercito.length; i++) {
            if (Ejercito[i].estaViva() == true) {
                tamVivos++;
            }
        }

        ejercitosMuertos = new unidadArmada[tamVivos];

        for (int i = 0; i < Ejercito.length; i++) {
            if(Ejercito[i].estaViva() == true) {
                for (int j = 0; j < ejercitosMuertos.length; j++) {
                    Ejercito[i] = ejercitosMuertos[j]; 
                    ejercitosMuertos = Ejercito;
                }
            }
        }
    }
	

	public boolean puedeLuchar() {
		int contVivos = 0;

        for (int i = 0; i < Ejercito.length-1; i++) {
            if(Ejercito[i].estaViva() == true) {
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
		return nombre+"con"+tamanioEjercito+"Unidades";
		
	}
}
