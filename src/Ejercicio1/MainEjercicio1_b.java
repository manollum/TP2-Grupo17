package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;


public class MainEjercicio1_b {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Empleado("40111222","Manuel","Villaverde", LocalDate.of(1998,4,12),
                "Masculino","Av. Siempre Viva 123","11-5555-1111","manuel@mail.com","Desarrollador"));

        listaEmpleados.add(new Empleado("35123456","María","Castellani", LocalDate.of(1995,9,30),
                "Femenino","Calle Los pedros 123","11-5555-2222","maria@mail.com","Analista QA"));

        listaEmpleados.add(new Empleado("32111222","Uriel","Silveira", LocalDate.of(1990,5,20),
                "Masculino","San Martín 100","11-4444-3333","uriel@mail.com","Soporte Técnico"));

        listaEmpleados.add(new Empleado("27123123","Leonardo","Frustelli", LocalDate.of(1987,12,1),
                "Masculino","Belgrano 250","11-4444-4444","leonardo@mail.com","Arquitecto de Software"));

        listaEmpleados.add(new Empleado("30123456","Joaquín","Suárez", LocalDate.of(1992,7,10),
                "Masculino","Mitre 789","11-4444-5555","joaquin@mail.com","Project Manager"));

        //System.out.println("Se cargaron " + listaEmpleados.size() + " empleados en el ArrayList.");
        
        //Iterator para mostrar la información
        Iterator<Empleado> it = listaEmpleados.iterator();
        while (it.hasNext()) {
            Empleado emp = it.next();
            System.out.println(emp);
        }
        
    }
}
