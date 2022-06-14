package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Conta;
import Entidade.Usuario;

public class Programa {

	public static void main(String[] args) {
		List<Conta>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("DESEJA INICIAR");
	   char h = sc.next().charAt(0);
		while(h != 'N') {
		   System.out.println("------------------------------------------------------");
	        System.out.println("-------------Bem vindos a nossa Agência---------------");
	        System.out.println("------------------------------------------------------");
	        System.out.println("***** Selecione uma operação que deseja realizar *****");
	        System.out.println("------------------------------------------------------");
	        System.out.println("|   Opção 1 - Criar conta   |");
	        System.out.println("|   Opção 2 - Depositar     |");
	        System.out.println("|   Opção 3 - Sacar         |");
	        System.out.println("|   Opção 4 - Transferir    |");
	        System.out.println("|   Opção 5 - Listar        |");
	        System.out.println("|   Opção 6 - Sair          |");
		    int operacao = sc.nextInt();
		
		if(operacao == 1) {
			sc.nextLine();
			System.out.println("CADASTRAR CONTA");
			System.out.println();
			System.out.println("NOME");
			String nome = sc.nextLine();
			System.out.println("CPF");
			String cpf = sc.nextLine();
			System.out.println("EMAIL");
			String email = sc.nextLine();
			System.out.println("TELEFONE");
			String telefone = sc.nextLine();
			Usuario usuario = new Usuario(nome, cpf, email, telefone);
			System.out.println("DIGITE O NUMERO DA CONTA");
			int numerodaconta = sc.nextInt();
			System.out.println("VOCÊ DESEJA COLOCAR UM VALOR INICIAL S/SIM N/NÃO");
			char n = sc.next().charAt(0);
			Conta conta = new Conta();
			if(n == 's' || n == 'S') {
				System.out.println("QUANTO");
				double valor = sc.nextDouble();
				conta.criarcontacomdinheiro(n, list, numerodaconta, usuario, valor);
			}
			else {
				conta.criarcontasemdinheiro(n, list, numerodaconta, usuario, 0.0);
			}
			
		}
		
		if(operacao == 2) {
			Conta conta = new Conta();
			System.out.println("NUMERO DA CONTA");
			int ndc = sc.nextInt();
			System.out.println("VALOR DE DEPOSITO");
			double adicionar = sc.nextDouble();
			conta.depositar(list, adicionar, ndc);
					
	    	}
		if(operacao == 3) {
			Conta c = new Conta();
			System.out.println("NUMERO DA CONTA");
			int ndc = sc.nextInt();
			System.out.println("VALOR DE DEPOSITO");
			double sacar = sc.nextDouble();
			c.sacar(list, sacar, ndc);
			
		}
		if(operacao == 4) {
			Conta c = new Conta();
			System.out.println("DIGITE O NUMERO DA SUA CONTA");
			int nc = sc.nextInt();
			
			System.out.println("QUAL VALOR DESEJA TRANSFERIR");
			double transferencia = sc.nextDouble();	
			
			System.out.println("NUMERO DA CONTA QUE DESEJA TRANSFERIR");
			int d = sc.nextInt();
			c.transferencia(list, nc, transferencia, d);
			
			}
				
		if(operacao == 5) {
			Conta c = new Conta();
			c.listas(list);
		}
		
		if(operacao == 6) {
			System.exit(operacao);
		}
       
		
		}
		
		sc.close();
	}

}
