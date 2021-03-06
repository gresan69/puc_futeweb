package br.com.futeweb.aplicacao.interfaces.endereco.controle;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.xml.rpc.ServiceException;

import br.com.futeweb.aplicacao.interfaces.endereco.dao.EnderecoDAO;
import br.com.futeweb.aplicacao.interfaces.endereco.entidade.Endereco;
import br.com.futeweb.aplicacao.utils.Logger;
import br.com.futeweb.aplicacao.utils.Mensagens;

@Stateless
public class ControleEndereco implements IControleEndereco {

	private static final long serialVersionUID = 1L;
	private EnderecoDAO dao;
	
	private EnderecoDAO getInstance(){
		if (dao==null){
			dao = new EnderecoDAO();
		}
		return dao;
	}
	
	@Override
	public int inserir(Endereco object) throws SQLException {
		int retorno = 0;
		if (object.validarObjeto(object)){
			retorno = getInstance().inserir(object);
			if (retorno!=0){
				new Logger(true, FacesMessage.SEVERITY_INFO, Mensagens.OK_ENDERECO_INSERIR, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
			}else{
				new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_ENDERECO_INSERIR_0, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
			}
		}else{
			new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_PREENCHIMENTO, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
		}
		return retorno;
	}

	@Override
	public List<Endereco> obterTodos() {
		List<Endereco> lista = getInstance().obterTodos();
		if (lista==null || lista.size()==0){
			new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_ENDERECO_CONSULTAR, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
		}
		return lista;
	}

	@Override
	public List<Endereco> obterPorCriterio(Endereco object) throws SQLException {
		List<Endereco> lista = getInstance().obterPorCriterio(object);
		if (lista==null || lista.size()==0){
			new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_ENDERECO_CONSULTAR, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
		}
		return lista;
	}
	
	@Override
	public int atualizar(Endereco object) throws SQLException {
		int retorno = 0;
		if (object.validarObjeto(object)){
			retorno = getInstance().atualizar(object);
			if (retorno!=0){
				new Logger(true, FacesMessage.SEVERITY_INFO, Mensagens.OK_ENDERECO_ATUALIZAR, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
			}else{
				new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_ENDERECO_ATUALIZAR_0, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
			}
		}else{
			new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_PREENCHIMENTO, Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
		}
		return retorno;
	}
	
	@Override
	public void buscarCep(Endereco endereco) throws ServiceException, RemoteException{
		getInstance().buscarCep(endereco);
	}
	
}
