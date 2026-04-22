import java.util.Scanner;
 
 public class Ejercicio8_IS22{ 
  public static void main(String[] args){
  	java.util.Scanner teclado = new Scanner(System.in);
  	int i,n;
  	System.out.println("Programa que despliegue la tabla de multiplicar correspondiente al valor indicado.");
  	System.out.println("escribir un numero del 1 al 9: ");
  	n = teclado.nextInt();

  	for (i=1;i<=10;i++) { 
    System.out.println(n +"x"+i+"="+ (n*i));
}
}
}