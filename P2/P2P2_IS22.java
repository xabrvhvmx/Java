import java.util.Scanner;

public class P2P2_IS22{
	public static void main(String[] args) {
		int a;
		for(a=0;a<10;a++){
			System.out.println("Esto se repite "+a );
		}
		a=0;
		for (;a<10;a+=2){
			System.out.println("Estos son los nuevos valores: " + a);
		}
		a=1;
		for (;;a++){
			if (a>10) break;
			System.out.println("Ahora son dos elementos: " + a);
		}
		a=1;
		for(;;){
			System.out.println("Ahora sin parametros");
			if (a>10) break;
			a++;
		}
		int b=1, c,cp;
		for(a=2;a<10;a++){
			System.out.println(""+a);

			if (b=10){
				b=1;
				System.out.println("");
			}
			b++;
		}
	}
} 