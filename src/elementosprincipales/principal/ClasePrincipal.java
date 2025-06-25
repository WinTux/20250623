package elementosprincipales.principal;

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
	}
}
