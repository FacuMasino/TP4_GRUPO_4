package ejercicio2;

public class CampoSeleccionadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CampoSeleccionadoException() 
	{
		
	}

	@Override
	public String getMessage() {
		
		return "Seleccionar nota en TP";
	}
}
