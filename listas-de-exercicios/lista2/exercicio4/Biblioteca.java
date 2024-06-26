package exercicio4;

/* Uma biblioteca deseja manter catalogados todos os seus livros. Você foi contratado para 
desenvolver este sistema. Sabe-se que o livro é formado pelo seu título, autor, editora, número 
de páginas, ano de publicação e situação. O atributo “situação” controla se o livro está 
disponível ou não para empréstimo. 
Logo, esta biblioteca realiza empréstimos e devoluções 
dos livros aos seus usuários. Para realizar o empréstimo de um livro, é necessário que o 
mesmo esteja disponível, ou seja, que já não tenha sido emprestado anteriormente. Para 
realizar a devolução de um livro, o mesmo deve estar como situação indisponível, ou seja, 
estar emprestado. Outra funcionalidade que deve ser possível é a exibição em tela dos dados 
UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ
CAMPUS PONTA GROSSA
DEPARTAMENTO ACADÊMICO DE INFORMÁTICA
do livro, como uma espécie de relatório, contendo o título, autor, editora, número de páginas, 
ano de publicação e a situação do livro (se está ou não disponível).
Exemplo: “Java – Como Programar, Paul Deitel, Editora Pearson, 968 páginas, 2016, 
disponível para empréstimo”.
Para efetuar a instanciação dos livros, definição dos valores de seus atributos e invocar os 
métodos de empréstimo, devolução ou relatórios, utilize uma classe de teste. */

public class Biblioteca {
	
	private Livro livro;
	
	
	// Construtor
	public Biblioteca(String titulo, String nomeAutor, String editora, int numeroPag, int anoPublicacao) {
		
		this.livro = new Livro(titulo, nomeAutor, editora, numeroPag, anoPublicacao);
	}
	
	
	public void emprestarLivro(String nome) {
		if(livro.getTitulo() == nome && livro.getSituacao() == true) { // verificando se existe algum livro com os dados fornecidos
			
			livro.setSituacao(false); // tornando o livro não disponível
			
			System.out.println("\nLivro adquirido com sucesso. Retire no balcão principal.");
		}else {
			System.out.println("\nO livro não está disponível no momento!");
		}
	}
	
	public void devolverLivro(String nome) {
		
		if(livro.getSituacao() == false && livro.getTitulo() == nome) {
			
			livro.setSituacao(true); // tornando o livro disponível novamente
			
			System.out.println("\nLivro devolvido com sucesso!");
			
		}else {
			System.out.println("\nLivro não encontrado, ou não consta como emprestado!");
		}
	}
	
	public void imprimirRelatorio() {
		System.out.println("\n\n====== Dados do Livro ======");
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getNomeAutor());
		System.out.println("Editora: " + livro.getEditora());
		System.out.println("Numero de Páginas: " + livro.getNumeroPag());
		System.out.println("Ano Publicação: " + livro.getAnoPulicacao());
	}
	
}
