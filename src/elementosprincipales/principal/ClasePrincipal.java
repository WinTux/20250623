package elementosprincipales.principal;

import java.util.Scanner;

import Modelos.*;

public class ClasePrincipal { // Clase, tipo

	public static void main(String[] args) {
		// Lenguaje de alto nivel
		// Lenguaje fuertemente tipado
		// Lenguaje de tipado estático
		
		int a = 10, b = 23;
		int c;
		
		System.out.print("Pepe");
		System.out.println("Perales");
		System.out.println("28");
		
		System.out.println("La suma es: "+(a+b));
		System.out.println("La resta es: "+(a-b));
		System.out.println("La multi es: "+(a*b));
		System.out.println("La division es: "+(a/b));
		System.out.println("******** Con decimales ********");
		double aa = 10, bb = 23;
		System.out.println("La suma es: "+(aa+bb));
		System.out.println("La resta es: "+(aa-bb));
		System.out.println("La multi es: "+(aa*bb));
		System.out.println("La division es: "+(aa/bb));
		
		float aaa = 10, bbb = 23;
		System.out.println("La suma es: "+(aaa+bbb));
		System.out.println("La resta es: "+(aaa-bbb));
		System.out.println("La multi es: "+(aaa*bbb));
		System.out.println("La division es: "+(aaa/bbb));
		
		// Métodos
		
		arrancar();
		
		String cadena = "Esta es una cadena simple";
		System.out.println(cadena);
		
		System.out.println("Sumas");
		System.out.println("La suma es: " + sumar(23,6));
		
		
		// POO
		System.out.println("********Construyendo*********");
		poo1();
		
		/*
		// 2do tipo de error: durante la ejecucion
		Scanner lector = new Scanner(System.in);
		System.out.println("Por favor ingrese un numero entero");
		// La idea es dividir 20 entre lo que ingrese el usuario.
		int delUsuario = lector.nextInt();
		int resultado = 20 / delUsuario;
		System.out.println("La division es: "+resultado);
		*/
	}
	
	public static void arrancar() {
		System.out.println("Está arrancando el sistema ...");
		hackearLaNASA();
	}
	public static void hackearLaNASA() { // Camel case
		System.out.println("Iniciando hackeo ...");
		System.out.println("Desactivando módulo de hackeo: ético ...");
	}
	
	public static int sumar(int numero1, int numero2) {
		return numero1+ numero2;
	}
	
	public static void expresiones() {
		int ex = 567;
		int res = ex + 6;
		int res2 = 4 + (7 - 9) * 7;
		int res3 = sumar(1,2);
		
		char l;
		//l = "Hola mundo";
		//l = "p";
		l = 't';
	}
	
	public static void poo1() {
		Persona p01 = new Persona();
		Persona p02 = new Persona("Pliplipuch","Trikitraka");
		Persona p03 = new Persona("Pepe","Perales");
		Persona p04 = new Persona();
		System.out.println(p01);
		System.out.println(p03.obtenerNombre());
		System.out.println(p03.nombreCompleto());
		String nomnom = "Juancho";
		p03.asignarNombre(nomnom);
		p03.hablar();
		p03.caminar(6);
		p03.setEdad(20);
		p03.setDomicilio("Av. Siempre Viva");
		p03.setGenero("Masculino");
		p03.setTelefonoCel("70123456");
		
		System.out.println("La edad es: "+p03.getEdad());
		System.out.println("El domicilio es: "+p03.getDomicilio());
		System.out.println("El genero es: "+p03.getGenero());
		System.out.println("el telefono es: "+p03.getTelefonoCel());
		p03.setEdad(-512);
		System.out.println("La edad es: "+p03.getEdad());
		System.out.println("El domicilio es: "+p03.getDomicilio());
		System.out.println("El genero es: "+p03.getGenero());
		System.out.println("el telefono es: "+p03.getTelefonoCel());
		
		// Herencia
		Estudiante est01 = new Estudiante();
		System.out.println("La edad es: "+est01.getEdad());
		System.out.println("El domicilio es: "+est01.getDomicilio());
		System.out.println("El genero es: "+est01.getGenero());
		System.out.println("el telefono es: "+est01.getTelefonoCel());
		
		est01.setNombre("Ana");
		est01.setApellido("Barrios");
	}
}
