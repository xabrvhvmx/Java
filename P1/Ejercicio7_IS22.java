import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7{
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        Double a;
        Double b;
        Double c;
        Double d;
        Double e;
        Double f;
        Double x;
        Double y;
        Double aebd;
        System.out.println("resolver la siguiente ecuaciones: ");
        System.out.println("ax + by =c ");
        System.out.println("dx + ey =f ");
        System.out.println("introduce el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("introduce el valor de b: ");
        b = teclado.nextDouble();
        System.out.println("introduce el valor de c: ");
        c = teclado.nextDouble();
        System.out.println("introduce el valor de d: ");
        d = teclado.nextDouble();
        System.out.println("introduce el valor de e: ");
        e = teclado.nextDouble();
        System.out.println("introduce el valor de f: ");
        f = teclado.nextDouble();
        aebd = (a*e-b*d);
        x = (c*e-b*f)/aebd;
        y = (a*f-c*d)/aebd;



        if (aebd!=0) {
            System.out.println("el valor de X es: "+ x);
            System.out.println("el valor de Y es: "+ y);
        }
        else{
            System.out.println("Esta ecuación no tiene solucion");
        }

    }
}