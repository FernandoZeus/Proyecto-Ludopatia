package CRS0323SimuladorGuerras;

public class unidadElite extends unidadArmada {
	
	public unidadElite() {
		vida=100;
		danio=20;
		tipoUnidad="unidadElite";
	}
	

	@Override
	public String obtenerTipo() {
		// TODO Auto-generated method stub
		return tipoUnidad;
	}

	@Override
	public boolean ataqueEfectivo() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
