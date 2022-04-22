import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exercicio03 {

	public static void main(String args[]) throws ParseException{
		
/*1. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.

Exercícios do http://www.facom.ufu.br/~bacala/POO/lista1.pdf*/
			
		Pessoa p1 = new Pessoa();
		p1.setAltura(1.8);
		Calendar data = new GregorianCalendar(1990,3,20); //20 de Abril de 1990 (Mês começa com 0 (zero) - 0-Jan/ 1 -Fev / 2 - Mar / ...)
		p1.setNome("João Feliciano");
		p1.setDataNascimento(data.getTime());
		p1.retornaDadosPessoa(p1);
		
		p1.calculaIdade(p1);
		
		
	}
}

class Pessoa {
	private String nome;
	private Date dataNascimento;
	private Double altura;
	
	
	public void retornaDadosPessoa(Pessoa p) {
		
		System.out.println("Nome: " + p.nome);
		System.out.println("Data de Nascimento: " + p.dataNascimento);
		System.out.println("Altura: " + p.altura);
	
	}
	
	public void calculaIdade(Pessoa p) {
		
		//Dados da Data de Nascimento da Pessoa		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(p.dataNascimento);
	
		Integer anoNascimento = calendar.get(Calendar.YEAR);
		Integer mesNascimento = calendar.get(Calendar.MONTH);
		Integer diaNascimento = calendar.get(Calendar.DAY_OF_MONTH);
		
		//Dados da Data atual
		Date dataAtual = Calendar.getInstance().getTime();
		Calendar calendarHoje = Calendar.getInstance();
		calendarHoje.setTime(dataAtual);
		
		Integer anoAtual = calendarHoje.get(Calendar.YEAR);
		Integer mesAtual = calendarHoje.get(Calendar.MONTH);
		Integer diaAtual = calendarHoje.get(Calendar.DAY_OF_MONTH);
		
		//Cálculo da idade
		Integer idade = anoAtual - anoNascimento;
		
		if (mesAtual<mesNascimento || mesAtual==mesNascimento && diaAtual<diaNascimento ) {
			idade--;
		}	
		System.out.println(p.nome + " possui " + idade.toString() + " anos de vida.");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
}
