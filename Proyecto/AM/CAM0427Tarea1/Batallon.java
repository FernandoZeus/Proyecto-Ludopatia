package CAM0427Tarea1;

public class Batallon extends UnidadArmada{

	public Batallon () {
		vida = 80;
		danio = 20;
		tipoUnidad = "Batallon";
	}
	
	public boolean ataqueEfectivo() {
		
		int prob = ((int)Math.random()*100 + 1);
		
		if (prob % 3 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String obtenerTipo() {
		return tipoUnidad;
	}
}
