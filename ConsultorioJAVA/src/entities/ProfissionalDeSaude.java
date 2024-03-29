package entities;

import java.time.LocalDate;

import entities.enums.Especialidade;
import entities.enums.TipoProfissional;

public class ProfissionalDeSaude extends Pessoa{//Utilização de Herança
	
	//Encapsulamento de atributos
	
	private TipoProfissional tipo;
	private Especialidade especialidades;
	
	
	
	public ProfissionalDeSaude() {}

	public ProfissionalDeSaude(Integer id, String nome, LocalDate dataCadastro, Boolean situacao) {
		super(id, nome, dataCadastro, situacao);
	}

	public TipoProfissional getTipo() {
		return tipo;
	}

	public void setTipo(TipoProfissional tipo) {
		this.tipo = tipo;
	}

	public Especialidade getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public String toString() {
		return "ProfissionalDeSaude [Id: " + getId() + ", nome: " + getNome() + ", dataCadastro: " + getDataCadastro() + ", situacao: " + 
	getSituacao() + "+tipo: " + tipo + ", especialidades: " + especialidades + "]";
	}

	
	}
	
	

