package entities.basedados;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Agendamento;
import entities.Endereco;
import entities.Exames;
import entities.Paciente;
import entities.ProfissionalDeSaude;
import entities.Prontuario;
import entities.enums.Categoria;
import entities.enums.Especialidade;
import entities.enums.TipoAtendimento;
import entities.enums.TipoProfissional;

public class BaseDados {// Uso da coleção ArrayList;
	public List<Paciente> pacientes(){
		List<Paciente> pacientes = new ArrayList<>();
		Paciente paciente;
		Endereco endereco;
		
		try { // Tratamento de erros
		endereco = new Endereco();
		paciente = new Paciente();
		paciente.setId(0);
		paciente.setDataCadastro(LocalDate.of(2022, 04, 15));
		paciente.setContato("71999999");
		paciente.setNome("Paciente 1");
		paciente.setSituacao(true);
		endereco.setCep("1111111");
		endereco.setBairro("Bairro 1");
		endereco.setCidade("Cidade 1");
		endereco.setEstado("Estado 1");
		endereco.setRua("Rua 1");
		paciente.setEndereco(endereco);
		pacientes.add(paciente);

		endereco = new Endereco();
		paciente = new Paciente();
		paciente.setId(1);
		paciente.setDataCadastro(LocalDate.of(2023, 12, 02));
		paciente.setContato("71000000");
		paciente.setNome("Paciente 2");
		paciente.setSituacao(true);
		endereco.setCep("2222222");
		endereco.setBairro("Bairro 2");
		endereco.setCidade("Cidade 2");
		endereco.setEstado("Estado 2");
		endereco.setRua("Rua 2");
		paciente.setEndereco(endereco);
		pacientes.add(paciente);

		
		}catch(Exception e) {// Tratamento de erros
			System.out.println("Erro ao adicionar pacientes: " + e.getMessage());
		}


		return pacientes;
	}

	public List<ProfissionalDeSaude> profissionais(){
		List<ProfissionalDeSaude> profissionais = new ArrayList<>();	
		ProfissionalDeSaude profissional;
		try {// Tratamento de erros
		
		profissional = new ProfissionalDeSaude();
		profissional.setId(0);
		profissional.setNome("Profissional 1");
		profissional.setDataCadastro(LocalDate.of(2022, 04, 01));
		profissional.setEspecialidades(Especialidade.CARDIOLOGIA);
		profissional.setSituacao(true);
		profissional.setTipo(TipoProfissional.MEDICO);
		profissionais.add(profissional);
		
		profissional = new ProfissionalDeSaude();
		profissional.setId(1);
		profissional.setNome("Profissional 2");
		profissional.setDataCadastro(LocalDate.of(2022, 03, 01));
		profissional.setEspecialidades(Especialidade.PEDIATRIA);
		profissional.setSituacao(true);
		profissional.setTipo(TipoProfissional.FONOAUDIOLOGO);
		profissionais.add(profissional);

		
		}catch (Exception e) {
			System.out.println("Erro ao adicionar profissionais: " + e.getMessage());
		}
		
		return profissionais;
	}
	
