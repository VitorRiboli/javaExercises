package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _5circulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		
		area = Math.PI * (r * r);
		
		System.out.printf("AERA = %.3f\n", area);
		
		sc.close();
	}

}
