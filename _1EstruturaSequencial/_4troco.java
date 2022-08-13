package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _4troco {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   double preco, dinheiro, troco, total;
	   int quantidade;
		
	   System.out.print("Preço unitário do produto: ");
	   preco = sc.nextDouble();
	   
	   System.out.print("Quantidade Comprada: ");
	   quantidade = sc.nextInt();
	   
	   System.out.print("Dinheiro recebido: ");
	   dinheiro = sc.nextDouble();
	   
	   total = quantidade * preco;
	   troco = dinheiro - total;
	   
	   System.out.printf("TROCO = %.2f\n", troco);
	   
	   sc.close();
	}

}
