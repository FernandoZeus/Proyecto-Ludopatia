package VGL0327BattleRobots;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Robot robot1 = new Robot("arek");
		Robot robot2 = new Robot("blitzcrank");
		
		while(robot1.estaVivo()&&robot2.estaVivo()) {
			robot1.recibirAtaque(robot2.calcularAtaque());
			robot2.recibirAtaque(robot1.calcularAtaque());
			
		}
		
		//decidir quien ha ganado o si ha habido empate
		
		if(robot1.estaVivo()&&robot2.estaVivo()==false) {
			System.out.println("ha ganado el robot 1: "+ robot1.toString());
		}
		if(robot2.estaVivo()&&robot1.estaVivo()==false) {
			System.out.println("ha ganado el robot 2: "+ robot2.toString());
		}
		if(robot1.estaVivo()==false&&robot2.estaVivo()==false) {
			System.out.println("Empate");
		}
		
		
		
	}
	
	

}
