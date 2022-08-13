package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _6glicose {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int x;
			
		System.out.print("Digite a medida da glicose: ");
		x = sc.nextInt();
		
		if (x <= 100) {
			System.out.print("Normal");
		}
		else if (x <= 140) {
			System.out.print("Elevado");
		}
		else {
			System.out.print("Diabetes");
		}
		
		sc.close();
	}

}
