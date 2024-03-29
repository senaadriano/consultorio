package entities;

import java.time.LocalDate;

public abstract class Pessoa { // Utilização de classe abstrata

	private Integer id;
	private String nome;
	private LocalDate dataCadastro;
	private Boolean situacao;
	
	
	public Pessoa() {}

	public Pessoa(Integer id, String nome, LocalDate dataCadastro, Boolean situacao) {
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.situacao = situacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "[Id=" + id + ", nome=" + nome + ", dataCadastro=" + dataCadastro + ", situacao=" + situacao
				+ "]";
	}
	
	
	}

	


