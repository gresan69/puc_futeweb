package br.com.futeweb.aplicacao.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

@SuppressWarnings("hiding")
public interface IGenericoDAO<Object> extends Serializable {
	
	public int inserir(int idAlterador, Object object) throws SQLException;
	public List<Object> obterTodos();
	public List<Object> obterPorCriterio(Object object) throws SQLException;
	public int atualizar(int idAlterador, Object object) throws SQLException;
}
