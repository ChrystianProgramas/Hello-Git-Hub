import java.util.Scanner;
public class Executa {
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {


{Cliente C = new Cliente();
System.out.println("Digite seu nome: ");
C.nome = leia.nextLine();
System.out.println("Digite seu CPF: ");
C.cpf = leia.nextInt();
System.out.println("Digite seu telefone: ");
C.telefone = leia.nextInt();
System.out.println("Digite seu ano de nascimento");
C.anoNascimento = leia.nextInt();
System.out.println("Digite seu RG: ");
C.rg = leia.nextInt();
	}

{Endereco E = new Endereco();
System.out.println("Informe sua rua: ");
E.rua = leia.nextLine();
System.out.println("Informe numero da casa:");
E.numcasa = leia.nextInt();
System.out.println("Informe seu Bairro: ");
E.bairro = leia.nextLine();
System.out.println("Informe sua cidade: ");
E.cidade = leia.nextLine();
System.out.println("Informe seu estado: ");
E.uf = leia.nextLine();
System.out.println("Informe seu cep");
E.cep = leia.nextInt();


}

	
	}
}