package exercicio3;

public class NotebookTeste {
	public static void main(String[] args) {
		Notebook note1 = new Notebook("Dell", "Inspiron 15", 15.6, "Intel Core i5-1135G7", 8, 512);
		Notebook note2 = new Notebook("Apple", "MacBook Air", 13.3, "Apple M1", 16, 256);
		Notebook note3 = new Notebook("HP", "Pavilion 14", 14.0, "AMD Ryzen 7 5700U", 12, 500);
		
		System.out.println("\n============\n Notebook 1\n============" + note1.toString() + "\n");
		System.out.println("\n============\n Notebook 2\n============" + note2.toString() + "\n");
		System.out.println("\n============\n Notebook 3\n============" + note3.toString() + "\n");
		
	}
}
