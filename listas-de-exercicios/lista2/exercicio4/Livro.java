package exercicio4;


public class Livro {
	private String titulo;
	private String nomeAutor;
	private String editora;
	private int numeroPag;
	private int anoPulicacao;
	private boolean situacao;
	
	
	// Construtor
	public Livro(String titulo, String nomeAutor, String editora, int numeroPag, int anoPulicacao) {
		
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.editora = editora;
		this.numeroPag = numeroPag;
		this.anoPulicacao = anoPulicacao;
		this.situacao = true;
	}



	public String getTitulo() {
		return titulo;
	}



	public String getNomeAutor() {
		return nomeAutor;
	}



	public String getEditora() {
		return editora;
	}



	public int getNumeroPag() {
		return numeroPag;
	}



	public int getAnoPulicacao() {
		return anoPulicacao;
	}



	public boolean getSituacao() {
		return situacao;
	}



	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
