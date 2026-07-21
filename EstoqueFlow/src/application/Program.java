package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MenuCadastro;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("BEM VINDO AO GERENCIADOR DE ESTOQUE  \n\n******* ESTOQUEFLOW *******");

		System.out.println("Escolha a Opçao");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Pesquisar");
		System.out.println("3 - Ajuda");
		System.out.println("4 - Sair");

		System.out.print("Digite a opçao: ");
		int opcaoMenu = sc.nextInt();

		switch (opcaoMenu) {
		case 1: {
			MenuCadastro menuCadastro = new MenuCadastro();
			break;
		}

		case 2: {
		
			break;
		}
		case 3: {
			
			break;
		}

		default:
			System.out.println("Opçao Invalida. Favor escolher Opcao Valida.");
			;
		}

		sc.close();

	}

}
