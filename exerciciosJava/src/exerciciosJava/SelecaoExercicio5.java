package exerciciosJava;
import java.util.Scanner;

public class SelecaoExercicio5 {

	
	static float valor;
	static Scanner s = new Scanner(System.in);
	
	public static void valoresNegativosOuPositivos() {
		
		System.out.println("Digite um valor: ");
		valor = s.nextInt();
		if (valor < 0) {
			System.out.println("Negativo! ");
		}else {
			System.out.println("Positivo! ");
		}
		
	}
	

	
	public static void main(String[] args) {
		valoresNegativosOuPositivos();

	}

}
