import java.util.Scanner;
import java.lang.Math;

public class Ejercicio5_IS22{
	public static void main(String[] args) {
		System.out.println("Programa que calcule S dados los lados A, B, C ");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el valor de los lados A, B, C");
		Double a,b,c,semiperimetro;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		semiperimetro = (a+b+c)/2;
		System.out.println("El Semiperimetro del triangolo con los valores ingresados previamente es: "+semiperimetro);
	}
}