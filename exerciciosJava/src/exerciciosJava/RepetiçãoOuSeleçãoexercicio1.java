package exerciciosJava;
import java.util.Scanner;	

public class RepetiçãoOuSeleçãoexercicio1 {
	static Scanner s = new Scanner(System.in);
	static float  a, b, c;
	static float divisao;
	
	
	

public static void Divisao() {
		
		System.out.println("Digite um valor inteiro: ");
			a= s.nextFloat();
		do {
		System.out.println("Digite outro valor inteiro: ");
			b= s.nextFloat();
		System.out.println("para sair aperte 0: ");
			c= s.nextFloat();
			
		}while( c != 0);
		
		divisao = a/b;
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		
		System.out.println("A divisao do primeiro valor pelo segundo eh: "+ divisao);
	}
		
	public static void main(String[] args) {
		Divisao();

	}

}
