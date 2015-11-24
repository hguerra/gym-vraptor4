package br.com.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.AlunoDao;
import br.com.model.bean.Aluno;
import br.com.model.bean.Atividade;
import br.com.model.bean.Conta;
import br.com.model.bean.Evento;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Treino;

@Controller
public class AcademiaController {
	@Inject
	private Result result;
	@Inject
	private Validator validator;
	@Inject
	private AlunoDao dao;

	public void cadastrarAluno(Aluno aluno) {

	}

	// id aluno, treino
	public void cadastrarTreino(long id, Treino treino) {
		// Aluno aluno = dao.search(id);

	}

	public void removerAluno(long id) {

	}

	public void removerTreino(long id) {

	}

	public void editarTreino(Treino treino) {

	}

	// nessa jsp colocar o cadastrar treino, remover
	public Aluno buscarAluno(Aluno aluno) {
		return null;
	}

	// chamar evento de emails aqui
	public List<Aluno> buscarTodosAlunos() {
		return null;
	}

	public List<Aluno> buscarTodosDevedores() {
		return null;
	}

	public void cadastrarConta(Conta conta) {

	}

	public void cadastrarEventos(Evento evento) {

	}

	public void cadastrarAtividade(Atividade atividade) {

	}

	public void cadastrarLembrete(Lembrete lembrete) {

	}
}
