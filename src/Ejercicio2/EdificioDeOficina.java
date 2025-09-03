package Ejercicio2;

public class EdificioDeOficinas implements Edificio {
    private int numeroDeOficinas;

    // Constructor vacío
    public EdificioDeOficinas() {
    }

    // Constructor con parámetros
    public EdificioDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    // Getter y Setter
    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    // Método obligatorio de la interfaz Edificio
    @Override
    public double getSuperficieEdificio() {
        return 0.0; // implementado, aunque no sea lo central acá
    }

    @Override
    public String toString() {
        return "Edificio de Oficinas con " + numeroDeOficinas + " oficinas.";
    }
}
}
