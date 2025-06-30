package Modelos;

public class Proveedor extends Persona {
	private String correo;
	private int nit;
	public Proveedor(String correo, int nit) {
		super();
		this.correo = correo;
		this.nit = nit;
	}
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proveedor(String nombre, String apellido, int edad, String domicilio, String telefonoCel, String genero) {
		super(nombre, apellido, edad, domicilio, telefonoCel, genero);
		// TODO Auto-generated constructor stub
	}
	public Proveedor(String nom, String ape) {
		super(nom, ape);
		// TODO Auto-generated constructor stub
	}
	public Proveedor(String nombre, String apellido, int edad, String domicilio, String telefonoCel, String genero,
			String correo, int nit) {
		super(nombre, apellido, edad, domicilio, telefonoCel, genero);
		this.correo = correo;
		this.nit = nit;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	
	@Override public void hablar(String mensaje) {
		System.out.println("Como proveedor digo que " + mensaje);
	} 
}
