package _3EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class desafioAtletas {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			int N;
			int totalHomens = 0; 
			int totalMulheres = 0;
			String nome;
			char sexo;  // if (sexo == 'F')
			double altura, peso;
			double pesoMedio, porcentHomens, alturaMediaMulheres;
			double alturaTotalMulheres = 0;
			double pesoTotal = 0;
			double testeAltura = 0;
			String atletaMaisAlto = "Teste";
		
		System.out.print("Qual a quantidade de atletas? ");
		N = sc.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			
			System.out.println("Digite os dados do atleta número " + i);	
			System.out.print("Nome: ");
			sc.nextLine(); //Necessita para absorver a quebra de linha 
			nome = sc.nextLine();
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0); 
			
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			} //final while sexo
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			
			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			
			pesoTotal += peso;
			
			if (altura > testeAltura) {
				atletaMaisAlto = nome;
				testeAltura = altura;
			}
			
			if (sexo == 'M') {
				totalHomens += 1;
			}	
			
			if (sexo == 'F') {
				totalMulheres += 1;
				alturaTotalMulheres += altura;
			}
			
		} // final for
		
		pesoMedio = pesoTotal / N;
		porcentHomens = (totalHomens * 100) / N;
		alturaMediaMulheres = alturaTotalMulheres / totalMulheres;
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
		System.out.println("Atleta mais alto " + atletaMaisAlto);
		System.out.printf("Porcentagem de homens: %.2f\n", porcentHomens);
		System.out.printf("Altura média das mulheres:  %.2f\n", alturaMediaMulheres);
			
			sc.close();
	}

}
