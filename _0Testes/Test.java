package _0Testes;
import java.util.Scanner;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // para usar o ponto na vez da virgula no double
		Scanner sc = new Scanner(System.in);
	
		String name;
		System.out.println("Qual o seu Nome?");
		name = sc.next();
		
		int age;
		System.out.println("Qual a sua idade? ");
		age = sc.nextInt();
		
		double renda;
		System.out.println("Qual o seu sálario");
		renda = sc.nextDouble();
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, renda); // %s para texto, %d para inteiro, %f para ponto flutuante
		
		sc.close();
	}

}
