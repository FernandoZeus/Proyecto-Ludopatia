package CAM0323Tarea2;

public abstract class Equipamiento{
	
	private String nombre;
	private int danioBloqueo;
	private int fiabilidad;
	
	public Equipamiento(String nombre, int danioBloqueo, int fiabilidad) {
		
		this.nombre = nombre;
		this.danioBloqueo = danioBloqueo;
		this.fiabilidad = fiabilidad;
	}
	
	public int probabilidadDanio() {
		
		int probabilidad = ((int)(Math.random()*100 + 1));
		
		if(probabilidad <= fiabilidad) {
			return danioBloqueo;
		}else {
			return 0;
		}
	}
	
	public int bloquearDanio(int danioRecibido) {
		
		int porcentaje = ((int)(Math.random()*100+1));
		
		if(porcentaje <= fiabilidad) {
			int danioEscudo = danioBloqueo - danioRecibido;
			
			if (danioEscudo < 0) {
				danioEscudo = danioEscudo * (-1);
				System.out.println("El escudo se ha roto y ha retenido " + danioBloqueo);
				return danioEscudo;
			}else {
					System.out.println("El escudo ha aguantado todo el golpe");
					return 0;
				}
		}else {
			return danioRecibido;
		}
	}
	
	
	public int getDanio() {
		return danioBloqueo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return "El objeto es: " + nombre + "\n" + "Estadísticas: " + danioBloqueo + "\n";
	}
	
}
