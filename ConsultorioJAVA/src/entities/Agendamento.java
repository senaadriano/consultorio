package entities;

import java.time.LocalDate;

import entities.enums.Especialidade;
import entities.enums.TipoAtendimento;

public class Agendamento {
	
	//Encapsulamento de atributos
	private Integer id;
	private Paciente paciente;
	private Especialidade especialidade;
	private ProfissionalDeSaude profissional;
	private String convenio;
	private LocalDate dataAtendimento;
	private TipoAtendimento tipoAtendimento;
	private String local;
	private Boolean situacao;
	
	
	public Agendamento() {}


	public Agendamento(Integer id, Paciente paciente, Especialidade especialidade, ProfissionalDeSaude profissional,
			String convenio, LocalDate dataAtendimento, TipoAtendimento tipoAtendimento, String local,
			Boolean situacao) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.especialidade = especialidade;
		this.profissional = profissional;
		this.convenio = convenio;
		this.dataAtendimento = dataAtendimento;
		this.tipoAtendimento = tipoAtendimento;
		this.local = local;
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


	public Especialidade getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}


	public ProfissionalDeSaude getProfissional() {
		return profissional;
	}


	public void setProfissional(ProfissionalDeSaude profissional) {
		this.profissional = profissional;
	}


	public String getConvenio() {
		return convenio;
	}


	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}


	public LocalDate getDataAtendimento() {
		return dataAtendimento;
	}


	public void setDataAtendimento(LocalDate dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}


	public TipoAtendimento getTipoAtendimento() {
		return tipoAtendimento;
	}


	public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
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
		return "Agendamento [id: " + id + ", paciente: " + paciente + ", especialidade: " + especialidade
				+ ", profissional: " + profissional + ", convenio: " + convenio + ", dataAtendimento: " + dataAtendimento
				+ ", tipoAtendimento: " + tipoAtendimento + ", local: " + local + ", situacao: " + situacao + "]";
	}
	
	
}
