package exerciciosJava;
import java.util.Scanner;
import java.util.ArrayList;  

 

public class Registros01 {
	class SubRegistro {
		public int codigo;
		public String nome;
		public String Endereco;
		public String Telefone;
		
	}
	
	static Scanner s = new Scanner(System.in);	
	
	static SubRegistro[] reg = new SubRegistro[5];
	 
	public static void Registros() {
		
		for(int i=0;i<=5;i++){
	        reg[i].codigo = i;
			System.out.println("Digite o nome: ");
			reg[i].nome =s.next();  
	        System.out.println("Digite o endereco: ");
	        reg[i].Endereco = s.next();
	        System.out.println("Digite o telefone: ");
	        reg[i].Telefone = s.next();
	        
	        
	        //System.out.println("Codigo: "+ reg.codigo +" Nome: "+reg.nome+" Endereco: "+reg.Endereco+ " Telefone: "+ reg.Telefone);
		}
		for(int i=0;i<5;i++){
			System.out.println("Codigo: "+ reg[i].codigo +" Nome: "+reg[i].nome+" Endereco: "+reg[i].Endereco+ " Telefone: "+ reg[i].Telefone);
		}
	}
	public static void main(String[] args) {
		Registros();

	}

}
