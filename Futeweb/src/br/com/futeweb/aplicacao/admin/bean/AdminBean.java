package br.com.futeweb.aplicacao.admin.bean;

import java.io.Serializable;
import java.sql.SQLException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.futeweb.aplicacao.admin.FacadeAdmin;
import br.com.futeweb.aplicacao.admin.bean.entidade.AdminVO;
import br.com.futeweb.aplicacao.utils.Logger;
import br.com.futeweb.aplicacao.utils.Mensagens;

@Stateless
@SessionScoped
@ManagedBean
public class AdminBean extends AdminVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB(beanName="FacadeAdmin")
	private FacadeAdmin facadeAdmin;
	
	public void inserirEndereco(){
		try {
			facadeAdmin.getControleEndereco().inserir(endereco);
		} catch (SQLException e) {
			new Logger(true, FacesMessage.SEVERITY_ERROR, Mensagens.ERRO_ENDERECO_INSERIR.replace(Mensagens.PARAMETRO_EXCEPTION, e.getMessage()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
		}
	}
	
	

	
	
	
	
}
