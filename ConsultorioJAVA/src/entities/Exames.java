package entities;

import java.time.LocalDate;

import entities.enums.Categoria;

public class Exames {

	//Encapsulamento de atributos
	private Integer id;
	private String nomeExame;
	private String descricao;
	private String observacao;
	private Categoria categoria;
	private LocalDate dataCadastro;
	private Boolean situacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
	
	//Sobrescrita do método ToString
	@Override
	public String toString() {
		return "Exames id: " + id + ", nomeExame: " + nomeExame + ", descricao: " + descricao + ", observacao: "
				+ observacao + ", categoria: " + categoria + ", dataCadastro: " + dataCadastro + ", situacao: " + situacao
				+ "]";
	}
	
	
}
