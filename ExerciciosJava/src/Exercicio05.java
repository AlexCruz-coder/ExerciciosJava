
public class Exercicio05 {

	public static void main(String args[]){
		
/*3. Crie uma classe denominada Elevador para armazenar as informa��es de um elevador
dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares
no pr�dio (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o
presentes nele. A classe deve tamb�m disponibilizar os seguintes m�todos:
Inicializa : que deve receber como par�metros a capacidade do elevador e o total de
andares no pr�dio (os elevadores sempre come�am no t�rreo e vazio);
Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver
espa�o);
Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m
dentro dele);
Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);
Encapsular todos os atributos da classe (criar os m�todos set e get).*/
		
		//Run
		Elevador e1 = new Elevador();
		e1.Inicializa(5);
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
	
	//M�todos
	public void Inicializa(Integer capacidade) {
		this.andar = 0;
		this.capacidadeMaxima = capacidade;
		this.quantidadePessoas = 0;
		
		System.out.println("Instalado novo elevador no pr�dio com capacidade para transportar "  + this.capacidadeMaxima + " pessoas.");
	}
	
	
	/*
	 * 
	 * Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver
espa�o);
Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m
dentro dele);
Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);
Encapsular todos os atributos da classe (criar os m�todos set e get).*/
	 
	public void Entra() {
		if (this.capacidadeMaxima>this.quantidadePessoas) {
			this.quantidadePessoas++;
			if (this.quantidadePessoas>1) {
				System.out.println("Entrou mais uma pessoa no Elevador, que agora transporta " + this.quantidadePessoas + " pessoas.");
			} else {
				String andarVerificado = verificarAndar(this.andar);
				System.out.println("Uma pessoa entrou no elevador que est� no " + andarVerificado);
			}
			
		}
	}

	private String verificarAndar(Integer andarVerificar) {
		String andarVerificado ="";
		switch(andarVerificar) {
			case 0:
				andarVerificado= "t�rreo";
			break;
			default:
			String uni[] = {"", "primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", 
					"s�timo", "oitavo", "nono"};
			
			String dec[] = {"", "d�cimo", "vig�simo", "trig�simo", "quadrag�simo", "quinquag�simo", "sexag�simo", 
					"septuag�simo", "octag�simo", "nanag�simo"};
			
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