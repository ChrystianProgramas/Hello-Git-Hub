
public class Executa {
	public static void main(String[] args) {
		//Tipo <nome>;
		Livro l1; //variavel l1
		Livro l2; //variavel l2
		
		l1 = new Livro(); //objeto l1
		l2 = new Livro(); //objeto l2
		//Objeto autor
		Autor a = new Autor();
		a.nome = "Tolken";
		a.anoNascimento = 1901;
		a.anoFalecimento = 1989;
		
		Endereco e1 = new Endereco();
		e1.rua = "Rua das moças";
		e1.numero = 100;
		
		Endereco e2 = new Endereco();
		e2.rua = "Rua dos meninos";
		e2.bairro = "Janga";
		e2.numero = 200;
		
		Editora ed1 = new Editora();
		ed1.nome = "Editora Brasil";
		ed1.endereco = e1;
		
		Editora  ed2 =  new Editora();
		ed2.nome = "Editora Imperial";
		ed2.endereco = e1;
		
		//objeto l1
		l1.nome = "O senhor dos aneis";
		l1.autor = a;
		//l1.editora = "Editora Brasil";
		l1.genero = "ficção";
		l1.anoPublicacao = 2016;
		l1.editora = ed1;
		//l1.editora.nome = "Editora Brasil";
		//l1.editora.endereco.rua = "Rua das marias";
		//objeto l2
		l2.nome = "O Hobbit";
		l2.autor = a;
		l2.editora = ed2;
		l2.genero = "romance";
		l2.anoPublicacao = 2017;
		
		// LIVRO 1
		System.out.println("Autor: " + l1.autor.nome);
		System.out.println("Genero: " + l1.genero);
		l1.preco =  l1.obterPreco();
		System.out.println("Preço: R$ " + l1.preco);
		
		//LIVRO 2
		System.out.println("Autor: " + l2.autor.nome);
		System.out.println("Genero: " + l2.genero);
		l2.preco = l2.obterPreco();
		System.out.println("Preço: R$ " + l2.preco);
		
		
		
		
		
		
		
				
		
	}

}
