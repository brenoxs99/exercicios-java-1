package exercicio5;

/* Desenvolva um sistema de calculadora. Cada calculadora é identificada por sua marca,
modelo, tipo e memória interna. Além disso, cada calculadora pode ligar, desligar, realizar
os cálculos de soma, subtração, multiplicação e divisão. Para instanciar e atribuir os valores
para cada calculadora, declare uma classe de teste */

public class Calculadora {
	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaIterna;
	
	
	// Contrutor
	public Calculadora(String marca, String modelo, String tipo, int memoriaIterna) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaIterna = memoriaIterna;
	}
	
	
	public void ligar() {
		System.out.println("Calculadora Ligada!");
	}
	
	public void desligar() {
		System.out.println("Calculadora Desligada!");
	}
	
	public void somar(int num1, int num2) {
		int resultado = num1 + num2;
		
		System.out.println("RESULTADO DA SOMA: " + resultado);
	}
	
	public void subtrair(int num1, int num2) {
		int resultado = num1 - num2;
		
		System.out.println("RESULTADO DA SUBTRAÇÃO: " + resultado);
	}
	
	public void multiplicar(int num1, int num2) {
		int resultado = num1 * num2;
		
		System.out.println("RESULTADO DA MULTIPLICAÇÃO: " + resultado);
	}
	
	public void dividir(int num1, int num2) {
		int resultado = num1 / num2;
		
		System.out.println("RESULTADO DA DIVISÃO: " + resultado);
	}
}
