package CRS0323SimuladorGuerras;

public class mainPrueba {

	public static void main(String[] args) {
		unidadArmada u1= new Caballeria();
		unidadArmada u2= new Batallon();
		
		u1.atacar(u2);
		u1.atacar(u2);
		System.out.println(u2.estaViva());
		

	}

}
