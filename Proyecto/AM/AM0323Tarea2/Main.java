package AM0323Tarea2;

public class Main {

	public static void main(String[] args) {

		
		IRobot robot1 = new Robot("Robot China");
		IRobot robot2 = new Robot("Robot URSS");
		
		int ronda = 1;
 		
		while(robot1.estaVivo() && robot2.estaVivo()) {
			
			System.out.println("***********************************************");
			System.out.println("\n            Ronda " + ronda + " de la pelea\n");
			System.out.println("***********************************************");
			
			robot1.recibirAtaque(robot2.calcularAtaque()/3);
			robot2.recibirAtaque(robot1.calcularAtaque()/3);
			
			ronda++;
		}
		
		if(robot1.estaVivo() && robot2.estaVivo() == false) {
			System.out.println("***********************************************");
			System.out.println("          " + robot1.obtenerNombre() + " es el ganador");
			System.out.println("***********************************************");
		}else {
			System.out.println("***********************************************");
			System.out.println("          " + robot2.obtenerNombre() + " es el ganador");
			System.out.println("***********************************************");
		}
	}
}
