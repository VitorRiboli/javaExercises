package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class _0testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, min, dia;
		String diaSem;
		double conta = 50.0;
		
		// Estrutura Condicional
		System.out.print("Qual a hora: ");
		x = sc.nextInt();
		
		if (x < 12) {
			System.out.println("Bom dia");
		} 
		else {
			if (x < 18) {
				System.out.println("Boa tarde");
			} 
			else {
				System.out.println("Boa noite");
			}
		}
		
		// Operador atribuição cumulativa conta +=
		
		System.out.print("Quantidade de minutos: ");
		min = sc.nextInt();
		
		if (min > 100) {
			conta += (min - 100 ) * 2;
		}
		
		System.out.printf("Valor da conta: R$ %.2f\n", conta);
		
		// Switch case
		
		System.out.print("Qual o número do dia: ");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			diaSem = "Domingo";
			break;
		case 2:
			diaSem = "Segunda";
			break;
		case 3:
			diaSem = "Terça";
			break;
		case 4:
			diaSem = "Quarta";
			break;
		case 5:
			diaSem = "Quinta";
			break;
		case 6:
			diaSem = "Sexta";
			break;	
		case 7:
			diaSem = "Sabado";
			break;	
		default:
			diaSem = "Valor Invalido";
			break;
		}
		 
		System.out.println("Dia da semana : " + diaSem);
		
		// Condição ternaria
		
		double preco;
		
		System.out.print("Valor do preço: ");
		preco = sc.nextDouble();
		
		double desconto = ( preco < 20.0 ) ? preco * 0.1 : preco * 0.5;
		
		System.out.printf("Desconto: R$ %.2f\n", desconto);
		sc.close(); 
	}

}
