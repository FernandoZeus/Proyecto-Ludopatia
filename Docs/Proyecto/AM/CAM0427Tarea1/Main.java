package CAM0427Tarea1;

public class Main {

	public static void main(String[] args) {
		
		Ejercito China = new Ejercito ("China", 10);
		Ejercito URSS = new Ejercito ("URSS", 12);
		
		int diaGuerra = 1;
		
		while (China.puedeLuchar() == true && URSS.puedeLuchar() == true) {
			System.out.println("***************************");
			System.out.println("         Día: " + diaGuerra);
			System.out.println("*************************** \n");
			
			int aleatorio = ((int)(Math.random()*11));
			
			if (aleatorio % 2 == 0) {
				System.out.println(China.getNombre() + " ataca a " + URSS.getNombre());
				System.out.println(URSS.getNombre() + " se defiende de " + China.getNombre() + "\n" );
			}else {
				System.out.println(URSS.getNombre() + " ataca a " + China.getNombre());
				System.out.println(China.getNombre() + " se defiende de " + URSS.getNombre() + "\n" );
			}
			
			System.out.println("¡¡¡FORMACIÓN!!!  \n");
			
			China.formacion();
			URSS.formacion();
			
			System.out.println("¡¡¡ATAQUE!!!\n");
			
			if (aleatorio % 2 == 0) {
				China.ataca(URSS);
			}else {
				URSS.ataca(China);
			}
			
			System.out.println("Retirando tropas caídas...");
			
			if (aleatorio % 2 == 0) {
				China.retirarFallecidos();
			}else {
				URSS.retirarFallecidos();
			}
			
			System.out.println("Resultado del día " + diaGuerra++);
			
			if (aleatorio % 2 == 0) {
				System.out.println(China.getNombre() + " fue el atacante." );
				System.out.println(URSS.getNombre() + " fue el defensor." + "\n");
			}else {
				System.out.println(URSS.getNombre() + " fue el atacante." );
				System.out.println(China.getNombre() + " fue el defensor." + "\n");
			}
		}
		
		if (China.puedeLuchar()) {
			System.out.println("¡¡¡" + China.getNombre() + " ganó!!!");
		}else {
			System.out.println("¡¡¡" + URSS.getNombre() + " ganó!!!");
		}
	}
}
