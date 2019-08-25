package exerciciosJava;
import java.util.Scanner;

public class RepetiçãoOuSeleçãoexercicio17 {
	static Scanner s = new Scanner(System.in);
	static int  n, fatorial, i;
	
	public static void fatorial() {
		
			System.out.println("Digite um numero inteiro: ");
			n = s.nextInt();
			fatorial = n;
				if (n == 0 ) {
					System.out.println("Fatorial de "+ n+" eh: "+ 1);
				}else {
					for (i = n-1; i >= 0; i--) {
					fatorial = fatorial * i ;
					System.out.println("Fatorial de "+ n+" eh: "+ fatorial);
					n = n-1;
				}
		}
	}
	public static void main(String[] args) {
		fatorial();

	}

}
