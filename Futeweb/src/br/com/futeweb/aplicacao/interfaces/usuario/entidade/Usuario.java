package br.com.futeweb.aplicacao.interfaces.usuario.entidade;

import java.util.Date;

import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;

public class Usuario extends FuteWebVO {

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String senha;
	private boolean ativo;
	
	public Usuario(int id, Date dataRegistro, int idAlterador, Date dataAlteracao, String login, String senha, boolean ativo) {
		super(id, dataRegistro, idAlterador, dataAlteracao);
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	

}
