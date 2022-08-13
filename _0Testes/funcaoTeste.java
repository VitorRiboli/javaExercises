package _0Testes;

import java.util.Locale;
import java.util.Scanner;

public class funcaoTeste {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
				
		sc.close();
	}
/*	
nome public é para que fique disponivel em outras classes
Static é para que esta função possa ser chamada independente de se criar um objeto
*/	
	public static int max(int a, int b, int c) { 
		
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		}
		else if (b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
			
		return aux;
	} //max

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}// show
	
}
