package exercicio4;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.cadastrarAluno(123456, "João da Silva", "Engenharia de Software", "Noturno", 6, 8.5, "Regular");
		aluno1.imprimirDados();
	}
}
