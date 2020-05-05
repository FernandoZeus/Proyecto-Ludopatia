package VGL0327BattleRobots;

public class Defensa {

	private String nombre;
	private int fiabilidad;
	private int defensa;
	
	//constructor
	
	public Defensa(String nombre,int defensa, int fiabilidad) {
		this.nombre=nombre;
		this.defensa=defensa;
		this.fiabilidad=fiabilidad;
	}
	
	
	//metodo
	
	public int bloqueaAtaque(int daño) {
		if((int)(Math.random()*100)<=fiabilidad) {
			//has acertado
			return daño-defensa;
			
		}else {
			//has fallado
			return daño;
		}
	}
	
	public String getDefensa() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
}
