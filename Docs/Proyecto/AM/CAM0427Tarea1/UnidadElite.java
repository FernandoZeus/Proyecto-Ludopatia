package CAM0427Tarea1;

public class UnidadElite extends UnidadArmada{
	
	
	public UnidadElite () {
		vida = 100;
		danio = 20;
		tipoUnidad = "UnidadElite";
	}
	
	public String obtenerTipo() {
		return tipoUnidad;
	}

	public boolean ataqueEfectivo() {
		return true;
	}
}
