package CRS0323SimuladorGuerras;


public class Caballeria extends unidadArmada {
	public Caballeria() {
		vida=120;
		danio=50;
		tipoUnidad="Caballeria";
	}
	
	@Override
	public String obtenerTipo() {
		// TODO Auto-generated method stub
		return tipoUnidad;
	}

	@Override
	public boolean ataqueEfectivo() {
		int n1,n2;
		n1=(int)(Math.random()*10+1);
		n2=(int)(Math.random()*10+1);
		if (n1>n2) {
			return false;
		}else {
			return true;
		}
		
	}

}
