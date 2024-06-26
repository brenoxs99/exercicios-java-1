package exercicio4;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca liv1 = new Biblioteca("Segurança da Informação", "João Silva", "Labrador", 250, 2018);
		
		liv1.emprestarLivro("Segurança da Informação");
		liv1.devolverLivro("Segurança da Informação");
		
		
		liv1.imprimirRelatorio();
	}
}
