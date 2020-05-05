package CRS0327BattleBots;

public interface IRobot {
	
  public String obtenerNombre();
  
  public int calcularAtaque();
  
  public void recibirDanio(int danio);
  
  public boolean estaVivo();



}
