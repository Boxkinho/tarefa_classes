package tarefaM7;

public class PrimeiraEscola {

	public static void main(String args[]) {
		
		Aluno aluno = new Aluno();
		aluno.cadastrarEndereco("Rua Projetada S/N.");
		aluno.setCodigo(01);
		
		System.out.println(aluno.getCodigo());
		System.out.println(aluno.getEndereco());
		System.out.println(aluno.getSala());
		System.out.println(aluno.retornarNomeAluno());
	}

}

