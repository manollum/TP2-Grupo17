package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio1_a {

	public static void main(String[] args) {
			 
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
