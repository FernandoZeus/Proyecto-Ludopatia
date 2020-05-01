package CRS0327BattleBots;

public class MainRobots {
	public static void main(String[] args) {

		Robot robotPrueba = new Robot ("Juan");
		
		Robot robotEnemigo = new Robot ("Pepe");
		
		robotPrueba.recibirDanio(robotEnemigo.calcularAtaque());
	}
	

}
