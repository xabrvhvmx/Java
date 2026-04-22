import java.util.Scanner;
import java.lang.Math;
public class Ejercicio4_IS24{
	public static void main(String[] args) {
		Double r, area, circunf;
		System.out.println("Programa que calcula el area de un circulo y su circunferencia.");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, ingrese el radio del circulo: ");
		r = teclado.nextDouble();
		area = (Math.PI)*(Math.pow(r,2));
		circunf = (Math.PI)*2*r;
		System.out.println("El valor del area es: "+ area+ " \n"+ "El valor de la circunferencia es: "+ circunf);
	}
}