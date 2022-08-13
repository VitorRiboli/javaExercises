package _0Testes;

public class funcaoString {

	public static void main(String[] args) {
		String original = "aAbcde FGHI jkl MNOP bc   ";

		String um = original.toLowerCase();
		String dois = original.toUpperCase();
		String tres = original.trim();
		String quatro = original.substring(2);
		String cinco = original.substring(0, 10);
		String seis = original.replace('a', 'x');
		int i = original.indexOf("bc");
		int x = original.lastIndexOf("bc");
		

		System.out.println(um);
		System.out.println(dois);
		System.out.println(tres + " original");
		System.out.println(quatro);
		System.out.println(cinco);
		System.out.println(seis);
		System.out.println(i);
		System.out.println(x);
		
		System.out.println();
		System.out.println();
		//Operação Split
		String ingredientes = "batata limao cenoura";
		String[] vect = ingredientes.split(" "); //separador é o espaço em branco
		String word1 = vect[0]; //acessando o vetor na posição 0
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
