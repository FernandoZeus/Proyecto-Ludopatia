package CRS0323SimuladorGuerras;

public class MainEjercito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercito koreano=new Ejercito("korea",2);
		Ejercito Ruso=new Ejercito("Por Rusia",50);
		int Dia=1;
		
		while(koreano.puedeLuchar() && Ruso.puedeLuchar()) {
			System.out.println("******************************");
			System.out.println(Dia+"diaGuerra");
			System.out.println("******************************");
			
			int aleatorio;
			aleatorio=(int)(Math.random()*10);
			if(aleatorio%2==0) {
				
				System.out.println(koreano.getNombre()+"ataca a"+ Ruso.getNombre());
				System.out.println("Formacion!!!!!!");
				koreano.formacion();
				Ruso.formacion();
				System.out.println("Ataque!!!!!!");
				koreano.ataca(Ruso);
				System.out.println("Retirando muertos.........");
				Ruso.retirarFallecidos();
				System.out.println("Resultado del dia " + Dia++);
				
				
			}else {
				
				System.out.println(Ruso.getNombre()+"ataca a"+ koreano.getNombre());
			}
			
		}
	
	}
	

}
