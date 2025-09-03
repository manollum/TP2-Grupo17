package Ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) 
	{
		HashSet <Persona> listaPersonas = new HashSet <Persona>();
		
		Persona p1 = new Persona("11111111","Martina","Gómez",LocalDate.of(1995, 3, 12),"Femenino",
				                 "Av. Corrientes 1234, CABA","1111111111","martina.gomez@gmail.com");
		Persona p2 = new Persona("22222222", "Lucas","Fernández", LocalDate.of(1990, 7, 25), "Masculino",
				                 "Calle San Martín 456, Cordoba", "2222222222", "lucas.fernandez@yahoo.com.ar");
		Persona p3 = new Persona("33333333","Camila", "López", LocalDate.of(2000, 11, 5), "Femenino",
				                 "Av. Pellegrini 789, Rosario", "3333333333", "camila.lopez@gmail.com.ar");
		Persona p4 = new Persona("44444444","Diego", "Martínez", LocalDate.of(1988, 1, 30), "Masculino",
				                 "Calle Belgrano 1010, Mendoza", "4444444444", "diego.martinez@yahoo.com");
		Persona p5 = new Persona("55555555", "Valentina", "Ruiz", LocalDate.of(1998, 9, 18), "Femenino",
				                 "Av. Libertador 2222, Buenos Aires", "5555555555", "valentina.ruiz@example.com");
		Persona p6 = new Persona("11111111","Martina","Gómez",LocalDate.of(1995, 3, 12),"Femenino",
                                 "Av. Corrientes 1234, CABA","6666666666","martina.gomez@gmail.com");
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5);
		listaPersonas.add(p6); 
		
		// p6 -> No lo agrega, ya que p1 y p6 son iguales (tienen el mismo DNI).
		// A través del método equals detecta que ya hay un objeto igual a este guardado.
		// Las clases que implementan la interfaz Set no permiten almacenar objetos duplicados.
		
		
		
		Iterator<Persona> it = listaPersonas.iterator();
			
		// Al estar utilizando un HashSet, las personas se mostrarán sin seguir ningún orden particular.
		
		System.out.println("Listado de Personas:\n");
		
		while(it.hasNext())
		{
			Persona persona = it.next();
			it.remove();
			
			System.out.println(persona.toString() + "\n");
		}
	}
}
