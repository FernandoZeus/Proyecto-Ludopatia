package VGL0323SimuladorDeGuerras;

public class Caballeria extends UnidadArmada{

	public Caballeria(){
		vida=120;
		daño=50;
		nombre="caballeria";
	}

	@Override
	String obtenerTipo() {
		// TODO Auto-generated method stub
		return "Caballeria v:" + vida;
	}

	@Override
	boolean ataqueEfectivo() {
		//return Math.random()*10<Math.random()*10;
		return true;
	}
	

}
