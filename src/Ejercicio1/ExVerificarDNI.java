package Ejercicio1;

	
public class ExVerificarDNI extends RuntimeException {
	    
	    public ExVerificarDNI()
	    {
	    }

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "Ingreso invádildo de caracteres, intente nuevamente";
		}
	    
	    
	    
}
