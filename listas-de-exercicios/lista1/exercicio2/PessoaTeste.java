package exercicio2;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana Silva", "Feminino", "123.456.789-00", 28, 1.65, 60.0);
		Pessoa pessoa2 = new Pessoa("Bruno Guimarães", "Masculino", "222.222.222-00", 20, 1.85, 91.0);
		Pessoa pessoa3 = new Pessoa("José Silva", "Indefinido", "111.111.111-00", 27, 1.72, 85.0);
		
		pessoa1.andar();
		pessoa2.falar();
		pessoa3.correr();
		
	}
}
