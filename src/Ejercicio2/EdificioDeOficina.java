package Ejercicio2;

public class EdificioDeOficina implements Edificio {
    private int numeroDeOficinas;
    private double metrosDeLargo;
    private double metrosDeAncho;

    // Constructor vacío
    public EdificioDeOficina() {
    	numeroDeOficinas = 0;
    	metrosDeLargo = 0.0;
    	metrosDeAncho = 0.0;
    }

    // Constructor con parámetros
    public EdificioDeOficina(int numeroDeOficinas, double metrosDeLargo, double metrosDeAncho) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.metrosDeLargo = metrosDeLargo;
        this.metrosDeAncho = metrosDeAncho;
    }

    // Getter y Setter
    public int getNumeroDeOficina() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }
    
    public void setMetrosDeLargo(double metrosDeLargo) {
    	this.metrosDeLargo = metrosDeLargo;
    }
    
    public double getMetrosDeLargo() {
    	return metrosDeLargo;
    }
    
    public void setMetrosDeAncho(double metrosDeAncho) {
    	this.metrosDeAncho = metrosDeAncho;
    }
    
    public double getMetrosDeAncho() {
    	return metrosDeAncho;
    }

    // Método obligatorio de la interfaz Edificio
    @Override
    public double getSuperficieEdificio() {
        return metrosDeLargo * metrosDeAncho; 
    }

    @Override
    public String toString() {
        return "Edificio de Oficinas con " + numeroDeOficinas + " oficinas.";
    }
}

