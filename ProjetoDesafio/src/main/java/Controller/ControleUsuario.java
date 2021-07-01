package Controller;

import dominio.Usuario;

public class ControleUsuario {
	
	/*para que a classe de controle posso se comunicar com a classe de dominio
	 * e enviar menssagens para a classe de dominio é necessario que a classe de contole tenha 
	 * um objeto da classe de dominio que no caso é Usuario */ 
	
	/*então criamos a variavel "U" e automaticamente essa variavel é do tipo Usuario, 
	 o comando new ele tem 3 funções que são.
	 
	 1- cria o objeto de Usuario na memoria do computador, e esse objeto Usuario tem todos os atributos
	 	 da classe Usuario e tem direito a mandar menssgens para todos os metodos que essa classe Usuario tem
	 	no momento só temos metodos geters and seters. 
	 	
	 2 - atribuir a variavel U,  que é a variavel que está recebendo a criação desse objeto
	 	o endereço de memoria desse objeto, então U passa a ser um pontero desse novo objeto Usuario
	 	
	 3 - executar o metodo construtor da classe animal, como nosso metodo construtor está vazio nada vai acontecer 
	  */
	
	Usuario u = new Usuario();
	public void cadastrousuario (String nome, int idade, String cpf) {
	
		u.setNome(nome);
		u.setIdade(idade);
		u.setCpf(cpf);
	}
	
}
