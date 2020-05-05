package VGL0323SimuladorDeGuerras;

public class UnidadElite extends UnidadArmada {

	public UnidadElite(){
		vida=100;
		daño=20;
		nombre="unidad de elite";
	}

	@Override
	String obtenerTipo() {
		// TODO Auto-generated method stub
		return "UnidadElite v:"+ vida;
	}

	@Override
	boolean ataqueEfectivo() {
		return true;
	}
	
}
