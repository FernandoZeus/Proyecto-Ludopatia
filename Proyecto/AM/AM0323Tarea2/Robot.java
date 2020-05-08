package AM0323Tarea2;

public class Robot implements IRobot{
	
	
	private String nombre;
	private int vida = 100;
	private Arma[] armas = new Arma[3];
	private Defensa[] defensas = new Defensa[3];
	
	
	public Robot(String nombre){
		this.nombre = nombre;
		
		String[] nomArm = {"Espada", "Tirachinas", "Espada"};
		String[] nomDef = {"Piedra", "Madera", "Metal"};
		
		for (int i = 0; i < armas.length; i++) {
			int danioBloqueo = ((int)(Math.random()*100+1));
			int fiabilidad = ((int)(Math.random()*100+1));
			armas[i] = new Arma(nomArm[i], danioBloqueo, fiabilidad);
		}
		
		for (int i = 0; i < defensas.length; i++) {
			int danioBloqueo = ((int)(Math.random()*100+1));
			int fiabilidad = ((int)(Math.random()*100+1));
			defensas[i] = new Defensa(nomDef[i], danioBloqueo, fiabilidad);
		}	
	}
	
	@Override
	public boolean estaVivo() {
		
		if(vida <= 0) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String toString() {
		return nombre + " tiene " + vida + " puntos de vida\n" + 
			"Armas: " + armas[0].getNombre() + ", " + armas[1].getNombre() + ", " + armas[2].getNombre() + "\n" + 
			"Defensas: " + defensas[0].getNombre() + ", " + defensas[1].getNombre() + ", " + defensas[2].getNombre() + "\n" ;
	}
	
	@Override
	public String obtenerNombre() {
		return nombre;
	}

	@Override
	public int calcularAtaque() {
		
		int danioTotal = 0;
		
		System.out.println(nombre + " ataca a: \n");
		
		for (int i = 0; i < armas.length; i++) {
			int danioArma = (armas[i].probabilidadDanio());
			danioTotal += danioArma;
			
			if(danioArma == 0) {
				System.out.println("La" + armas[i].getNombre() + " No ha sido efectiva " + danioArma);
			}else {
				System.out.println("La" + armas[i].getNombre() + " Ha sido efectiva " + danioArma);
			}
		}
		return danioTotal;
	}

	@Override
	public void recibirAtaque(int cantidadDanio) {
		
		int totalDanio = 0;
		
		System.out.println("\n" + nombre + " se defiende con: \n");
		
		for (int i = 0; i < defensas.length; i++) {
			int defensaEscudo = (defensas[i].bloquearDanio(cantidadDanio));
			totalDanio += defensaEscudo;
			
			if(totalDanio > 0) {
				System.out.println("Protección --> " + defensas[i].getNombre() + " No ha sido efectiva.");
			}else {
				System.out.println("Protección --> " + defensas[i].getNombre() + " Ha sido efectiva, protege " + defensaEscudo);
			}
		}
		
		System.out.println("\nVida antes del combate: " + vida + "\nVida después del ataque: " + (vida = vida - totalDanio) + "\n");
	}
}
