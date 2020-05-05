package CAM0427Tarea1;

public abstract class UnidadArmada {

	protected int vida;
	protected int danio;
	protected String tipoUnidad;
	
	public abstract String obtenerTipo();
	
	public String toString() {
		return "(" + obtenerTipo() + " v: " + vida + ")";
	}
	
	public abstract boolean ataqueEfectivo();
	
	public void atacar (UnidadArmada contrincante) {
				
		if (ataqueEfectivo()) {
			System.out.println("Atacante: " + toString());
			System.out.println("Ataque efectivo !!!!");
			System.out.println("Recibe ataque: (" + contrincante.tipoUnidad + " v: " + (contrincante.vida - danio) + ")");
			
			contrincante.vida = (contrincante.vida-danio);
		}else {
			System.out.println("Atacante: " + toString());
			System.out.println("Ataque fallido xxxx");
			System.out.println("Recibe ataque: " + contrincante);
		}
	}
	
	public boolean estaViva() {
		if (vida < 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public static UnidadArmada generarUnidad () {
		
		int aleatorio = ((int)(Math.random()*3));
		
		UnidadArmada elite = new UnidadElite();
		UnidadArmada batallon = new Batallon();
		UnidadArmada caballeria = new Caballeria();
		
		UnidadArmada[]unidades = {elite, batallon, caballeria};
		
		return unidades[aleatorio];
	}
}
