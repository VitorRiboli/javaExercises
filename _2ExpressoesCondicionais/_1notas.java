package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _1notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notaUm, notaDois, media;
		
		System.out.print("Digite a primeira nota: ");
		notaUm = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		notaDois = sc.nextDouble();
		
		media = (notaUm + notaDois) / 2;
		
		if (media >= 60.0) {
			System.out.printf("Nota Final = %.1f\n", media);	
		} 
		else {
			System.out.printf("Nota Final = %.1f\n", media);
			System.out.print("REPROVADO");
		}
		
		sc.close();
	}

}
