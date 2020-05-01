package CRS0327BattleBots;

public class Robot implements IRobot {
	private String nombre;
	private int vida=100;
	private Arma[]Armas_equipadas;
	private Defensa[]Defensas;
	private Arma[] armamento= new Arma[3];
	private Defensa []proteccion = new Defensa[3];

	
	public Robot (String nombre) {
		this.nombre=nombre;
		
		
		String [] Narmamento= {"Espadon","Gorro","filo infinito"};
		String [] Nproteccion= {"Randuim","Chaleco de zarzas","Velo del hada"};
		for(int i = 0; i <Narmamento.length; i++) {
			int randomProb = ((int)(Math.random()*100+1));
			int randomDanio = ((int)(Math.random()*100+1));
			
			Arma armasdelRobot = new Arma(Narmamento[i], randomDanio, randomProb);
			armamento[i] = armasdelRobot;
		}
		for(int i = 0; i <Nproteccion.length; i++) {
			int randomProb = ((int)(Math.random()*100+1));
			int randomDanio = ((int)(Math.random()*100+1));
			
			Defensa protecciondelRobot = new Defensa(Nproteccion[i], randomDanio, randomProb);
			proteccion[i] = protecciondelRobot;
		}

		
		
	}
		
	
	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return nombre+"";
	}
	@Override
	public int calcularAtaque() {
		int danioTotal=0;
			System.out.println("El robot atacante es: " + nombre);
		
		for(int i = 0; i < armamento.length; i++) {
			
			int calculo = armamento[i].obtenerdanio();
			
			if (calculo >= 1) {
				danioTotal = calculo + danioTotal;
				System.out.println("\nEs efectivo");
			}else {
				System.out.println("\nNo es efectivo");
			}
			
			System.out.println(armamento[i].getnombre() + "\n" + calculo);
		}
		
		System.out.println("\nEl daño total es: " + danioTotal);
		
		return danioTotal;
	}


	@Override
	public void recibirDanio( int danio) {//esto queria que me aclarases pero al no estar disponible no lo hemos podido corregir bien
		
		System.out.println("El robot defensor es: " + nombre);
		
		int danioBloqueado = 0;
		
		for(int i = 0; i < proteccion.length; i++) {
			int recibirAtaque = proteccion[i].devolverDanio(danio/3);
			
			danioBloqueado = recibirAtaque + danioBloqueado;
			
			if (recibirAtaque >= 0){
				System.out.println("\nNo es lo suficientemente efectivo");
				recibirAtaque=recibirAtaque*(-1);
				vida = vida + recibirAtaque;
			}else {
				System.out.println("\nEs efectivo");
			}
			System.out.println(proteccion[i].getnombre() + danioBloqueado);
		}
			if(vida<=0) {
				System.out.println("Tu vida actual es: 0 y el daño que te han producido es " + danioBloqueado);
			}else {
				System.out.println("Tu vida actual es: " + vida + " y el daño has mitigado " + danioBloqueado);
			}
		
	}
		


	@Override
	public boolean estaVivo() {
		if(vida<=0) {
			return false;
		}else{
			return false;
			
		}
		
		
		
	}
}
	