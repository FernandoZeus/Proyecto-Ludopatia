package VGL0327BattleRobots;

public class Armas {

	private String nombre;
	private int daño;
	private int fiabilidad;	
	//aa
	
	//constructor
	public Armas(String nombre,int daño, int fiabilidad) {
		this.nombre=nombre;
		this.daño=daño;
		this.fiabilidad=fiabilidad;
		
	}
	
	//metodo
	
	public int obtenerDaño() {
		if((int)(Math.random()*100)<=fiabilidad) {
			//has acertado
			return daño;
			
		}else {
			//has fallado
			daño=0;
		}
		
		
		return daño;
	}

	public String getArma() {
		// TODO Auto-generated method stub
		return nombre;
	}

	
	
	
}
