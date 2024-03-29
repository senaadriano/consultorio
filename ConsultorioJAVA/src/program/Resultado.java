package program;

import entities.impressao.Impressao;

public class Resultado {

	public static void main(String[] args) {

		Impressao imp = new Impressao();
		
		imp.obterPacientes();
		imp.obterProfissionais();
		imp.obterExames();
		imp.obterAgendamento(1);
		imp.obterProntuario();
		imp.obterAgendamentosProfissional();
		imp.obterProntuariosProfissional();
		imp.obterExamesPaciente();
		imp.obterQtdAtendimentos();
		imp.obterQtdAgendamentos();
	}
}
