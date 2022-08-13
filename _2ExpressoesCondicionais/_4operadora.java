package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _4operadora {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int min;
			double preco;
			double precoFix = 50.00;
	
	System.out.print("Digite a quantidade de minutos: ");
	min = sc.nextInt();
	
	if (min <= 100.00) {
		System.out.printf("Valor a pagar: R$ %.2f\n", precoFix);
	} 
	else {
		preco = precoFix + (min - 100) * 2;
		System.out.printf("Valor a pagar: R$ %.2f\n", preco);
	}
			
	
	sc.close();		
	}

}
