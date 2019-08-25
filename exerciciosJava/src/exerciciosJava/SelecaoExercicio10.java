package exerciciosJava;
import java.util.Scanner;	

public class SelecaoExercicio10 {
	static Scanner s = new Scanner(System.in);
	static int  a, b, c;

	
	public static void valoresEmOrdem() {
		
		System.out.println("Digite um valor qualquer: ");
		a = s.nextInt();
		System.out.println("Digite outro valor qualquer: ");
		b= s.nextInt();
		System.out.println("Digite mais um valor qualquer: ");
		c= s.nextInt();
		
		if ((a < b) && (a < c)) {
			if (b < c) {
				System.out.println(a+"   "+ b+"   "+c);
			}else {
				System.out.println (a+"   "+ c+"   "+b);
			}
		}else {
			if ((b < a) && (b < c)) {
				if (a < c ) {
					System.out.println (b+ "   "+ a + "   "+c);
				}else {
					System.out.println (b+ "   "+ c + "   "+a);
				}
			}else
				if (b < a) {
					System.out.println (c+ "   "+ b + "   "+a);
				}else {
					System.out.println (c+ "   "+ a + "   "+b);
				}
		}
	}
	public static void main(String[] args) {
		valoresEmOrdem();

	}

}
