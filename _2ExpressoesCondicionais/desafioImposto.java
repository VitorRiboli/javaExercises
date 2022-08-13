package _2ExpressoesCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class desafioImposto {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

		double rendaAnual, rendaServico, rendaCpital;
		double impostoSalario, impostoServico, impostoCapital, impostoTotal;
		double gastosEduc, gastosMedicos, gastosTotais, abatimento, impostoDevido;

		System.out.print("Renda anual com salário: ");
		rendaAnual = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaCpital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEduc = sc.nextDouble();

		// Imposto Renda Anual
		if (rendaAnual < 36000.00) {
			impostoSalario = 0;
		} else if (rendaAnual < 60000.00) {
			impostoSalario = (rendaAnual * 10) / 100;
		} else {
			impostoSalario = (rendaAnual * 20) / 100;
		}

		// Imposto Serviço
		if (rendaServico <= 0) {
			impostoServico = 0;
		} 
		else {
			impostoServico = (rendaServico * 15) / 100;
		}

		// Imposto Capital
		if (rendaCpital <= 0) {
			impostoCapital = 0;
		} 
		else {
			impostoCapital = (rendaCpital * 20) / 100;
		}
		
		impostoTotal = impostoCapital + impostoServico + impostoSalario;
		gastosTotais = gastosEduc + gastosMedicos;
		
		//Deduções
		if (gastosTotais < ((impostoTotal * 30) / 100)) {
			abatimento = gastosEduc + gastosMedicos;
			impostoDevido = impostoTotal - abatimento;
		}
		else {
			abatimento = (impostoTotal * 30) / 100;
			impostoDevido = impostoTotal - abatimento;
		}
		
		

		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f\n", abatimento);
		System.out.printf("Gastos dedutíveis: %.2f\n", gastosTotais);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impostoTotal);
		System.out.printf("Abatimento: %.2f\n", abatimento);
		System.out.printf("Imposto devido: %.2f\n", impostoDevido);
		
			sc.close();
	}

}
