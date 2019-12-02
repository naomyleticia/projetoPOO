package modelo;

public class Professor extends Pessoa{

	private int cargaHoraria;
	private String Materia;
	
	public Professor(String nome, String materia, String cpf, String sexo, String Materia, int cargaHoraria, int id) {
		super(id, nome, cpf, sexo);
		this.cargaHoraria = cargaHoraria;
	}

	public Professor(String cpf, String sexo, int id,String nome) {
		super(id, nome, cpf, sexo);
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getMateria() {
		return Materia;
	}
	
	public void setMateria(String materia) {
		Materia = materia;
	}

}
