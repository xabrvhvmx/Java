import java.util.Scanner;
public class P3P4_IS22{
	public static void main(String[] args) {
		System.out.println("Programa que eleva un valor al cuadrado: ");
		cuadrado();
	}
	public static void cuadrado(){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingresa el valor que quieras elevar al cuadrado");
	int a = teclado.nextInt();
	System.out.println("Ingresa la potencia que quieras aplicar: ");
	int b = teclado.nextInt();
	double c = Math.pow(a,b);
	System.out.println("El resultado de elevar " + a+" a la potencia "+b+" Es: " + c);
	}
}