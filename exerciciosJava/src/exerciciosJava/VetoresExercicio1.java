package exerciciosJava;
import java.util.Scanner;

public class VetoresExercicio1 {
	static Scanner s = new Scanner(System.in);
	static int[]  w = new int[10], x = new int[10];
	static int v, cont, pos;
	
	
	public static void estruturas() {
		
		for (pos = 0; pos < 10; pos++) {
		
			System.out.println("Valor "+ pos+" : ");
			w [pos] = s.nextInt();
		}
		
		System.out.println("Digite um valor: ");
		v = s.nextInt();
		for (pos = 0; pos < 10; pos++) {
			if (w[pos] == v ) {
			
			cont = cont + 1;
			x [cont] = pos;
			}
		}
		
		if (cont == 0) {
			System.out.println("O valor "+ v+" nao aparece no vetor w");
		}else {
			System.out.println("O valor "+ v+" apareceu "+ cont+" vez(es) no vetor w");
		for (pos= 0; pos <= cont; pos++) {
			
			System.out.println("Na posicao "+ x [pos]);
			
		}
		
	}
}
	
	public static void main(String[] args) {
		estruturas();

	}

}
