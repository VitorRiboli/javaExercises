package _0Testes;
import java.util.Locale; // importando para não dar erro, sempre necessário para usar essa classe

public class Main {

	public static void main(String[] args) { 
		// Essa declaração define o ponto de entrada da aplicação 
		// Tudo que for colocado aqui dentro será o algoritimo
		double x = 10.5454545;
		
		System.out.println(x + " metros");
		Locale.setDefault(Locale.US); // Definindo para o padrão dos EUA
		System.out.printf("Resultado = %.2f metros%n", x); // %f ponto flutuante, %n quebra de linha
		System.out.printf("%.4f%n", x); // %n para quebra de linha
									    // separador de decimais do padrão do computador
		
	}

}
