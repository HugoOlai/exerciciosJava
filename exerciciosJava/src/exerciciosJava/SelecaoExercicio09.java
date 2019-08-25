package exerciciosJava;
import java.util.Scanner;

public class SelecaoExercicio09 {
	static Scanner s = new Scanner(System.in);
	static int macas;
	
public static void valorDaMaca() {
	
		System.out.println("Quantidade de macas compradas: ");
		macas =s.nextInt();
		if (macas < 12 ) {
			System.out.println("Valor da compra: "+ macas * 0.3);
		}else {
			System.out.println("Valor da compra: "+ macas * 0.25);
		}
	}
	public static void main(String[] args) {
		valorDaMaca();

	}

}
