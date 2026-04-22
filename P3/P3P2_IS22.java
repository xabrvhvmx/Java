import java.util.Scanner;
public class P3P2_IS22{
	public static void main(String[] args) {
		Menu();
		Scanner teclado = new Scanner(System.in);
		String opc=teclado.nextLine();
		if (opc.equals("a")) Suma();
		if (opc.equals("b")) Resta();
		if (opc.equals("c")) Multiplicacion();
		if (opc.equals("d")) Division();
	}
	public static void Menu(){
		System.out.println("Bienvenido! Ingresa la opción que se acopla a lo que necesitas;)");
		System.out.println("\na)Suma");
		System.out.println("b)Resta");
		System.out.println("c)Multiplicación");
		System.out.println("d)División");
		System.out.println("\n");
		
		
	}
	public static void Suma(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa dos números enteros para sumar: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("El resultado de la suma es: "+c);
	}
	public static void Resta(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa dos números enteros para restar: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("El resultado de la resta es: "+c);
	}
	public static void Multiplicacion(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa dos números enteros para multiplicar: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = a*b;
		System.out.println("El resultado de la multiplicación es: "+c);
	}
	public static void Division(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa dos números enteros para dividir: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = a/b;
		System.out.println("El resultado de la división es: "+c);
	}
}