package exercicio4;

/* Desenvolva um sistema para manter o registro de alunos. Cada aluno é identificado pelo
seu número de RA, nome, curso, turno, período, coeficiente e situação. Cada aluno também
pode imprimir um relatório dos seus próprios dados. Para instanciar objetos e atribuir os
valores para cada aluno, declare uma classe de teste. */

public class Aluno {
	private int ra;
	private String nome;
	private String curso;
	private String turno;
	private int periodo;
	private double coeficiente;
	private String situacao;
	
	
	// Construtor
	public Aluno() { // toda classe tem que ter um construtor -- ou ele recebe dados na instanciação, ou iniciamos ele com 0 (int) e null para (string)
		
		this.ra = 0;
		this.nome = null;
		this.curso = null;
		this.turno = null;
		this.periodo = 0;
		this.coeficiente = 0.0;
		this.situacao = null;
	}
	
	public void cadastrarAluno(int ra, String nome, String curso, String turno, int periodo, double coeficiente, String situacao) {
		
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
		this.turno = turno;
		this.periodo = periodo;
		this.coeficiente = coeficiente;
		this.situacao = situacao;
		
		System.out.println("Aluno(a) cadastrado(a) com sucesso!\n");
	}
	
	public void imprimirDados() {
		System.out.println("===== DADODS DO ALUNO =====");
		System.out.println("RA: " + this.ra);
		System.out.println("Nome: " + this.nome);
		System.out.println("Curso: " + this.curso);
		System.out.println("Turno: " + this.turno);
		System.out.println("Período: " + this.periodo + "º");
		System.out.println("Coeficiente: " + this.coeficiente);
		System.out.println("Situação: " + this.situacao);
	}
	
	
}
