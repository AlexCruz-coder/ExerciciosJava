import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {

	public static void main(String args[]){
		
/*2. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.*/
		
		//Tentando remover uma pessoa da lista vazia
		Agenda agenda = new Agenda();
		agenda.removePessoa("Fulano");
		
		//Inserindo contatos na agenda
		agenda.armazenaPessoa("Fulano", 20, 1.75f);
		agenda.armazenaPessoa("Alex", 40, 1.75f);
		agenda.armazenaPessoa("Joao", 20, 1.75f);
		agenda.armazenaPessoa("Vitor", 23, 1.75f);
		agenda.armazenaPessoa("Adriano", 18, 1.75f);
		agenda.armazenaPessoa("Bruno", 22, 1.75f);
		agenda.armazenaPessoa("Mari", 26, 1.75f);
		agenda.armazenaPessoa("Mila", 19, 1.75f);
		
		
		//Buscando pessoa na Agenda
		String contatoProcurado = "Alex";
		Integer numeroAgenda = agenda.buscaPessoa(contatoProcurado);
		System.out.println("O "+ contatoProcurado + " está no índice "+ numeroAgenda.toString() + " da Agenda.");
			
		String contatoRemover = "Fulano";
		agenda.removePessoa(contatoRemover);
		
		//imprimindo uma única pessoa da agenda
		agenda.imprimePessoa(3);
		
		//Imprimindo agenda inteira
		agenda.imprimeAgenda();
	}
}


class Agenda {
	
	List<Pessoas> listPessoas = new ArrayList<Pessoas>(10);
	
	public void armazenaPessoa(String nome, int idade, float altura) {
		Pessoas p1 = new Pessoas(nome, idade, altura);	
		this.listPessoas.add(p1);	
		System.out.println("O contato " + nome + " foi inserido na Agenda.");
	}
	
	public int buscaPessoa(String nome) {
		Integer codigoPessoa = null;
		for(int i=0; i<this.listPessoas.size();i++) {
			if (this.listPessoas.get(i).getNome().equals(nome)) {
				codigoPessoa = i;
			}
		}
		return codigoPessoa.intValue();
	}
	
	public void removePessoa(String nome) {
		if (this.listPessoas.isEmpty()) {
			System.out.println("O contato: " + nome + " não existe na Agenda. A agenda está vazia.");
			return;
		}
		
		for (int i = 0; i<this.listPessoas.size(); i++) {
			if (this.listPessoas.get(i).getNome().equals(nome)) {
				this.listPessoas.remove(i);
				System.out.println("O contato: " + nome + " foi apagado da Agenda.");
			}
		}
		
	}
	
	public void imprimeAgenda() {
		
		for (int i = 0; i<this.listPessoas.size(); i++) {
			System.out.println("===========================");
			System.out.println("Índice: " + i);
			System.out.println("Nome: " + this.listPessoas.get(i).getNome());
			System.out.println("Altura: " + this.listPessoas.get(i).getAltura());
			System.out.println("idade: " + this.listPessoas.get(i).getIdade());
			System.out.println("===========================");
		}
	}
	
	public void imprimePessoa(int indice) {
		
		System.out.println("===========================");
		System.out.println("Índice: " + indice);
		System.out.println("Nome: " + this.listPessoas.get(indice).getNome());
		System.out.println("Altura: " + this.listPessoas.get(indice).getAltura());
		System.out.println("idade: " + this.listPessoas.get(indice).getIdade());
		System.out.println("===========================");
	}
}

class Pessoas {
	
	private String nome;
	private int idade;
	private float altura; 
	
	public Pessoas(String nome, int idade, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
}
