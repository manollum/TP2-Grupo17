package Ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		
		TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();
		
		Empleado e1 = new Empleado("11111111", "Martina", "Gómez", LocalDate.of(1995, 3, 12), "Femenino",
				"Av. Corrientes 1234, CABA", "1111111111", "martina.gomez@gmail.com", "Analista de Datos");

		Empleado e2 = new Empleado("22222222", "Lucas", "Fernández", LocalDate.of(1990, 7, 25), "Masculino",
				"Calle San Martín 456, Córdoba", "2222222222", "lucas.fernandez@yahoo.com.ar", "Líder de Proyecto");
		
		Empleado e3 = new Empleado("33333333", "Camila", "López", LocalDate.of(2000, 11, 5), "Femenino",
				"Av. Pellegrini 789, Rosario", "3333333333", "camila.lopez@gmail.com.ar", "Diseñadora UX/UI");
		
		Empleado e4 = new Empleado("44444444", "Diego", "Martínez", LocalDate.of(1988, 1, 30), "Masculino",
				"Calle Belgrano 1010, Mendoza", "4444444444", "diego.martinez@yahoo.com", "Arquitecto de Software");
		
		Empleado e5 = new Empleado("55555555", "Valentina", "Ruiz", LocalDate.of(1998, 9, 18), "Femenino",
				"Av. Libertador 2222, Buenos Aires", "5555555555", "valentina.ruiz@example.com", "Especialista en Marketing Digital");
		
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
		
		System.out.println("Listado de Empleados \n");
		
		Iterator<Empleado> it = listaEmpleados.iterator();
		while(it.hasNext())
		{
			Empleado p = (Empleado) it.next();
			System.out.println(p.toString());
		}
	}
}