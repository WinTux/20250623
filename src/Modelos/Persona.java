package Modelos;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	double estatura;
	String domicilio;
	String tipoDeSangre;
	String profesion;
	String telefonoCel;
	String genero;
	String nacionalidad;
	public Persona() { // Constructor por defecto
		nombre = "NN";
		apellido = "NA";
		edad = 10;
		estatura = 1.5;
		domicilio = "Av. Siempre viva";
	}
	// Hablar sobre constructor por defecto
	public Persona(String n, String a) {
		nombre = n;
		apellido = a;
	} // new Persona("Pepe","PErales");
}
