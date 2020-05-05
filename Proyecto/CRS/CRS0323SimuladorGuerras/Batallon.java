package CRS0323SimuladorGuerras;

public class Batallon extends unidadArmada{
	
	public Batallon() {
		vida=80;
		danio=20;
		tipoUnidad="Batallon";
	}
	

	@Override
	public String obtenerTipo() {
		// TODO Auto-generated method stub
		return tipoUnidad;
	}

	@Override
	public boolean ataqueEfectivo() {
		int probabilidad;
		probabilidad= (int)(Math.random()*100+1);
		if(probabilidad%3==0) {
			return true;
		}else {
			return false;
			}
		
	}

}
