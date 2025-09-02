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
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getEmail() {
		return email;
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
	 
	 
	 public static boolean exVerificarDNI(String dni) throws ExVerificarDNI
	 {
		 //Bandera. Se asume que la cadena recibida posee formato válido.
		 boolean formatoValido = true;
		 
	     // Si la longitud es distinta de 8, cambiamos el estado de la bandera.
	     if (dni.length() != 8)
	     {
	         formatoValido = false;
	     }

	     // Recorremos cada caracter del string.
	     for (int i = 0; i < dni.length() && formatoValido; i++)
	     {
	         char c = dni.charAt(i);

	         // esto sería: si es distinto de "ser un número" entonces devolveme falso.
	         if (!Character.isDigit(c))
	         {
	        	 formatoValido = false;
	         }
	     }

	     if(!formatoValido) 
	     {
	    	 ExVerificarDNI ex = new ExVerificarDNI();
	    	 throw ex;
	     }
	     // Si paso ambos IFs, entonces vamos a retornar un true.
	     return true;
	 }
	 
		//Metodo hashCode
		public int hashCode() {
			return Objects.hash(dni);
		}

		//Metodo equals (Utiliza como criterio diferenciante el DNI)
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			return Objects.equals(dni, other.dni);
		}
}