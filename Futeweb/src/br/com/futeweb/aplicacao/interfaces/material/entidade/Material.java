package br.com.futeweb.aplicacao.interfaces.material.entidade;

import java.io.Serializable;
import java.util.List;

import br.com.futeweb.aplicacao.interfaces.estabelecimento.entidade.Estabelecimento;
import br.com.futeweb.aplicacao.interfaces.master.entidade.Disponibilidade;

public class Material implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private Estabelecimento estabelecimento;
	private List<Disponibilidade> listDisponibilidade;
	
	public Material(int id, String nome, Estabelecimento estabelecimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.estabelecimento = estabelecimento;
	}
	
	public boolean validarObjeto(Material obj){
		return (obj!=null
				&& obj.getNome()!=null && !"".equals(obj.getNome())
				&& obj.getEstabelecimento()!=null
				) ? true : false;
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
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public List<Disponibilidade> getListDisponibilidade() {
		return listDisponibilidade;
	}
	public void setListDisponibilidade(List<Disponibilidade> listDisponibilidade) {
		this.listDisponibilidade = listDisponibilidade;
	}
	
	
	
}
