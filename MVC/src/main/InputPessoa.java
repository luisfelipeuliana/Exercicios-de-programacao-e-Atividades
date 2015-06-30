package main;

import java.util.Scanner;

public class InputPessoa {

		  Scanner  input = new Scanner(System.in);
			
			public Integer lerCodigo(){
				System.out.println("Codigo ...:");
				Integer codigo= input.nextInt();
				return codigo;
			}
			
			public String lerNome(){
				System.out.println("Nome ...:");
				String nome= input.next();
				return nome;
			}
			public String lerEmail(){
				System.out.println("Email ...:");
				String email= input.next();
				return email;
			}
			
}//final da classe para leitura dos dados

