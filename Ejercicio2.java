import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase\n");
		String cadena = sc.nextLine();
		sc.close();
		System.out.println("\n\n" + cadena.toLowerCase() + "\n\n");
		System.out.println(cadena.toUpperCase() + "\n\n");		
		
	}
}

