package Ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona
{

	//Variables miembro de clase Empleado
	private final int legajo;
	private String puesto;
	private static int proximoLegajo = 1000;
 	
	//Constructores
	public Empleado() {
		super();
		this.puesto = "Sin puesto";
		legajo = proximoLegajo;
		proximoLegajo++;
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, 
	        String genero, String direccion, String telefono, String email, String puesto) {
		
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		legajo = proximoLegajo;
		proximoLegajo++;
	}
	
	//Getters y Setters
	public int getLegajo() 
	{
		return legajo;
	}
	
	public String getPuesto() 
	{	 
		return puesto;
	}
	
	public void setPuesto(String puesto) 
	{
		this.puesto = puesto;
	}
	
	public static int devuelveProximoLegajo() {
		return proximoLegajo;
	}
	
	
	@Override
	public String toString() 
	{
	    return super.toString() + 
	           "\nLegajo: " + legajo + 
	           "\nPuesto: " + puesto + //Acá agrego los específicos de Empleado
	    	   "\n";
	}
	
	//Metodo hashCode
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo);
		return result;
	}

	//Metodo equals (Suma el legajo como criterio diferenciador)
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return legajo == other.legajo;
	}
	
	
}
