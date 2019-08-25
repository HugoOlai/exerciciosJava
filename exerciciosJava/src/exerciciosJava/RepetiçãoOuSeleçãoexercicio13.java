package exerciciosJava;
import java.util.Scanner;

public class RepetiçãoOuSeleçãoexercicio13 {
	static Scanner s = new Scanner(System.in);
	static float  altura, maior;
	static String  nome, nome_m;
	static int  num, sair;
	
	
public static void maiorMoca() {
		sair = 0;
		while (sair != 1) { 
			if(num > 0) {
				System.out.println("Deseja sair (digite 1): ");
				sair = s.nextInt();
			}
				if (sair == 1) {					
					System.out.println("Total de mocas no concurso: "+num);
					System.out.println("Moca mais alta: "+ nome_m);
					System.out.println("Altura: "+ maior);
				
				}else {
					
				System.out.println("Nome: ");
				nome= s.next();
					
				System.out.println("Altura: ");
				altura = s.nextFloat();
				
				num = num + 1;
				if (altura > maior) { 
					maior = altura;
					nome_m = nome;
				}	
	
			}
		}
	}
	public static void main(String[] args) {
		maiorMoca();

	}

}
