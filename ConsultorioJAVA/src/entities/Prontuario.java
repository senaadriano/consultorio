package entities;

import java.time.LocalDate;

public class Prontuario {
	
	//Encapsulamento de atributos
	private Integer id;
	private Paciente paciente;
	private ProfissionalDeSaude profissional;
	private String diagnostico;
	private String prescricao;
	private Exames exames;
	private String observacoes;
	private LocalDate dataDoCadastro;
	private Boolean situacao;
	
	public Prontuario() {}

	public Prontuario(Integer id, Paciente paciente, ProfissionalDeSaude profissional, String diagnostico,
			String prescricao, Exames exames, String observacoes, LocalDate dataDoCadastro, Boolean situacao) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.profissional = profissional;
		this.diagnostico = diagnostico;
		this.prescricao = prescricao;
		this.exames = exames;
		this.observacoes = observacoes;
		this.dataDoCadastro = dataDoCadastro;
		this.situacao = situacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ProfissionalDeSaude getProfissional() {
		return profissional;
	}

	public void setProfissional(ProfissionalDeSaude profissional) {
		this.profissional = profissional;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

	public Exames getExames() {
		return exames;
	}

	public void setExames(Exames exames) {
		this.exames = exames;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public LocalDate getDataDoCadastro() {
		return dataDoCadastro;
	}

	public void setDataDoCadastro(LocalDate dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
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
		return "Prontuario [id: " + id + ", paciente: " + paciente + ", profissional: " + profissional + ", diagnostico: "
				+ diagnostico + ", prescricao: " + prescricao + ", exames: " + exames + ", observacoes: " + observacoes
				+ ", dataDoCadastro: " + dataDoCadastro + ", situacao: " + situacao + "]";
	}
	
	
	
	
}
