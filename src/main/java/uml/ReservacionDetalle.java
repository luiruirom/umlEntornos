package uml;

import java.util.*;

public class ReservacionDetalle {
	private Date fechaInicio;
	private Date fechaFinal;
	private Byte gasolina;
	
	public Collection reservaciones = new TreeSet();
	public Collection coches = new TreeSet();
}
