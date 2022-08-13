package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _3soma {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.print("Digite o valor de y: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.print("Soma = " + soma);
		
		sc.close();
	}
}
