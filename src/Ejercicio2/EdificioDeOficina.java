package Ejercicio2;

public class EdificioDeOficina implements Edificio {
    private int numeroDeOficinas;
    private String nombreEdificio;
    
    //Constructor vacío
    public EdificioDeOficina()
    {
    }
    
    public EdificioDeOficina(String nombreEdificio, int numeroDeOficinas) {
        this.nombreEdificio = nombreEdificio;
        this.numeroDeOficinas = numeroDeOficinas;
    }

    //Getters y setters 
        
    public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	public String getNombreEdificio() {
		return nombreEdificio;
	}

	public void setNombreEdificio(String nombreEdificio) {
		this.nombreEdificio = nombreEdificio;
	}
	
	

	
	@Override
	public String toString() {
		return "Oficinas:" + numeroDeOficinas + ", del edificio:" + nombreEdificio;
	}

	//metodo que hay que desarrollar por implementar la interface Edificio
	@Override
    public double getSuperficieEdificio() {
        return 0; 
    }
    
    
}
