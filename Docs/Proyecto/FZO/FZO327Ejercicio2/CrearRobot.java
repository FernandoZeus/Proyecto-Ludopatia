package FZO327Ejercicio2;

public class CrearRobot implements IRobot {

	//Aquí declaro  los array de armas y de defensa
	
	private Arma_Ataque [] ArmasAtaque =  new Arma_Ataque[3];
	private Arma_Defensa [] ArmasDefensa = new Arma_Defensa[3];
	
	int VIDA = 100;
	int VidaActual; //todos lo que vayamos a utilizar por otra clase o imprimir se tien que declarar en la clase
	
	String NombreRobot; 
	
	final String EFECTIVO = "¡ Ha sido efectivo !";
	
	final String NOEFECTIVO = "¡ NO Ha sido efectivo !";
	
	public CrearRobot(String NombreRobot) {
		
		this.NombreRobot = NombreRobot;
		
		VIDA=100;
	
	this.ArmasAtaque [0] = new Arma_Ataque("Motosierra",29,30);
	this.ArmasAtaque [1] = new Arma_Ataque("Pistola",20,50);
	this.ArmasAtaque [2] = new Arma_Ataque("Gas" ,30 ,60);

	
	this.ArmasDefensa [0] = new Arma_Defensa("Escudo" , 10  ,20);
	this.ArmasDefensa [1]= new Arma_Defensa("ChalecoAntibalas" , 30 ,50);
	this.ArmasDefensa [2] = new Arma_Defensa("MascaraAntiGas" , 40 , 60);
	
	
	}

	
	public String getNombre() {
		
		return NombreRobot;
		
	}
	
	public int  CalcularAtaque() {
		
		int i;
		
		int ObtenerDaño;
		
		int DañoTotal=0;
		
		for (i=0 ; i < ArmasAtaque.length;i++) {
				
				//ObtenerDaño=ArmasAtaque[i].ObtenerDaño();
			
				if(ArmasAtaque[i].PosibilidadFallo()){ 
					

					System.out.println(NombreRobot  + " Ataca ");
					
					System.out.println();
					
					System.out.println( "Nombre : "+ ArmasAtaque[i].Nombre );//this.getNombre()
					
					System.out.println();
					
					System.out.println( NOEFECTIVO );
					
					System.out.println();
					
					System.out.print(DañoTotal);
				
				}else {
					
					System.out.println(NombreRobot  + " Ataca ");
					
					System.out.println();
					
					System.out.println( "Nombre : "+ ArmasAtaque[i].Nombre );//this.getNombre()
					
					System.out.println();
					
					System.out.println( EFECTIVO );
					
					System.out.println();
					
					DañoTotal+=ArmasAtaque[i].ObtenerDaño();
					
					System.out.println(DañoTotal);
					
					
				
				}
		}
		
		return DañoTotal;
			
	}
	
	public void RecibirAtaque ( int DañoTotal) {
		
		int i;
		
		int DañoTotalRecibido=0;
	
		int VidaActual;
		
		int contador;
		
		//DañoTotal=CalcularAtaque();
		
		for (i=0 ; i < ArmasDefensa.length;i++) { //si el daño que me retorna el numero total de Calcular Ataque 
			
			if(  ArmasAtaque[i].Daño > ArmasDefensa[i].Daño ) {// && ArmasDefensa[i].PosibilidadFallo()
			        	            //CalcularAtaque()
				DañoTotalRecibido += ArmasDefensa[i].Daño  ;
				
				contador = DañoTotal - ArmasDefensa[i].Daño;
				//contador = ArmasAtaque[i].Daño - ArmasDefensa[i].Daño;// daño que queda despues de cada acción
				
				if ( contador < 0) {
					
					System.out.println(" Protección : " +  ArmasDefensa[i].Nombre + EFECTIVO + " No ha podido proteger nada de daño ");
				}
					
				System.out.println(" Protección : " +  ArmasDefensa[i].Nombre + EFECTIVO + " Protege cantidad de daño  " + contador );
			
			}else {
				
				System.out.println(" Protección : " +  ArmasDefensa[i].Nombre + NOEFECTIVO + " Protege cantidad de daño " + " 0 " );
				
			}
			
			
		}
		
		VidaActual= VIDA - DañoTotalRecibido;
	
		System.out.println( " Vida anterior : " + VIDA );
		
		System.out.println( " Vida actual : " + VidaActual);
		
		//System.out.print(NombreRobot +  " tiene :  " + VidaActual);
		
		VIDA=VidaActual;
	}
	
	public boolean EstáVivo() {
		
		if (VIDA <= 0 ) {
			
			return false;
			
		}else {
			
			return true;
		}
		
	}
	
	public String toString() {
		
		return NombreRobot + " tiene " + VidaActual + " \n " + ArmasAtaque.toString();
		
		
	}
	
	
}
