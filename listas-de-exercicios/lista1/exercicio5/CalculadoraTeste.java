package exercicio5;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calc1 = new Calculadora("Casio", "FX-991EX", "Científica", 64);
		
		
		
		/* Testando Métodos */
		//calc1.ligar();
		//calc1.ligar();
		
		calc1.somar(4, 3);
		calc1.subtrair(4, 3);
		calc1.multiplicar(4, 3);
		calc1.dividir(10, 2);
	}
}
