package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _5trocoVerificado {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			int quanti;
			double precoUni, dinheiro, total, troco;
			
		System.out.print("Preço unitário do produto: ");
		precoUni = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quanti = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		total = precoUni * quanti;
		troco = dinheiro - total;
		
		if (troco < 0) {
			System.out.printf("Dinheiro Insuficiente. Faltam R$ %.2f\n", troco);
		}
		else {
			System.out.printf("TROCO: R$ %.2f\n", troco);
		}
		
		sc.close();
	}

}
