package entities.impressao;


import java.time.LocalDate;

import entities.basedados.BaseDados;

public class Impressao {


	BaseDados bd = new BaseDados();

	public void obterPacientes() {
		System.out.println("-----LISTA COM TODOS OS PACIENTES-----");
		for (int i = 0; i < bd.pacientes().size(); i++) {
			System.out.println(bd.pacientes().get(i));
		}
		System.out.println();
	}

	public void obterProfissionais() {
		System.out.println("-----LISTA COM TODOS OS PROFISSIONAIS-----");
		for (int i = 0; i < bd.profissionais().size(); i++) {
			System.out.println(bd.profissionais().get(i));
		}
		System.out.println();
	}

	public void obterExames() {
		System.out.println("-----LISTA COM TODOS OS EXAMES-----");
		for (int i = 0; i < bd.exames().size(); i++) {
			System.out.println(bd.exames().get(i));

		}
		System.out.println();
	}
	//Sobrecarga do método obterAgendamento
	public void obterAgendamento() {
		for (int i = 0; i < bd.agendamentos().size(); i++) {
		}
	}
	//Sobrecarga do método obterAgendamento
	public void obterAgendamento(int d) {
		for (int i = 0; i<bd.pacientes().size(); i++) {
			if(bd.agendamentos().get(i).getDataAtendimento() != null) {
				System.out.println("------AGENDAMENTOS DO PACIENTE "+ i +"------");
				System.out.println(bd.agendamentos().get(d));
			}
		}
		System.out.println();
	}
	public void obterProntuario() {
		String dataInicio = "2023-01-01";
		String dataFim = "2023-05-31";

		LocalDate inicio = LocalDate.parse(dataInicio);
		LocalDate fim = LocalDate.parse(dataFim);

		System.out.println("----- PRONTUARIOS DO PACIENTE 1 NOS 5 PRIMEIROS MESES -----");


		for (int i = 0; i < bd.pacientes().size(); i++) {
			if(bd.prontuarios().get(i).getDataDoCadastro().isAfter(inicio) && bd.prontuarios().get(i).getDataDoCadastro().isBefore(fim)) {
				for (int j = 0; j < bd.pacientes().size(); j++) {
					System.out.println(bd.prontuarios().get(i).getDataDoCadastro() + " " + bd.prontuarios().get(i));
				}
			}

		}
		System.out.println();
	}
	public void obterAgendamentosProfissional() {
		System.out.println("------AGENDAMENTOS DO PROFISSIONAL 0 ------");
		for (int i = 0; i < bd.agendamentos().size(); i++) {
			if(bd.agendamentos().get(i).getProfissional().getId() == 0) {
				System.out.println(bd.agendamentos().get(i));
			}
		}
		System.out.println();
	}
	public void obterProntuariosProfissional() {
		System.out.println("------PRONTUARIOS DO PROFISSIONAL 1 ------");
		for (int i = 0; i < bd.prontuarios().size(); i++) {
			if(bd.prontuarios().get(i).getProfissional().getId() == 1) {
				System.out.println(bd.prontuarios().get(i));
			}
		}
		System.out.println();
	}
	public void obterExamesPaciente() {
		System.out.println("------EXAMES DO PACIENTE 0 ------");
		for (int i = 0; i < bd.prontuarios().size(); i++) {
			if(bd.prontuarios().get(i).getPaciente().getId() == 0) {
				System.out.println(bd.prontuarios().get(i).getDataDoCadastro() + " " + bd.prontuarios().get(i).getObservacoes());
			}
			
		}
		System.out.println();
	}
	public void obterQtdAtendimentos() {
		System.out.println("------ QUANTIDADE DE ATENDIMENTOS PROFISSIONAL ------");
			System.out.println(bd.prontuarios().size());
		
	}
	public void obterQtdAgendamentos() {
		System.out.println("------ QUANTIDADE DE AGENDAMENTOS POR PACIENTE ------");
		int x1 = 0;
		int x2 = 0;
		
		for (int i = 0; i < bd.agendamentos().size(); i++) {
			if(bd.agendamentos().get(i).getPaciente().getId() == 0 && bd.agendamentos().get(i).getPaciente() != null ) {
				x1++;
			}
		}
		for (int i = 0; i < bd.agendamentos().size(); i++) {
			if(bd.agendamentos().get(i).getPaciente().getId() == 1 && bd.agendamentos().get(i).getPaciente() != null ) {
				x2++;
			}
		}
		System.out.println("Paciente 0: " + x1 + "\nPaciente 1: "+ x2);
		
	}

}
