package Ejercicio1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Persona {


	//Variables miembro de clase Persona
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	//Constructores
	public Persona() {
	    this.dni = "Sin DNI";
	    this.nombre = "Sin nombre";
	    this.apellido = "Sin apellido";
	    this.fechaNacimiento = LocalDate.of(2025, 1, 1);
	    this.genero = "Sin género";
	    this.direccion = "Sin dirección";
	    this.telefono = "Sin teléfono";
	    this.email = "Sin email";
	}

	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, 
			        String genero, String direccion, String telefono, String email)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento; 
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	 }

	 //Metodo toString
	 @Override
	 public String toString() 
	 {
		 DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 String fechaFormateada = fechaNacimiento.format(formatoFecha);
		
		 return "Persona\nDNI: " + dni + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nFecha Nacimiento: "
		 		+ fechaFormateada + "\nGénero: " + genero + "\nDirección: " + direccion + "\nTeléfono: " + telefono
		 		+ "\nEmail: " + email;
	 }
	 
	 
	 public static boolean exVerificarDNI(String dni)
	 {
	     // Si la longitud es distinta de 8, devolvemos falso.
	     if (dni.length() != 8)
	     {
	         return false;
	     }

	     // Recorremos cada caracter del string.
	     for (int i = 0; i < dni.length(); i++)
	     {
	         char c = dni.charAt(i);

	         // esto sería: si es distinto de "ser un número" entonces devolveme falso.
	         if (!Character.isDigit(c))
	         {
	             return false;
	         }
	     }

	     // Si paso ambos IFs, entonces vamos a retornar un true.
	     return true;
	 }
	 
		//Metodo hashCode
		public int hashCode() 
		{
			return Objects.hash(apellido, direccion, dni, email, fechaNacimiento, genero, nombre, telefono);
		}

		//Metodo equals (Tomando como criterio diferenciador el DNI)
		public boolean equals(Object obj) 
		{
		    if (this == obj) return true;  
		    if (obj == null || getClass() != obj.getClass()) return false;  
		    Persona persona = (Persona) obj;
		    return Objects.equals(dni, persona.dni);
		}
}