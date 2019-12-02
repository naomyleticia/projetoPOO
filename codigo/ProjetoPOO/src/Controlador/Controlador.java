package Controlador;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Professor;

public class Controlador {
	
	Controlador controlador = new Controlador();

	int id;
	int cargaHoraria;
	String materia;
	int escolha;
	Professor professor;

	private ArrayList<Professor> professores;

	private ArrayList<Aluno> alunos;

	public Controlador() {
		professores = new ArrayList<>();

		alunos = new ArrayList<>();
	}

	
	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}


	public void removerProfessor (int id) {
		for (int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getId() == id) {
				professores.remove(i);		
				System.out.println("EXCLUIDO COM SUCESSO");
			}
		}

	}



	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	
	public void removerAluno (int id) {
		for (int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getId() == id) {
				alunos.remove(i);		
			}
		}

	}
	
	public void atualizarAluno(int id, String novoNome, String novoCpf, String novoEmail, String novoModulo, String sexo) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getId() == id) {
				alunos.get(i).setCpf(novoCpf);
				alunos.get(i).setEmail(novoEmail);
				alunos.get(i).setNome(novoNome);
				alunos.get(i).setModulo(novoModulo);

			}
		}


	}

	public void atualizarProfessor(String materia, String novoNome, String novoCpf, int novaCargaHoraria, int id) {
		for(int i = 0; i < professores.size(); i++) {
			if(professores.get(i).getId() == id) {
				professores.get(i).setCpf(novoCpf);
				professores.get(i).setNome(novoNome);
				professores.get(i).setCargaHoraria(novaCargaHoraria);
				professores.get(i).setMateria(materia);
			}
		}
	}

	public void buscarAluno(int id) {
		for(int i= 0; i< alunos.size(); i++) {
			if(alunos.get(i).getId()==(id)) {
				System.out.println("nome: " + alunos.get(i).getNome());

			}
		}
	}

	public void buscarProfessor(int id) {
		for(int i= 0; i< professores.size(); i++) {
			if(professores.get(i).getId()==(id)) {
				System.out.println("nome:" + professores.get(i).getNome());

			}
		}

	}

}


