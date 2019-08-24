package exerciciosJava;
import java.util.Scanner;
import java.math.*;
import javax.swing.*;

public class exercicio1 {
	static double raio, area ;
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		raio =0;
		area =0;
		System.out.println("digite o raio: ");
		raio = s.nextInt();
		
		area = 2 * Math.PI * raio  ;
		System.out.println("valor do area: "+ area );
	}

}
