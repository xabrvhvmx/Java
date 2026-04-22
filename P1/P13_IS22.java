import java.util.Scanner;
public class P13_IS22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		Float num1, num2, resultado;
		Float suma, resta, multiplicacion, division;

		System.out.println("¿Qué operación deseas realizar?: ");
	    System.out.println("\n");
	    System.out.println("Suma, Resta, Multiplicación o División...");
	    operacion = teclado.nextLine();
	    if (operacion.equals("Suma")){
	    	System.out.println("Aquí realizaremos una suma:");
	    	System.out.println("\n");
	    	System.out.println("Ingresa dos números para sumar: ");
	    	System.out.println("\n");
	    	System.out.println("Ingresa el primer número: ");
	    	System.out.println("\n");
	    	num1 = teclado.nextFloat();
	    	System.out.println("\n");
	    	System.out.println("Ingresa el segundo número a sumar: ");
	    	num2 = teclado.nextFloat();
	    	suma = (num1 + num2);
	    	System.out.println(suma);
	    }if (operacion.equals("Resta")){
	    	System.out.println("Realicemos una resta: ");
	    	System.out.println("\n");
	    	System.out.println("Ingresa el primer número: ");
	    	num1 = teclado.nextFloat();
	    	System.out.println("\n");
	    	System.out.println("Ingresa el segundo número: ");
	    	num2 = teclado.nextFloat();
	    	resta = (num1 - num2);
	    	System.out.println("El resultado de la resta es: " + resta);
	    }if (operacion.equals("Multiplicacion")){
	    	System.out.println("Realicemos una multiplicación: ");
	    	System.out.println("\n");
	    	System.out.println("Ingresa el primer número: ");
	    	num1 = teclado.nextFloat();
	    	System.out.println("\n");
	    	System.out.println("Ingresa el segundo número: ");
	    	System.out.println("\n");
	    	num2 = teclado.nextFloat();
	    	multiplicacion = (num1*num2);
	    	System.out.println("El resultado de la multiplicación es: " + multiplicacion);
	    }if (operacion.equals("Division")){
	    	System.out.println("Realicemos una división: ");
	    	System.out.println("\n");
	    	System.out.println("Ingresa el primer número: ");
	    	num1 = teclado.nextFloat();
	    	System.out.println("\n");
	    	System.out.println("Ingresa el segundo número: ");
	    	System.out.println("\n");
	    	num2 = teclado.nextFloat();
	    	division = (num1/num2);
	    	System.out.println("\n");
	    	System.out.println("El resultado de la división es: " + division);
	    }else{
	    	System.out.println("Intenta escribir con mayúscula la primera letra y sin acentos:)");
	    }
	}
}