package VLG.EjemploDeColleciones;

import java.util.HashSet;
import java.util.Set;

public class Colecs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hace que si metemos el mismo nombre no añade valores repetidos.
		
		 Set<String> conjunto = new HashSet(); 
		 conjunto.add("Enrique");
		 conjunto.add("Fran");
		 conjunto.add("Manu");
		 conjunto.add("Manu");
		 conjunto.add("Carla");
		 conjunto.add("");
		 //conjunto.remove("pera");
		 for(String s : conjunto) {
		     System.out.println(s);
		 }

	}

}
