package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _3menorDeTres {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			int a, b, c, menor;
		
		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
	        menor = a;
	    }
	    else if (b < c) {
	        menor = b;
	    }
	    else {
	        menor = c;
	    }
		
	    System.out.printf("MAIOR DISTÂNCIA = %.2f\n", menor);
	
		sc.close();
	}

}
