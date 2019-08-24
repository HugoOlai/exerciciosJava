package exerciciosJava;
import java.util.Scanner;


public class exercicio2 {
	static double f, c;
	static Scanner s = new Scanner(System.in);;
	
	public static void calculartemperatura() {
				
		c = ((f - 32) *5) /9;
		System.out.println("digite o Celcius: " +c);
	}
	public static void main(String[] args) {
		
		System.out.println("digite o fahrenheit: ");
		f = s.nextInt();
		c= 0;
		
		calculartemperatura();
		
	}

}
