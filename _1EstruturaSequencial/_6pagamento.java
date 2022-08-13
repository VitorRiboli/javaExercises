package _1EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _6pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorHora, horasTrabalhadas, salario;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("O pagamento para %s deve ser de R$ %.2f\n", nome, salario);
		
		sc.close();
	}

}
