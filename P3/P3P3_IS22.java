import java.util.Scanner;

public class P3P3_IS22{
		public static void main(String[] args) {
		System.out.println("Este programa eleva un numero al cuadrado: ");
		cuadrado();
	}
		public static void cuadrado(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el numero para elevar al cuadrado: ");
		int a = teclado.nextInt();
		int cuadrado = a*a;
		System.out.println("El cuadrado de "+a+" Es: " + cuadrado);
	}
	}