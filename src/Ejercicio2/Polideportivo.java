package Ejercicio2;

public class Polideportivo implements IinstalacionDeportiva, Edificio {

	//Variables miembro de la clase
	private static final int tipoInstancia = 1;
	private String nombre;
	private double metrosDeLargo;
    private double metrosDeAncho;
    
    //Constructores
    Polideportivo() {
    	nombre = "Sin nombre";
    	metrosDeLargo = 0.0;
    	metrosDeAncho = 0.0;
    }
    
    Polideportivo(String nombre, double metrosDeLargo, double metrosDeAncho) {
    	this.nombre = nombre;
    	this.metrosDeLargo = metrosDeLargo;
        this.metrosDeAncho = metrosDeAncho;
    }
	
	//Métodos de la Interfaz
	@Override
	public int getTipoDeInstalacion() {
		return tipoInstancia;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return metrosDeLargo * metrosDeAncho; 
	}
	
	//Otros métodos
	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + ", metrosDeLargo=" + metrosDeLargo + ", metrosDeAncho="
				+ metrosDeAncho + "]";
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getMetrosDeLargo() {
		return metrosDeLargo;
	}

	public void setMetrosDeLargo(double metrosDeLargo) {
		this.metrosDeLargo = metrosDeLargo;
	}

	public double getMetrosDeAncho() {
		return metrosDeAncho;
	}

	public void setMetrosDeAncho(double metrosDeAncho) {
		this.metrosDeAncho = metrosDeAncho;
	}
}
