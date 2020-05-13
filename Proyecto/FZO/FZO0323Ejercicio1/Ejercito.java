package FZO0323Ejercicio1;
import java.util.Random;

public class Ejercito extends UnidadArmada{

	protected String nombre;
	
	protected  int cantidadTropas;
	
	final int DIEZTROPAS = 10 ;
	
	
	
	
	
	public Ejercito(String nombre , int cantidadTropas) {
		
		this.nombre=nombre;
		
		this.cantidadTropas	= cantidadTropas;
		
		
	}
	
	public Ejercito ( String noombre) {
		
		cantidadTropas = DIEZTROPAS;
	}
	
	public void formación() {
		
		UnidadArmada aleatorio  [] = new UnidadArmada[4];
		
		
		int i;
		
		for (i=0 ;i< aleatorio.length;i++) {
				aleatorio[i] = new Batallón();
			
		}
		
		//UnidadArmada.Batallón= 
				
				
		
		
		
		for (i=0 ; i < aleatorio.length;i++) {
			
		}
	}

	
	public String obtenerTipo() {
		
		return null;
	}

	@Override
	public boolean ataqueEfectivo() {
		// TODO Auto-generated method stub
		return false;
		
		
	}
	
	
	
	
}
