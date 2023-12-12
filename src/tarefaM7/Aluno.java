package tarefaM7;

public class Aluno {
		
		private int codigo;
		private String nome;
		private String endereco;
		private int sala;
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public void cadastrarEndereco(String endereco) {
			setEndereco(endereco);
		}
		
		
		public String retornarNomeAluno() {
			return "Nome do Aluno: João.";
		}
		
		public int getSala() {
			return 5;
		}


	}

