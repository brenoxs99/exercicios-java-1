package exercicio2;

/* Crie uma classe chamada Pessoa:
       Declare os seguintes atributos: nome (String); sexo (String); cpf (String); idade (int); altura
      (Double); Peso (Double).
   
       Declare os métodos: andar (void), correr (void), falar (void) e dormir (void).
       
       Crie uma classe chamada PessoaTeste:

       Declare o método main e crie (instancie) três objetos do tipo Pessoa, atribuindo para
       cada um os valores de seus atributos. */

public class Pessoa {
	
	private String nome;
	private String sexo;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;
	
	// Construtor
	public Pessoa(String nome, String sexo, String cpf, int idade, double altura, double peso) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public void andar() {
		System.out.println(this.nome + " está andando!");
	}
	
	public void correr() {
		System.out.println(this.nome + " está correndo!");
	}
	
	public void falar() {
		System.out.println(this.nome + " está falando!");
	}
	
	public void dormir() {
		System.out.println(this.nome + " está dormindo!");
	}
}
