package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio1_a {

	public static void main(String[] args) {
			/*
			 • Crear una Persona con el DNI "AA202020" y validar el DNI con exVerificarDNI. 
			 • Crear otra Persona con el DNI "20202020" y validar nuevamente. 
			 
			 • Utilizar try-catch: o Si el DNI es válido → mostrar el mensaje: 
			 "Persona agregada correctamente". o 
			 Si el DNI es inválido → mostrar el mensaje: "Persona no agregada por no verificar el DNI". 
			 */
			 
		Persona p1 = new Persona();
		p1.setDni("AA202020");
		
		Persona p2 = new Persona();
		p2.setDni("20202020");
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		
		for (Persona persona : listaPersonas) {
			
			try 
			{
				Persona.exVerificarDNI(persona.getDni());
				System.out.println("Persona agregada correctamente");
			}
			
			catch(ExVerificarDNI e)
			{
				System.out.println("Persona no agregada por no verificar el DNI");
			}
			
		}
		

	}

}
