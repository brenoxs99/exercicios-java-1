package exercicio5;

/* Desenvolva um sistema para uma televisão. A televisão possui uma marca, polegadas e 
resolução. Sabe-se que a TV pode ligar, desligar, alterar o canal para cima, alterar o canal 
para baixo, aumentar volume e abaixar volume do som. Ao invocar o método para alterar o 
canal para cima, será acrescentado 1 ao canal atual, como por exemplo, se a TV está 
sintonizada no canal 15, ao selecionar a funcionalidade alterar canal para cima, o canal 
selecionado passará a ser o 16, se invocado novamente, passará a ser o 17, e assim por 
diante. Essa regra vale para as outras funcionalidades como: alterar canal para baixo e 
aumento e diminuição de volume do som. Além disso, deve ser possível exibir um relatório 
contendo todos os dados da TV, como marca, polegadas, resolução, canal que está 
sintonizada e volume atual do som. Para efetuar a instanciação da televisão, definição dos 
valores de seus atributos e invocação de métodos, utilize uma classe de teste */

public class Televisao {
	private String marca;
	private double polegadas;
	private String resolucao;
	private int canalAtual;
	private int volumeAtual;
	
	//Construtor
	public Televisao(String marca, double polegadas, String resolucao) {

		this.marca = marca;
		this.polegadas = polegadas;
		this.resolucao = resolucao;
		this.canalAtual = 0;
		this.volumeAtual = 0;
	}
	
	public void ligar() {
		System.out.println("A TV foi ligada!");
	}
	
	public void desligar() {
		System.out.println("A TV foi desligada!");
	}
	
	public void alterarCanalUp() {
		this.canalAtual += 1; 
	}
	
	public void alterarCanalDown() {
		this.canalAtual -= 1;
	}
	
	public void aumentarVolume() {
		this.volumeAtual += 1;
	}
	
	public void diminuirVolume() {
		this.volumeAtual -= 1;
	}
	
	public void exibirDados() {
		
		System.out.println("====== DADOS DA TV ======");
		System.out.println("Marca: " + this.marca);
		System.out.println("Polegadas: " + this.polegadas);
		System.out.println("Resolução da TV: " + this.resolucao);
		System.out.println("\nVolume atual: " + this.volumeAtual);
		System.out.println("Canal atual: " + this.canalAtual);
	}
	
}
