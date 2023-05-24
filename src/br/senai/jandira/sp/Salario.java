package br.senai.jandira.sp;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		double salario, salario1, valorFinal, valorFinal2, valorFinal3;
		String nome;
		
		System.out.println("Olá! Bem-vindo(a) a  Acme Ltda. Iremos checar se você precisa de um aumento, insira seus dados: ");
		
		System.out.print("Seu nome: ");
		nome = teclado.next();
				
		System.out.print("Seu salário: ");
		salario = teclado.nextDouble();
		
		valorFinal = salario * 15;
		valorFinal2 = valorFinal / 100;
		valorFinal3 = valorFinal2 + salario;
		
		System.out.println("---------------------------------------------------------------");
		
		if(salario < 1500) {
			System.out.println("Você recebeu um aumento de 15%, logo o seu salario ficou: " + valorFinal3 );
			
			} 
		if (salario <= 3000) {
				System.out.println("Você recebeu um aumento de 10%, logo o seu salário ficou: " + valorFinal3);
				
			} else {
			System.out.println("Você recebeu um aumento de 5%, logo o seu salário ficou: " + valorFinal3);
		}
		
	}

}
