package br.com.futeweb.aplicacao.interfaces.usuario.entidade;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String login;
	private String senha;
	private boolean ativo;
	
	public Usuario(int id, String login, String senha, boolean ativo) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
