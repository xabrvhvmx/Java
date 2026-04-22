import java.util.Scanner;
import java.lang.Math;
public class Ejercicio2_IS22{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Float grados, resultado;
		System.out.println("Programa que convierte grados a radianes.");
		System.out.println("Ingresa tu valor en grados...");
		grados = teclado.nextFloat();
		System.out.println((grados*Math.PI)/180+ "es el valor en radianes");
	}
}