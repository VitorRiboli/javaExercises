package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _1terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double comprimento, largura, preco, area, moneyTerrain;

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		preco = sc.nextDouble();

		area = largura * comprimento;
		moneyTerrain = area * preco;

		System.out.printf("Area do terreno = %.2f\n", area);
		System.out.printf("Preco do terreno = %.2f\n", moneyTerrain);

		sc.close();
	}

}