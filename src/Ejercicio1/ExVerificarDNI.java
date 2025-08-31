package Ejercicio1;

	
public class ExVerificarDNI extends RuntimeException {
	    
	    public ExVerificarDNI()
	    {
	    }

		@Override
		public String getMessage() {

			return "Ingreso inválido de caracteres, intente nuevamente";
		}
	    
	    
	    
}
