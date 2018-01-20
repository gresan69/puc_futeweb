package br.com.futeweb.aplicacao.interfaces.usuario.entidade;

import java.io.Serializable;
import java.util.List;

import br.com.futeweb.aplicacao.interfaces.estabelecimento.entidade.Estabelecimento;

public class PessoaJuridica implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private String email;
	private String cnpj;
	private Usuario usuario;
	private List<Estabelecimento> listEstabelecimento;
	
	public PessoaJuridica(int id, String nome, String email, String cnpj, Usuario usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Estabelecimento> getListEstabelecimento() {
		return listEstabelecimento;
	}
	public void setListEstabelecimento(List<Estabelecimento> listEstabelecimento) {
		this.listEstabelecimento = listEstabelecimento;
	}
	
}
