package br.com.futeweb.aplicacao.admin.bean.entidade;

import java.io.Serializable;

import br.com.futeweb.aplicacao.interfaces.endereco.entidade.Endereco;
import br.com.futeweb.aplicacao.interfaces.usuario.entidade.Usuario;

public class AdminVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected Endereco endereco;
	protected Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

	
}
