import java.util.Scanner;

public class P11_IS22{
	public static void main(String[] args) {
		int edad;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		edad = teclado.nextInt();
		if (edad>=18){
			System.out.println("Eres mayor de edad. ");}
		if (edad<=17){
			System.out.println("No eres mayor de edad.");}
	}
}