import java.util.Scanner;
import java.lang.Math;
public class Ejercicio3_IS22{
	public static void main(String[] args) {
		System.out.println("Programa que calcula el volumen de una esfera pidiendo su radio.");
		Double Volumen, r, num1;
		num1=1.3333;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el radio para calcular el volumen de la esfera: ");
		r = teclado.nextDouble();
		Volumen = (num1)*(Math.PI)*(Math.pow(r,3));
		System.out.println("El volumen de la esfera con radio "+r+"es: "+Volumen);
	}
}