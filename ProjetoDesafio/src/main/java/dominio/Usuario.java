package dominio;/* Camada de dominio*/



public class Usuario {
	
	/* Aqui criamos os atributos privados!,
	 * a palvra private indica a visibilidade dos atributos ele não podem ser vistos por outros objetos 
	 * para permitir o encapsulamento*/
	
	private String nome;
	private int idade;
	private String cpf;
	
	/* aqui criamos o metodo construtor, ele deve vir sem retorno, 
	 * ele sempre é executado na hora que um objeto é construido na memoria do computador*/
	public Usuario () {
		super();
	}
	
	public Usuario(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}



	/* aqui criamos os atributos gets e seters de cada atributo, o get serve para obter o stado do atributo
	 * o metodo set serve para definir ou alterar o valor do atributo*/

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
