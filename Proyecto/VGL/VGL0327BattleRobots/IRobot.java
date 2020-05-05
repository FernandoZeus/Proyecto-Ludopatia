package VGL0327BattleRobots;

public interface IRobot {
		
	public String getNombre();
	
	public int calcularAtaque();
	
	public void recibirAtaque(int cantidadDaño);
	
	public boolean estaVivo();
	
	public String toString();
	
	
}

