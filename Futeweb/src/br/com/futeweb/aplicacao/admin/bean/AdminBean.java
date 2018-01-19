package br.com.futeweb.aplicacao.admin.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.futeweb.aplicacao.admin.FacadeAdmin;

@Stateless
@SessionScoped
@ManagedBean
public class AdminBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB(beanName="FacadeAdmin")
	private FacadeAdmin facadeAdmin;
	
	public void teste(){
		
//		Acesso acesso = new Acesso("G0036216", "Jose Henrique Dias de Lima");
//		facadeAdmin.getControleAcesso().inserir(acesso);
//		facadeAdmin.getControleAcesso().qualquercoisa();
	}
}
