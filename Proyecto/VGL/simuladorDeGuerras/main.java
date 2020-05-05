package VLG.simuladorDeGuerras;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Batallon b = new Batallon();
		//Caballeria c = new Caballeria();
		//UnidadElite a = new UnidadElite();
		
		//System.out.println(a.obtenerTipo());
		//System.out.println(b.obtenerTipo());
		//System.out.println(c.obtenerTipo());
		
		/*a.atacar(b);
		System.out.println(b.estaViva());
		a.atacar(b);
		System.out.println(b.estaViva());
		a.atacar(b);
		System.out.println(b.estaViva());
		a.atacar(b);
		System.out.println(b.estaViva());
		*/
		int diaGuerra=1;
		Ejercito eAtaca;
		Ejercito eDefiende;
		
		Ejercito e1 =new Ejercito("urss",10);
		Ejercito e2 =new Ejercito("eeuu",10);
		
		while(e1.puedeLuchar()&&e2.puedeLuchar()) {
			System.out.println("************");
			System.out.println("DIA:" + diaGuerra);
			System.out.println("************");
			
			boolean aleatorio = (int)(Math.random()*10)%2==0;
			
			if(aleatorio) {
				eAtaca= e1;
				eDefiende = e2;
			}else {
				eAtaca = e2;
				eDefiende = e1;
			}
			
			System.out.println(eAtaca.nombre() + " ataca a " + eDefiende.nombre());
			
			System.out.println("Formacion!");
			eAtaca.formacion();
			eDefiende.formacion();
			
			System.out.println("Ataque!!!");
			eAtaca.ataca(eDefiende);
			
			System.out.println("retirando muertos...");
			eDefiende.retirarFallecidos();
			
			System.out.println("resultado del dia"+ diaGuerra);
			System.out.println(eAtaca.nombre());
			System.out.println(eDefiende.nombre());
			diaGuerra++;
			
		}
		
		if(e1.puedeLuchar()) {
			System.out.println("ha ganado " + e1.nombre());
		}else {
			System.out.println("ha ganado " + e2.nombre());
		}
			
		}
	}


