# Comentarios a ejercicios

## 0506

Tienes el código para rellenar el array repetido...

```

	public static void main(String[] args) {
		
		
		arrayListPersona(10); <----- ¿Lo llamas y no recoges el resultado?
		
		System.out.println();
		
		//Creo un ArrayList para poder usarlo con la segunda funci�n
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		
		for (int i = 0; i < 5; i++) {
			listaPersona.add(i, Persona.generarPersona());
		}
		//salto de l�nea para diferenciarlo de el primer ejercicio
		System.out.println();
		
		//utilizo la segundo funci�n
		System.out.println(ordenInverso(listaPersona));
	}
	
	public static ArrayList<Persona> arrayListPersona(int cantidad){
		
		ArrayList<Persona> relleno = new ArrayList<Persona>();
		
		for (int i = 0; i < cantidad; i++) {
			relleno.add(i, Persona.generarPersona());
			System.out.println(relleno.get(i));
		}
		return relleno;
	}

```

Las funciones están bien aunque en el main no las de generar los arrays


La parte del HashMap está cerca pero no la devuelves ni lo metes en su carpeta, entiende mi ejemplo de ayer.
La parte de impresión del HashMap no tiene ningún sentido


Nota 6