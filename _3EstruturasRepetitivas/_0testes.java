package _3EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class _0testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		//while (enquanto)
		int x = sc.nextInt();
		int count = 0;
		
		while (x != 0) {
			count += x;
			x = sc.nextInt();
		}
		
		System.out.print("Soma total: " + count);
		*/
		
		//for (para)
		int n, soma, lido;
		
		n = sc.nextInt();
		soma = 0;
		
		for (int i = 0; i < n ; i++) {
			lido = sc.nextInt();
			soma += lido;
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}
}
