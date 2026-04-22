import java.util.Scanner;
public class P3P5_IS22{

	public static int promedio(){
		return((a+b+c)/3);
	}

	public static int[] captura(){
		int[] numeros = new int[10];
		Scanner teclado = new Scanner (System.in);
		for (int a=0;a<10;a++){
			System.out.println("Ingrese el valor para la posiciòn ["+(a+1)+"]: ");
			numeros[a]=teclado.nextInt();

		}
		return numeros;
	}

	public static void main(String[] args) {
		int[] valores = captura();
		for (int x = 0; x<valores.length; x++){
			System.out.println("Valores contiene en la posicion[ "+(x+1)+"]: "+valores[x]);
		}

		System.out.println("El promedio de los numeros es: " + promedio(captura));
	}
}

