import java.util.Scanner;
public class P12_IS22{
	public static void main(String[] args) {
		int num1;
		System.out.println("Programa que indica si un número es par o inpar. ");
		System.out.println("\n");
		System.out.println("Ingresa un número: ");
		Scanner teclado = new Scanner(System.in);
		num1 = teclado.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("Tu número, "+num1 + ", es par. ");
		}else {
			System.out.println("Tu número, " + num1 + ", no es un número par):");}
	}
}