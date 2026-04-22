import java.util.Scanner;
 
 public class Ejercicio9_1s22{ 
  public static void main(String[] args){
  	java.util.Scanner teclado = new Scanner(System.in);
    double v, i, r;
    System.out.println("calcule la caida potencial producida por una resistencia segun la ley de Ohm\n");
     System.out.println("Ingresa el valor para la Intensidad: ");
     i= teclado.nextDouble();
     System.out.println("Ingresa el valor para la resistencia: ");
     r = teclado.nextDouble();

     if(r<=0 || r>1000) {
      System.out.println("El valor de la resistencia está fuera de los límites aceptables.");
    }
    else{ 
      v = i*r;
      System.out.println("La caída potencial producida por la resistecia con los valores previamente ingresados es:" + v);
    }
  }
}