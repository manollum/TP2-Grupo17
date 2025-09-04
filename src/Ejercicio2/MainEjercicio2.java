package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio2 {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        // Mismos objetos que en el Aporte 1
        lista.add(new Polideportivo("Poli Norte", 45.0, 20.0));
        lista.add(new Polideportivo("Poli Sur", 60.0, 35.0));
        lista.add(new Polideportivo("Poli Centro", 50.0, 30.0));
        lista.add(new EdificioDeOficina(120, 60.0, 90.0));
        lista.add(new EdificioDeOficina(90, 50.0, 92.0));

        // Iterator para recorrer la LISTA y mostrar atributos
        Iterator<Object> it = lista.iterator();
        while (it.hasNext()) {
            Object obj = it.next();

            if (obj instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) obj;
                System.out.println("[Polideportivo] nombre:" + p.getNombre()
                		+ ", superficie=" + p.getSuperficieEdificio()
                		+ "m2, largo=" + p.getMetrosDeLargo()
                		+ "m, ancho=" + p.getMetrosDeAncho()
                		+ "m");
            } else if (obj instanceof EdificioDeOficina) {
                EdificioDeOficina e = (EdificioDeOficina) obj;
                System.out.println("[EdificioDeOficina] superficie=" + e.getSuperficieEdificio()
                        + " m2, largo=" + e.getMetrosDeLargo()
                        + " m, ancho=" + e.getMetrosDeAncho()
                        + " m, oficinas=" + e.getNumeroDeOficina());
            }
        }
    }
}
