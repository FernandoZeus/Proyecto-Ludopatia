package CRS0327BattleBots;

public abstract class Equipamiento {
	private String nombre;
	private int danio;
	private int probavilidad;
	
	public Equipamiento(String nombre ,int danio, int probavilidad) {
		this.nombre=nombre;
		this.danio=danio;
		this.probavilidad=probavilidad;
		}
	
	public int obtenerdanio() {
		int numero=(int)(Math.random()*100+1);
		if(numero>probavilidad) {
			return danio=0;
		}else {
			return danio;
		}
		
	
		
	}
	public int getdanio() {
		return danio;
	}
	public String getnombre() {
		return nombre;
	}
	public int devolverDanio(int danioa) {
		int numero=(int)(Math.random()*100+1);
		if(numero>probavilidad) {
			return danio-danioa;
		}else {
			return danioa;
		}
		
	}
	public String toString() {
		return "Daño:"+danio+"\n"+"Nombre:"+nombre+"\n";
	}
	


	
	

}
