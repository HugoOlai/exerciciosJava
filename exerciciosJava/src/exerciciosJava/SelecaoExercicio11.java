package exerciciosJava;
import java.util.Scanner;	

public class SelecaoExercicio11 {
	
	static Scanner s = new Scanner(System.in);
	static int  senha;

	
	public static void qualEaSenha() {
						
		System.out.println("Digite a senha (quatro digitos): ");
		senha= s.nextInt();
		
		if (senha == 1234 ) {
			System.out.println("Acesso Permitido!");
		}else {
			System.out.println("Acesso Negado...");
		}
	}
	public static void main(String[] args) {
		qualEaSenha();

	}

}
