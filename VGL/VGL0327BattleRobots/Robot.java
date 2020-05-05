package VGL0327BattleRobots;

public class Robot implements IRobot{
	private String nombre;
	private int vida;
	
	Armas[] armas = new Armas[3];
	Defensa[] defensa = new Defensa[3];
	String arma;
	int daño;
	int fiabilidad;
	
	//no se como quitar el "nombre raro" que me sale cuando intento imprimir el nombre del arma y del escudo. Me he quedado sin ideas.

	//constructor
	public Robot(String nombre) {
		this.nombre=nombre;
		vida=100;
		
		for(int i=0;i<3;i++) {
			arma = "arma" + i;
			daño = (20 +(i*5)) * 2;
			fiabilidad = (20 +(i*5)) * 2;
			armas[i] = new Armas(arma,daño,fiabilidad);
		}
		/*armas[0]=new Armas(arma,50,60);
		armas[1]=new Armas("puñete",30,70);
		armas[2]=new Armas("rayo",80,50);
		*/
		defensa[0]= new Defensa("escudo",20,80);
		defensa[1]= new Defensa("armadura",10,60);
		defensa[2]= new Defensa("casco",5,5);
	}

	//nombre
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String getArma() {
		return arma;
	}

	//calculo el ataque que se va a realizar
	@Override
	public int calcularAtaque() {
		int dañoTotal=0;
		
		System.out.println("El robot atacante es: " + nombre);
		
		for(int i=0;i<armas.length;i++) {
			int calculo = armas[i].obtenerDaño();
			
			if(calculo!=0) {
				dañoTotal += calculo;
				System.out.println("ARMA ->" + armas[i].getArma() + " Funciona "+ calculo);
			}else {
				System.out.println("ARMA ->" + armas[i].getArma() + " No funciona");
			}
		}
		System.out.println();
		
		return dañoTotal;
	}

	//calculo el ataque que se va a recibir
	@Override
	public void recibirAtaque(int cantidadDaño) {
		int dañoTotal =cantidadDaño;
		
		for(int i=0;i<defensa.length; i++) {
			dañoTotal =cantidadDaño;
			int calculo = defensa[i].bloqueaAtaque(cantidadDaño);
			dañoTotal = dañoTotal- calculo;
			System.out.println();
			System.out.println(getNombre()+ " defiende");
			if(calculo!=cantidadDaño) {
				System.out.println("Proteccion ->" + defensa[i].getDefensa() + " Funciona: " + (cantidadDaño-calculo));
				System.out.println("Vida antes: "+ vida + " vida tras ataque: " + (vida-dañoTotal));
				vida= vida-dañoTotal;
			}else {
				System.out.println("Proteccion ->" + defensa[i].getDefensa() + " No Funciona ");
			}
			
		}
		System.out.println();

		
		
	}

	@Override
	public boolean estaVivo() {
		return vida>0;
	}
	//no he llegado a usar el toString
	public String toString() {
		
		return arma;
	}
	
}
