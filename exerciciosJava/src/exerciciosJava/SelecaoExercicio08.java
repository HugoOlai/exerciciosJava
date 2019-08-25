package exerciciosJava;
import java.util.Scanner;

public class SelecaoExercicio08 {
	static Scanner s = new Scanner(System.in);
	static int ano;
	
public static void PodeOuNãopodeVotar() {
		
		System.out.println("Ano de nascimento c/ quatro digitos: "); 
		ano = s.nextInt();
		if ((2019 - ano) >= 16 ) {
			System.out.println("Voce podera votar este ano :-) ");
		}else {
			System.out.println("Voce ainda nao podera votar este ano :-( ");
		}
		
	}
	
	public static void main(String[] args) {
		PodeOuNãopodeVotar();
	}

}
