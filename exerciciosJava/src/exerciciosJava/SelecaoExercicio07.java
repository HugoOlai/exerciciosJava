package exerciciosJava;
import java.util.Scanner;

public class SelecaoExercicio07 {
	static Scanner s = new Scanner(System.in);
	static float x, y;
	
	public static void maiorOuMenor() {
		
		System.out.println("Digite um valor: ");
		x =s.nextFloat();
		
		System.out.println("Digite outro valor: ");
		y = s.nextFloat();
		
		if (x > y ) {
			System.out.println("O maior eh: "+ x);
		}else {
			System.out.println("O maior eh: "+ y);
		}
		
		
	}

	public static void main(String[] args) {
		maiorOuMenor();
	}

}
