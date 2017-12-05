//classe
public class Livro {
	
	//atributos
	String nome;
	Autor autor;
	String genero;
	Editora editora;
	int anoPublicacao;
	double preco;
	
	//construtor
	Livro() {
	}
	
	//metodo
	//<tipo de retorno> nome do metodo
	double obterPreco() {
		// == (numeros)
		// .equals("")
		if(genero.equals("terror")) {
			return 5.00;
		} else if (genero.equals("romance")) {
			return 6.00;
		} else if(genero.equals("ficção")) {
			return 8.00;
		} else {
			return 10.00;
		}
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
