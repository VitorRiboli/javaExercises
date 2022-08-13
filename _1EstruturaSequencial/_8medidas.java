package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _8medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaQua, areaTria, areaTrap;
		
		System.out.print("Digiet a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digiet a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digiet a medida C: ");
		c = sc.nextDouble();
		
		areaQua = a * a;
		areaTria = (a * b) / 2;
		areaTrap = ((a + b) * c) / 2;
		
		System.out.printf("AREA DO QUADRADO = %.4f\n", areaQua);
		System.out.printf("AREA DO TRIANGULO = %.4f\n", areaTria);
		System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaTrap);
		
		sc.close();
	}

}
