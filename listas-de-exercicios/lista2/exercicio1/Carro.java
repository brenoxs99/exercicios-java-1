package exercicio1;

/* Desenvolva um sistema para controlar um carro. Sabe-se que o carro é identificado pelo seu 
modelo, marca, cor, ano, renavam, chassi e placa. Além disso, o carro pode ligar, desligar, 
acelerar e frear. Ao invocar os métodos do carro, o mesmo deverá exibir o que está ocorrendo, 
como por exemplo, ao invocar o método ligar, deve-se exibir uma mensagem: “<modelo do 
carro> está ligando”. Ao ser invocado o método acelerar, deve exibir: “<modelo do carro> está 
acelerando”, e assim por diante. Utilize uma classe de teste para instanciar vários carros, 
atribuir seus respectivos valores e invocar os métodos de cada um. */

public class Carro {
	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private int renavam;
	private String chassi;
	private String placa;
	
	
	// Construtor
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
		System.out.println(this.modelo + " está ligando!");
	}
	
	public void desligar() {
		System.out.println(this.modelo + " está desligando!");
	}
	
	public void acelerar() {
		System.out.println(this.modelo + " está acelerando!");
	}
	
	public void frear() {
		System.out.println(this.modelo + " está freando!");
	}
	
}
