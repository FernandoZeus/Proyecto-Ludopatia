package FZO0323Ejercicio1;
public abstract class UnidadArmada{
		
		protected int vida;
		protected int daño;
		final String EFECTIVO = "¡ Ataque efectivo !";
		final String NOEFECTIVO = " ¡ Ataque fallido !";
		final String ATACANTE = " Atacante : ";
		final String RECIBEATAQUE = " Recibe ataque :  "; 
		final String FUERA = " Fuera de combate ! ";
		
	public abstract String obtenerTipo();
	
	public String toString(){
		
		return obtenerTipo() + " v: " + vida;
	
	}
	
	public void pinta() {
	
		System.out.print("hola!");
	}
	
	public abstract boolean ataqueEfectivo();
	
	public void atacar (UnidadArmada unidadAtacada){//fulanito.atacar(batallon); estamos diciendo que fulanito ataque a batallon (unidadAtacada)
		
		//unidadAtacada llama a su método toString
		
		System.out.println(toString());
		
		//llamada al parametro ataqueEfectivo con inversión de control(verificar si es por eso)
		//ese ataque efectivo es como si lo estuviera llamando el objeto que queremos
		//por ejemplo batalla(de la clase batallon) ataque un objeto de UnidadÉlite
		//batalla.atacar(unidad) objeto batalla es el que está llamando a ataqueEfectivo
		
		do {
			
		
			if(ataqueEfectivo()) {//si el ataque es efectivo del objeto que quiere atacar a otro
				
				System.out.println(ATACANTE + EFECTIVO); //
				
				unidadAtacada.vida = unidadAtacada.vida - daño;
				
				System.out.println(unidadAtacada.toString());
				
		
			}else {
			
				
				System.out.println(NOEFECTIVO);//retorna false
				
				System.out.println(unidadAtacada.toString());
				
			
		}	
		
		}while(unidadAtacada.estaViva(unidadAtacada.vida)) ;
			
				System.out.print(unidadAtacada + FUERA);
		
	
		
	}
	
	public boolean  estaViva( int vida ){
		
		if (vida > 0 ){
			
			return true;
		
		}else {
			
			return false;
			
		}
	
	}
	
	public static void  generaUnidad() {
		
		int aleatorio = (int)Math.random()*0 + 4;
		
			if(aleatorio == 3) {
				
				new Batallón();
				
			}else if( aleatorio == 2 ) {
				
				new UnidadÉlite();
			
			}else if (aleatorio == 1) {
				
				
			}
	}
	
	
	
}