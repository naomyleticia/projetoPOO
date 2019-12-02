package modelo;

public abstract class Pessoa{
	 private int id;
	    private String nome;
	    private String cpf;
	    private String sexo;
		
		public Pessoa(int id, String nome,String cpf,String sexo) {
			this.cpf = cpf;
			this.id = id;
			this.sexo = sexo;
			this.nome = nome;
			
		}
		//sobrecarga
		public Pessoa(String sexo, String nome) {
			this.sexo = sexo;
			this.nome = nome;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
	
		
		
}