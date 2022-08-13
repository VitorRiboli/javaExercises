package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _2retangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura, base, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = (base * base) + (altura * altura);		
		diagonal = Math.sqrt((base * base) + (altura * altura));
		
		System.out.printf("Area = %.4f\n", area);
		System.out.printf("Perimetro = %.4f\n", perimetro);
		System.out.printf("Diagonal = %.4f\n", diagonal);
		
		sc.close();
	}
}
