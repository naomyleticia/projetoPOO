package execucao;

import java.util.Scanner;

import Controlador.Controlador;
import modelo.Aluno;
import modelo.Professor;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Controlador controlador = new Controlador();
		Aluno aluno;
		String nome;
		String cpf;
		String email;
		String sexo;
		String modulo;
		int id;
		int cargaHoraria;
		String materia;
		int escolha;
		Professor professor;

		do {

			System.out.println("------------------------------");
			System.out.println("---ALUNO-----");
			System.out.println("---Op��o 1: CADASTRAR---");
			System.out.println("---Op��o 2: ATUALIZAR---");
			System.out.println("---Op��o 3: REMOVER-----");
			System.out.println("---Op��o 4: BUSCAR------");
			System.out.println("------------------------------");
			System.out.println("---PROFESSOR-----");
			System.out.println("---Op��o 6: CADASTRAR---");
			System.out.println("---Op��o 7: ATUALIZAR---");
			System.out.println("---Op��o 8: REMOVER-----");
			System.out.println("---Op��o 9: BUSCAR------");

			escolha = ler.nextInt();
			ler.nextLine();
			switch (escolha) {
			case 1:
				System.out.println("Voc� selecionou a op��o Cadastrar");
				System.out.println("Por favor insira as informa��es que ser�o pedidas");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite seu nome: ");
				nome = ler.nextLine();

				System.out.println("Por favor digite seu cpf:");
				cpf = ler.nextLine();

				System.out.println("Por favor digite seu email:");
				email = ler.nextLine();

				System.out.println("sexo: Masculino ou Feminino:");
				sexo = ler.nextLine();

				System.out.println("Escolha um Modulo: " + "1 Modulo " + "" + "2 Modulo " + "" + "3 modulo");
				modulo = ler.nextLine();

				aluno = new Aluno(id, nome, cpf, email, modulo, sexo);
				controlador.adicionarAluno(aluno);
				break;

			case 2:
				System.out.println("Voc� selecionou a op��o Atualizar");
				System.out.println("Qual o id da pessoa que deseja atualizar");
				System.out.println("Por favor insira as informa��es que ser�o pedidas");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite seu nome: ");
				nome = ler.nextLine();

				System.out.println("Por favor digite seu cpf:");
				cpf = ler.nextLine();

				System.out.println("Por favor digite seu email:");
				email = ler.nextLine();

				System.out.println("sexo: Masculino ou Feminino:");
				sexo = ler.nextLine();

				System.out.println("Escolha um Modulo: " + "1 Modulo " + "" + "2 Modulo " + "" + "3 modulo");
				modulo = ler.nextLine();

				aluno = new Aluno(id, nome, cpf, email, modulo, sexo);
				controlador.atualizarAluno(id, nome, cpf, email, modulo, sexo);
				break;

			case 3:

				System.out.println("Voc� selecionou a op��o Remover");
				System.out.println("Qual usuario gostario de remover");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				controlador.removerAluno(id);
				break;
			case 4:

				System.out.println("Voc� selecionou a op��o Buscar");
				System.out.println("Qual usuario gostario de Buscar");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				controlador.buscarAluno(id);
				break;
			case 6:
				System.out.println("Voc� selecionou a op��o Cadastrar");
				System.out.println("Por favor insira as informa��es que ser�o pedidas");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite seu nome: ");
				nome = ler.nextLine();

				System.out.println("Por favor digite seu cpf:");
				cpf = ler.nextLine();

				System.out.println("Por favor digite sua carga horaria:");
				cargaHoraria = ler.nextInt();

				ler.nextLine();
				System.out.println("sexo: ");
				sexo = ler.nextLine();

				ler.nextLine();
				System.out.println("Materia: ");
				materia = ler.nextLine();

				professor = new Professor(nome, materia, cpf, sexo, materia, cargaHoraria, id);
				controlador.adicionarProfessor(professor);
				break;
			case 7:
				System.out.println("Voc� selecionou a op��o Atualizar");
				System.out.println("Qual o id da pessoa que deseja atualizar");
				System.out.println("Por favor insira as informa��es que ser�o pedidas");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite seu nome: ");
				nome = ler.nextLine();

				System.out.println("Por favor digite seu cpf:");
				cpf = ler.nextLine();

				System.out.println("Por favor digite seu carga Horaria:");
				cargaHoraria = ler.nextInt();

				ler.nextLine();
				System.out.println("sexo: ");
				sexo = ler.nextLine();

				ler.nextLine();

				System.out.println("Materia: ");
				materia = ler.nextLine();

				professor = new Professor(nome, materia, cpf, sexo, materia, cargaHoraria, id);
				controlador.atualizarProfessor(materia, nome, cpf, cargaHoraria, id);
				break;

			case 8:
				System.out.println("Voc� selecionou a op��o Remover");
				System.out.println("Qual usuario gostario de remover");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				controlador.removerProfessor(id);
				break;
			case 9:
				System.out.println("Voc� selecionou a op��o Buscar");
				System.out.println("Qual usuario gostario de Buscar");
				System.out.println("Digite seu id");
				id = ler.nextInt();
				ler.nextLine();
				controlador.buscarProfessor(id);
				break;

			default:

				break;
			}
		} while (escolha != 11);
	}
}
