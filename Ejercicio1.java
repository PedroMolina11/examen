import java.util.Scanner;
/**
 * Este programa es el ejercicio 1 del examen
 * @author Pedro 
 * @version 1.0
 * 
 * 
 * */
public class Ejercicio1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer número");
		int numero1 = sc.nextInt();
		System.out.println("Introduce segundo número ");	
		int numero2 = sc.nextInt();
		sc.close();	
		calcularValorMedio(numero1,numero2);	
		System.out.printf("%.2f%n",calcularValorMedio(numero1,numero2));

		int contador= 0;
		if(numero1 == numero2){
			System.out.println("Son iguales");
			
		}	
		else if(numero1 >= numero2){
			while(numero1 >= numero2){
				for(;contador < 2;contador++){
					System.out.printf("%3d",numero1--);
					
				
				}
			System.out.println("\n");	
			contador = 0;
			}
		}
				
		else if(numero1 < numero2){
			while(numero1 <= numero2){
				for(;contador < 2;contador++){
					System.out.printf("%3d",numero1++);
					
				
				}
			System.out.println("\n");	
			contador = 0;
			}
		}
			else
				System.out.println("No son números enteros");
				
		
	}
	/**
	 * método que calcula el valor medio
	 * @param valorMenor Se trata de la variable menor
	 * @param valorMayor Es la varible mayor
	 * @return double
	 * */
	public static double calcularValorMedio(int valorMenor, int valorMayor){
		double media = 0.00;
		media = ((valorMenor + valorMayor) /2);
		return media;
		
	}
}