	public List<Exames> exames(){

		List<Exames> exames = new ArrayList<>();
		Exames exame;
		
		try {
		exame = new Exames();
		exame.setId(0);
		exame.setNomeExame("Exame 1");
		exame.setCategoria(Categoria.HEMATOLOGIA);
		exame.setDataCadastro(LocalDate.of(2022, 01, 02));
		exame.setSituacao(true);
		exame.setObservacao("Coletar amostra de sangue");
		exame.setDescricao("Analise laboratorial");
		exames.add(exame);
		
		exame = new Exames();
		exame.setId(1);
		exame.setNomeExame("Exame 2");
		exame.setCategoria(Categoria.IMAGEM);
		exame.setDataCadastro(LocalDate.of(2022, 03, 02));
		exame.setSituacao(true);
		exame.setObservacao("Raio X ");
		exame.setDescricao("Radiografia");
		exames.add(exame);
		
		exame = new Exames();
		exame.setId(2);
		exame.setNomeExame("Exame 3");
		exame.setCategoria(Categoria.BIOQUIMICA);
		exame.setDataCadastro(LocalDate.of(2022, 03, 02));
		exame.setSituacao(true);
		exame.setObservacao("Coleta de amostragens");
		exame.setDescricao("Coleta material biológico");
		exames.add(exame);
		
		exame = new Exames();
		exame.setId(3);
		exame.setNomeExame("Exame 4");
		exame.setCategoria(Categoria.IMUNOLOGIA);
		exame.setDataCadastro(LocalDate.of(2022, 03, 02));
		exame.setSituacao(true);
		exame.setObservacao("Coleta de Linfócitos");
		exame.setDescricao("Coleta de célula branca do sangue");
		exames.add(exame);
		
		
		}catch(Exception e) {
			System.out.println("Erro ao adicionar exame: "+ e.getMessage());
		}
		
		
		return exames;
		
	}
	public List <Agendamento> agendamentos(){
		List <Agendamento> agendamentos = new ArrayList<>();
		Agendamento agendamento;
		
		try {
			agendamento = new Agendamento();
			agendamento.setId(0);
			agendamento.setPaciente(pacientes().get(0));
			agendamento.setProfissional(profissionais().get(0));
			agendamento.setConvenio("Particular");
			agendamento.setDataAtendimento(LocalDate.of(2023, 07, 25));
			agendamento.setEspecialidade(Especialidade.CARDIOLOGIA);
			agendamento.setLocal("Clínica 1");
			agendamento.setSituacao(true);
			agendamento.setTipoAtendimento(TipoAtendimento.CONSULTA);
			agendamentos.add(agendamento);
			
			agendamento = new Agendamento();
			agendamento.setId(1);
			agendamento.setPaciente(pacientes().get(0));
			agendamento.setProfissional(profissionais().get(0));
			agendamento.setConvenio("Convenio");
			agendamento.setDataAtendimento(LocalDate.of(2023, 07, 01));
			agendamento.setEspecialidade(Especialidade.PEDIATRIA);
			agendamento.setLocal("Clínica 1");
			agendamento.setSituacao(true);
			agendamento.setTipoAtendimento(TipoAtendimento.CONSULTA);
			agendamentos.add(agendamento);
			
			agendamento = new Agendamento();
			agendamento.setId(1);
			agendamento.setPaciente(pacientes().get(1));
			agendamento.setProfissional(profissionais().get(1));
			agendamento.setConvenio("Convenio");
			agendamento.setDataAtendimento(LocalDate.of(2023, 03, 04));
			agendamento.setEspecialidade(Especialidade.PEDIATRIA);
			agendamento.setLocal("Clínica 2");
			agendamento.setSituacao(true);
			agendamento.setTipoAtendimento(TipoAtendimento.CONSULTA);
			agendamentos.add(agendamento);
			
		}catch(Exception e) {
			System.out.println("Erro no agendamento: " + e.getMessage());
		}
		return agendamentos;
	}
	public List<Prontuario> prontuarios(){
		List <Prontuario> prontuarios = new ArrayList<>();
		Prontuario prontuario;
		
		try {
			prontuario = new Prontuario();
			prontuario.setId(0);
			prontuario.setPaciente(pacientes().get(0));
			prontuario.setDataDoCadastro(LocalDate.of(2023, 02, 04));
			prontuario.setDiagnostico("Insuficiência cardíaca congestiva");
			prontuario.setExames(exames().get(1));
			prontuario.setProfissional(profissionais().get(0));
			prontuario.setObservacoes("Sinais de congestão pulmonar");
			prontuario.setPrescricao("Restição de sódio, Diuréticos");
			prontuario.setSituacao(true);
			prontuarios.add(prontuario);
			
			prontuario = new Prontuario();
			prontuario.setId(1);
			prontuario.setPaciente(pacientes().get(0));
			prontuario.setDataDoCadastro(LocalDate.of(2023, 07, 25));
			prontuario.setDiagnostico("Insuficiência cardíaca congestiva");
			prontuario.setExames(exames().get(2));
			prontuario.setProfissional(profissionais().get(0));
			prontuario.setObservacoes("Verificar sistema imunológico");
			prontuario.setPrescricao("Soro fisiológico, multivitamínico");
			prontuario.setSituacao(true);
			prontuarios.add(prontuario);
			
			prontuario = new Prontuario();
			prontuario.setId(2);
			prontuario.setPaciente(pacientes().get(1));
			prontuario.setDataDoCadastro(LocalDate.of(2023, 03, 04));
			prontuario.setDiagnostico("Entupimento da via auditiva");
			prontuario.setExames(exames().get(1));
			prontuario.setProfissional(profissionais().get(0));
			prontuario.setObservacoes("Raio - X da via auditiva");
			prontuario.setPrescricao("Limpeza semanal via clínica");
			prontuario.setSituacao(true);
			prontuarios.add(prontuario);
			
			prontuario = new Prontuario();
			prontuario.setId(3);
			prontuario.setPaciente(pacientes().get(1));
			prontuario.setDataDoCadastro(LocalDate.of(2023, 03, 20));
			prontuario.setDiagnostico("Inflamação auditiva");
			prontuario.setExames(exames().get(3));
			prontuario.setProfissional(profissionais().get(1));
			prontuario.setObservacoes("Observar nível de inflamação");
			prontuario.setPrescricao("Antibiótico");
			prontuario.setSituacao(true);
			prontuarios.add(prontuario);
			
			
		}catch(Exception e) {
			System.out.println("Erro ao adicionar prontuario: " + e.getMessage());
		}
		return prontuarios;
	}
	
}