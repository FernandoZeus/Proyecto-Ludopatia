package CRS0323SimuladorGuerras;

public abstract class   unidadArmada {
	protected int vida;
	protected int danio;
	protected String tipoUnidad;
	
	public abstract String obtenerTipo();// getter ()
	public String toString() {
		
		return "("+obtenerTipo() +  " v: "  +vida+")";
	}
	public abstract boolean ataqueEfectivo();
	public void atacar(unidadArmada Unidad1) {
		if(ataqueEfectivo()) {
			System.out.println("Atacante:"+ toString());
			System.out.println("ataque efectivo!!!!");
			System.out.println("Recibe atacaque: "+ "(" + Unidad1.tipoUnidad + " V:" +(Unidad1.vida-danio)+")");
			Unidad1.vida=Unidad1.vida-danio;
		}else {
			System.out.println("Atacante:"+ toString());
			System.out.println("ataque fallido xxxx");
			System.out.println("Recibe atacaque:"+ Unidad1.toString());
			
		}
			
	}
	public boolean estaViva() {
		if (vida>0) {
			return true;
		}else {
			return false;
		}
	}
	public static unidadArmada generarUnidad() {
		int aleatorio=(int)(Math.random()*3);
		unidadArmada UnidadA= new unidadElite();
		unidadArmada UnidadB= new Batallon();
		unidadArmada UnidadC= new Caballeria();
		unidadArmada Unidades[]= {UnidadA,UnidadB,UnidadC};
		
		return Unidades[aleatorio]; 
	}
	


}
