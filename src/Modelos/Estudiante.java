package Modelos;

public class Estudiante extends Persona implements Ciudadano{
	private String carrera;
	private int matricula;
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public Estudiante() {
		super();
		carrera = "Ciencias juridicas";
		matricula = 654321;
	}
	public Estudiante(String carrera, int matricula) {
		super();
		this.carrera = carrera;
		this.matricula = matricula;
	}
	public Estudiante(String carrera, String facultad) {
		super("NOMBRE","APELLIDO");
		this.carrera = carrera + ", "+facultad;
	}
	
	public Estudiante(String nombre, String apellido, String carrera, int matricula) {
		super(nombre,apellido);
		this.carrera=carrera;
		this.matricula=matricula;
	}
	public Estudiante(String nombre, String apellido, int edad, String domicilio, String telefonoCel, String genero,
			String carrera, int matricula) {
		super(nombre, apellido, edad, domicilio, telefonoCel, genero);
		this.carrera = carrera;
		this.matricula = matricula;
	}
	
	public void hablar() {
		System.out.println("Soy un estudiante y estoy hablando de cosas estudiosas");
	}
	public void hablar(String mensaje) {
		System.out.println("Soy un estudiante y digo que " + mensaje);
	}
	@Override
	public void votar(String partido) {
		System.out.println("Como estudiante, voy a votar por el Centro de estudiantes " + partido);
	}
	@Override
	public void pagarImpuestos() {
		System.out.println("Soy estudiante y tengo impuestos que pagar.");
	} 
}
