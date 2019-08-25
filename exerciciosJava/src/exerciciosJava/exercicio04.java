package exerciciosJava;
import java.util.Scanner;
import java.math.*;

public class exercicio04 {
	static double pot_lamp, larg_com, comp_com, area_com, pot_total;
	static double num_lamp;

	static Scanner s = new Scanner(System.in);
	
	public static void NumeroDeLampadasNecessarias() {
		System.out.println("Qual a potencia da lampada (em watts)? ");
		pot_lamp = s.nextInt();
		
		System.out.println("Qual a largura do comodo (em metros)? ");
		larg_com  = s.nextInt();
		
		System.out.println("Qual o comprimento do comodo (em metros)? ");
		comp_com = s.nextInt();
		
		area_com = larg_com * comp_com;
		pot_total = area_com * 18;
		num_lamp = Math.round(pot_total / pot_lamp); 
		
		System.out.println("Numero de lampadas necessarias para iluminar esse comodo: "+
		num_lamp);
	}
	
	public static void main(String[] args) {
		NumeroDeLampadasNecessarias();
		
	}

}
