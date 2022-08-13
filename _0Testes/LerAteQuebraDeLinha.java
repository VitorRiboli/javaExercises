package _0Testes;
import java.util.Scanner;


public class LerAteQuebraDeLinha {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int x;
	        String s1, s2, s3;
	        
	        x = sc.nextInt();
	        sc.nextLine(); //este nextLine() está aqui para que absorva a quebra de linha causada pela entrada do nextInt anterior.
	        s1 = sc.nextLine();
	        s2 = sc.nextLine();
	        s3 = sc.nextLine();

	        System.out.println("DADOS DIGITADOS;");
	        System.out.println(x);
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s3);

	        sc.close();
	    }

}
