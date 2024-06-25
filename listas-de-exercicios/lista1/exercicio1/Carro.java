package exercicio1;
/*Crie uma classe chamada Carro:
	 Declare os seguintes atributos: modelo (String); marca (String); cor (String); ano (int);
	renavam (int); chassi (String); placa (String).
	 Declare os métodos: ligar (void), desligar (void), acelerar (void) e frear (void).
	Crie uma classe chamada CarroTeste:
	 Declare o método main e crie (instancie) três objetos do tipo Carro, atribuindo para cada
	um os valores de seus atributos.*/


public class Carro {
	
	// Aplicando os conceitos de encapsulamento, quando declareamos os atributos privados;
	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private int renavam;
	private String chassi;
	private String placa;
	
	//Construtor
	public Carro(String modelo, String marca, String cor, int ano, int renavam, String chassi, String placa) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}
	
	public void ligar() {
		System.out.println(this.modelo + " foi ligado!");
	}
	
	public void desligar() {
		System.out.println(this.modelo + " foi desligado!");
	}
	
	public void acelerar() {
		System.out.println(this.modelo + " está acelerando!");
	}
	
	public void frear() {
		System.out.println(this.modelo + " está freando!");
	}
}
