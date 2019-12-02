package modelo;


public class Aluno extends Pessoa {

	private String modulo;
	private String email;
   
    public Aluno(int id, String nome, String email, String cpf, String modulo, String sexo) {
		super(id, nome, cpf, sexo);
	
	}
    
    //sobrescrita
    public String getNome() {
		return "Aluno: " + super.getNome();
	}


	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
