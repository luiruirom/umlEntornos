package uml;

import java.util.*;
	
public class Cliente {
	private String codigo;
	private String nombre;
	private String dni;
	private String direccion;
	private String telefono;
	
	public Collection avalaA = new TreeSet(); 
	public Collection esAvaladoPor = new TreeSet();
	public Collection reservas = new TreeSet();
}
