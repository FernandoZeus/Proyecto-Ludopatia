package VLG.simuladorDeGuerras;

public class Ejercito {
	
	String nombre;
	int tropas;
	UnidadArmada [] ejercito;
	UnidadArmada [] resto;
	

	public Ejercito(String nombre, int tropas) {
		this.nombre=nombre;
		this.tropas=tropas;
		ejercito=new UnidadArmada[tropas];
		for(int i=0;i<tropas;i++) {
			ejercito[i]=UnidadArmada.generaUnidad();
		}
		
	}
	public String nombre() {
		return nombre;
	}
	
	public Ejercito(String nombre) {
		this.nombre=nombre;
		tropas=10;
		ejercito= new UnidadArmada[tropas];
		for(int i=0;i<tropas;i++) {
			ejercito[i]=UnidadArmada.generaUnidad();
		}
	}

	
	//falta tener la formacion aleatoria.
	public void formacion() {
		
		
		
	}
	
	public void ataca(Ejercito objeto) {
	
		for(int i=0;i<tropas;i++) {
			int a =(int)(Math.random()*(objeto.tropas));
			ejercito[i].atacar(objeto.ejercito[a]);
		}
		
		
	}
	
	
	// aqui me da un problema que todavia no se como solucionar
	public void retirarFallecidos() {
		int vivos=0;
		
		for(int i=0; i<tropas;i++) {
			if(ejercito[i].estaViva()) {
				vivos++;
			}
		}
		
		resto = new UnidadArmada[vivos];
		
		for(int i= 0; i<tropas; i++) {
			if(ejercito[i].estaViva()) {
				for(int j=0;j<vivos;j++) {
					ejercito[i]=resto[j];
					resto=ejercito;
				}
			}
		}
		
		
	}
	
	public boolean puedeLuchar() {
		boolean ok=false;
		for(int i=0;i<tropas;i++) {
			if(ejercito[i].estaViva()) {
				ok=true;
			}
		}
		
		return ok;
		
		
	}
	
}
