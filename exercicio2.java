package curso_java;

import java.util.Scanner;
	
	public class exercicio2 {
	
		public static void main(String[] args){
		   
			int a,b,c,d,resultado;		
			Scanner sc = new Scanner(System.in);
			System.out.println("digite o valor de a");
			a = sc.nextInt();
			System.out.println("digite o valor b");
			b = sc.nextInt();
			System.out.println("digite o valor c");
			c = sc.nextInt();
			System.out.println("Digite d");
			d = sc.nextInt();
			sc.close();
			
			resultado = (a * b - c * d);
		    System.out.println("o resultado é de "+resultado);
					
	   }
	}