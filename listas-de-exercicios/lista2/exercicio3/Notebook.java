package exercicio3;

/* Desenvolva um sistema para manter registros de notebook. Sabe-se que cada notebook é 
identificado por uma marca, modelo, polegadas da tela, modelo do processador, quantidade 
de memória ram e capacidade de armazenamento. Como comportamento, cada notebook 
pode ligar, desligar, processar informações e conectar à internet. Ao invocar os métodos de 
um determinado notebook, o sistema deve exibir uma mensagem da ação realizada pelo 
notebook, como por exemplo: ao invocar o método ligar a mensagem “<modelo do notebook> 
está ligando.” deve ser mostrada, ao invocar o método processar informações a mensagem 
“<modelo do notebook está processando informações” deve ser exibida, entre outras. Para 
instanciar objetos, atribuir os valores para cada notebook e invocar os métodos de cada um, 
declare uma classe de teste que conterá o método main. */

public class Notebook {
	
	private String marca;
	private String modelo;
	private double polegadas;
	private String modeloProcessador;
	private int memoriaRam;
	private int memoriaArmazenamento;
	
	
	///Construtor
	public Notebook(String marca, String modelo, double polegadas, String modeloProcessador, int memoriaRam, int memoriaArmazenamento) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.polegadas = polegadas;
		this.modeloProcessador = modeloProcessador;
		this.memoriaRam = memoriaRam;
		this.memoriaArmazenamento = memoriaArmazenamento;
	}
	
	public void ligar() {
		System.out.println("Notebook " + this.marca + " está ligando!");
	}
	
	public void desligar() {
		System.out.println("Notebook " + this.marca + " está desligando!");
	}
	
	public void processarInfo() {
		System.out.println("Notebook " + this.marca + " está processando informações!");
	}
	
	public void conectarInternet() {
		System.out.println("Notebook " + this.marca + " está conectando a internet!");
	}
	
	
	@Override
	// Método toString retorna uma string com todos os dados dos atributos da classe que foi criado
	public String toString() {
		return "\nMarca: " + marca + "\nModelo: " + modelo + "\nPolegadas: " + polegadas + "\nModeloProcessador: "
				+ modeloProcessador + "\nMemoria Ram: " + memoriaRam + "\nMemoria Armazenamento: " + memoriaArmazenamento + " GB";
	}
	
	
}
