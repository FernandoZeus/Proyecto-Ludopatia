package VGL0323SimuladorDeGuerras;

public class Batallon extends UnidadArmada {

	public Batallon(){
		vida=80;
		daño=20;
		nombre="batallon";
	}

	@Override
	String obtenerTipo() {
		// TODO Auto-generated method stub
		return "Batallon v:" + vida;
	}

	@Override
	boolean ataqueEfectivo() {
		//return Math.random()*100/3==0;
		return true;
	}
	
	
}
