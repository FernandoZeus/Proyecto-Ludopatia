package AM0323Tarea2;

public interface IRobot{
	
	public String obtenerNombre();
	
	public int calcularAtaque();
	
	public boolean estaVivo();
	
	public void recibirAtaque(int cantidadDanio);
}