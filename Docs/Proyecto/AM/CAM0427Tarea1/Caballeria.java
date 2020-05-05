package CAM0427Tarea1;

public class Caballeria extends UnidadArmada{

	public Caballeria () {
		vida = 120;
		danio = 50;
		tipoUnidad = "Caballería";
	}
	
	public String obtenerTipo() {
		return tipoUnidad;
	}

	public boolean ataqueEfectivo() {
		
		int prob1 = ((int)Math.random()*10 + 1);
		int prob2 = ((int)Math.random()*10 + 1);
		
		if (prob1 < prob2) {
			return true;
		} else {
			return false;
		}
	}
}
