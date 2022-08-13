package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _7consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia, combustivel, media;
		
		System.out.print("Distância percorrida: ");
		distancia = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		combustivel = sc.nextDouble();
		
		media = distancia / combustivel;
		
		System.out.printf("Consumo media = %.3f\n", media);
		
		sc.close();
	}

}
