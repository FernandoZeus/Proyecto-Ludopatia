package VLG.simuladorDeGuerras;

public abstract class UnidadArmada {

	protected int vida;
	protected int daño;
	protected String nombre;
	
	abstract String obtenerTipo();
	
	public String toString() {
		return vida + " - " + daño;
	}
	
	abstract boolean ataqueEfectivo();
	
	public void atacar(UnidadArmada objeto) {
		System.out.println(objeto.toString()+" " + objeto.nombre);
		if(ataqueEfectivo()&& objeto.vida>0) {
			System.out.println("ataque efectivo");
			objeto.vida= objeto.vida-20;
			
		}else {
			System.out.println("ataque fallido");
		}
		System.out.println(objeto.toString());
	}
	
	public boolean estaViva() {
		return vida>0;
	}
	
	static UnidadArmada generaUnidad() {
		int i=(int)(Math.random()*4);
		
		if(i==1) {
			UnidadArmada a = new UnidadElite();	
			return a;
		}
		if(i==2) {
			UnidadArmada a = new Batallon();
			return a;
		}
		if(i==3) {
			UnidadArmada a = new Caballeria();
			return a;
		}
		UnidadArmada a = new Batallon();
		return a;
		 
		
	}
}
