
public class Exercicio05 {

	public static void main(String args[]){
		
/*3. Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
Sobe : para subir um andar (não deve subir se já estiver no último andar);
Desce : para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).*/
		
		//Run
		Elevador e1 = new Elevador();
		e1.Inicializa(5);
		e1.Entra();
		e1.Entra();
		e1.Entra();
		e1.Entra();
		e1.Entra();
		e1.Entra();
		
			
	}
}


class Elevador {
	
	Integer andar;
	Integer capacidadeMaxima;
	Integer quantidadePessoas;
	
	//Constructors
	public Elevador(Integer capacidadeMaxima) {
		super();
		this.andar = 0;
		this.capacidadeMaxima = capacidadeMaxima;
		this.quantidadePessoas = 0;
	}
	
	public Elevador() {
	}
	
	//Getters e Setters
	public Integer getAndar() {
		return andar;
	}
	public void setAndar(Integer andar) {
		this.andar = andar;
	}
	public Integer getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(Integer capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}
	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	//Métodos
	public void Inicializa(Integer capacidade) {
		this.andar = 0;
		this.capacidadeMaxima = capacidade;
		this.quantidadePessoas = 0;
		
		System.out.println("Instalado novo elevador no prédio com capacidade para transportar "  + this.capacidadeMaxima + " pessoas.");
	}
	
	
	/*
	 * 
	 * Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
Sobe : para subir um andar (não deve subir se já estiver no último andar);
Desce : para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).*/
	 
	public void Entra() {
		if (this.capacidadeMaxima>this.quantidadePessoas) {
			this.quantidadePessoas++;
			if (this.quantidadePessoas>1) {
				String andarVerificado = verificarAndar(this.andar);
				System.out.println("Entrou mais uma pessoa no Elevador, que agora transporta " + this.quantidadePessoas +
						" pessoas e está no "+ andarVerificado + ".");
			} else {
				String andarVerificado = verificarAndar(this.andar);
				System.out.println("Uma pessoa entrou no elevador que está no " + andarVerificado+ ".");
			}
			
		} else {
			System.out.println("O elevador já está lotado.");
		}
	}
	
	public void Sai() {
		if (this.quantidadePessoas>0) {
			this.quantidadePessoas--;
			switch(this.quantidadePessoas) {
			case 0:
				System.out.println("O elevador agora está vazio.");
			break;
			case 1:
				System.out.println("O elevador agora está com 1 pessoa.");
			default:
				System.out.println("O elevador agora está com " + this.quantidadePessoas + "pessoas.");
			}
		} else {
			System.out.println("O elevador já está vazio!");
		}
	}

	private String verificarAndar(Integer andarVerificar) {
		String andarVerificado ="";
		switch(andarVerificar) {
			case 0:
				andarVerificado= "térreo";
			break;
			default:
			String uni[] = {"", "primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", 
					"sétimo", "oitavo", "nono"};
			
			String dec[] = {"", "décimo", "vigésimo", "trigésimo", "quadragésimo", "quinquagésimo", "sexagésimo", 
					"septuagésimo", "octagésimo", "nanagésimo"};
			
			Integer unidade = andarVerificar%10;
			Integer dezena = (andarVerificar/10)%10;
			if(andarVerificar>9) {
				andarVerificado = dec[dezena] + " " + uni[unidade] + " andar";
			} else if (andarVerificar<10) {
				andarVerificado= uni[unidade]+ " andar";
			} else {
				andarVerificado= "indefinido";
			}	 
		}//fim do Switch
		return andarVerificado;
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}