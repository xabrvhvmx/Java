import java.util.Scanner;

public class P22_IS22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el valor A de la recta: ");
        double A = teclado.nextDouble();
        System.out.print("Ingresa el valor B de la recta: ");
        double B = teclado.nextDouble();
        System.out.print("Ingresa el valor C de la recta: ");
        double C = teclado.nextDouble();

        double n = Math.abs(A * 0 + B * 0 + C);
        double d = Math.sqrt(A * A + B * B);
        double dist = n / d;
        System.out.println("La distancia entre el punto "+ "(0,0)" + " y la recta " + A + "X(0)+ " + B + "Y(0) + " + C + " = 0 es " + dist);
    }
}
