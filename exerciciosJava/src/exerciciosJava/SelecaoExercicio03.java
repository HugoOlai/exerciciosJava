package exerciciosJava;
import java.util.Scanner;

public class SelecaoExercicio03 {
	
	static float nota1, nota2, media;
	static Scanner s = new Scanner(System.in);
	
	public static void notas() {
		System.out.println("Digite a nota da primeira avaliacao: ");
		nota1 = s.nextInt();
		
		System.out.println("Digite a nota da segunda avaliacao: ");
		nota2 = s.nextInt();
		
		media = (nota1 + nota2) / 2;
		if (media >= 6.0) {
			System.out.println("PARABENS! Voce foi aprovado ");
		}		

	}
	
	public static void main(String[] args) {
		notas();

	}

}
