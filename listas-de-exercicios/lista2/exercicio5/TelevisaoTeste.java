package exercicio5;

public class TelevisaoTeste {
	public static void main(String[] args) {
		
		Televisao tv1 = new Televisao("Samsung", 19.5, "1920x1440");
		
		// alamentando o canal  +3
		tv1.alterarCanalUp();
		tv1.alterarCanalUp();
		tv1.alterarCanalUp();
		
		// abaixando o canal    -2
		tv1.alterarCanalDown();
		tv1.alterarCanalDown(); 
		
		
		// alamentando o volume +5
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		
		// abaixando o volume   -1
		tv1.diminuirVolume();
		
		
		// exibindo relatório da tv
		tv1.exibirDados();
		
		
	}
}
