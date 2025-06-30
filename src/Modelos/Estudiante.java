package Modelos;

public class Estudiante extends Persona{
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
}
