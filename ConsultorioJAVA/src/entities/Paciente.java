package entities;

import java.time.LocalDate;

public class Paciente extends Pessoa{ //Utilização de Herança

	

	//Encapsulamento de atributos
	private String contato;
	private Endereco endereco;
	
	
	
	
	public Paciente() {}

	public Paciente(Integer id, String nome, LocalDate dataCadastro, Boolean situacao) {
		super(id, nome, dataCadastro, situacao);
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Paciente [Id: " + getId() + ", nome: " + getNome() + ", dataCadastro: " + getDataCadastro() + ", situacao: " + getSituacao() 
				+", contato: " + contato + ", endereco: " + endereco + "]" ;
	}

	

}
