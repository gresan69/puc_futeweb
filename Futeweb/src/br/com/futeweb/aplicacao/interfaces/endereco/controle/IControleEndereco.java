package br.com.futeweb.aplicacao.interfaces.endereco.controle;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.futeweb.aplicacao.dao.generico.IGenericoDAO;
import br.com.futeweb.aplicacao.interfaces.endereco.entidade.Endereco;

public interface IControleEndereco extends IGenericoDAO<Endereco>  {

	public void buscarCep(Endereco endereco) throws ServiceException, RemoteException ;
	
}
