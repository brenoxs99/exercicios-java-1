package exercicio1;

// Classe que possui a (main) para testar o script - da classe Carro
public class CarroTeste {
	public static void main(String[] args) {
		
		//Atribuido dados através do método construtor
		Carro carro1 = new Carro("Gol", "Wolskswagen", "vermelha", 2016, 90601, "0919012840402-12", "XSD-1254");
		Carro carro2 = new Carro("Palio", "Fiat", "prata", 2012, 88877, "980242748127-11", "GFD-5344");
		Carro carro3 = new Carro("Celta", "Chevrolet", "preta", 2014, 12822, "123494812756-19", "USF-4568");
		
		
		// Chamando os métodos
		carro1.ligar();
		carro2.acelerar();
		carro3.frear();
		
		
	}
}
