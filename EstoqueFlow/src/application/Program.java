package application;

import entities.Ingrediente;
import entities.Produto;

import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		LocalDate validade = entradaDeValidade(sc);

		Produto produto = new Ingrediente("Salsinha" , 10 , validade);

		System.out.println("Cadastro Feito com Sucesso \n " + produto.toString());





		sc.close();

	}
	public static LocalDate entradaDeValidade(Scanner sc){

		LocalDate dataValidade = null;
		boolean dataValida = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		while(!dataValida){
			System.out.print("Digite a Data de Validade (dd/MM/yyyy): ");
			String entradaUsuario = sc.nextLine();

			try{ 	// CONVERTENDO DATE PARA STRING
				dataValidade = LocalDate.parse(entradaUsuario , formatter );

				if (dataValidade.isBefore(LocalDate.now())){
					System.out.println("ATENÇÃO: PRODUTO VENCIDO");
					return null;
				} else {
					dataValida = true;

				}

			}catch (DateTimeParseException e ) {
				System.out.println("Formato de data invalido! PADRAO dd/MM/yyyy");

			}

		}

        return dataValidade;
    }
}
