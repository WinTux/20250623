package Modelos;

public class Persona {
	// ABSTRACCION
	protected String nombre;
	protected String apellido;
	private int edad;
	//public double estatura;
	private String domicilio;
	//public String tipoDeSangre;
	//public String profesion;
	private String telefonoCel;
	private String genero;
	//public String nacionalidad;
	
	public Persona() { // Constructor por defecto
		nombre = "NN";
		apellido = "NA";
		edad = 10;
		//estatura = 1.5;
		domicilio = "Av. Siempre viva";
	}
	// Hablar sobre constructor por defecto
	
	public Persona(String nom, String ape) {
		nombre = nom;
		apellido = ape;
	}
	// new Persona("Pepe","PErales");
	
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	public String obtenerNombre() {
		return nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad >= 18)
			this.edad = edad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefonoCel() {
		return telefonoCel;
	}

	public void setTelefonoCel(String telefonoCel) {
		this.telefonoCel = telefonoCel;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void hablar() {
		System.out.println("Soy una persona y estoy hablando");
	}
	
	public void caminar(int pasos) {
		System.out.println("Estoy caminando " + pasos + " pasos.");
	}
	public String nombreCompleto() {
		return nombre + " " + apellido;
	}
}
