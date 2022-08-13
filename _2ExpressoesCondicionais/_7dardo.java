package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _7dardo {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

		double a, b, c, maior;

		System.out.print("Digite as três distâncias: ");
		a = sc.nextDouble();

		b = sc.nextDouble();

		c = sc.nextDouble();

		if (a > b && a > c) {
			maior = a;
		} else if (b > c) {
			maior = b;
		} else {
			maior = c;
		}

		System.out.printf("MENOR = %.2f\n", maior);

			sc.close();
	}

}
