
public class Pessoa {




	private String nome;
	private Integer idade;
	private Integer altura;
	
	
	public Pessoa(String nome, Integer idade, Integer altura) { // metodo construtor com campos
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	
	public Pessoa() {
		super();
		// "" construtor vazio (metodo construtor eh caracterizado pois tem o mesmo nome que a classe)
	
}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public Integer getAltura() {
		return altura;
	}


	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
}
