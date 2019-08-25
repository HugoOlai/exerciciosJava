package exerciciosJava;
import java.util.Scanner;	

public class SelecaoExercicio12 {
	static Scanner s = new Scanner(System.in);
	static int  sexo;
	static double altura, peso;
	
	public static void pesoIdeal() {
		
		System.out.println("Digite sua altura: ");
		altura = s.nextFloat();
		
		System.out.println("1:feminino 2:masculino: ");
		sexo = s.nextInt();
		
		if (sexo == 1) {
		peso = (62.1 * altura) - 44.7;
		System.out.println("Seu peso ideal eh: "+ peso);		
		}else {
		peso = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal eh: "+ peso);
		}

	} 
	
	public static void main(String[] args) {
		pesoIdeal();

	}

}
