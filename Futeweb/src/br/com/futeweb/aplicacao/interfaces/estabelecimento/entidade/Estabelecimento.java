//package br.com.futeweb.aplicacao.interfaces.estabelecimento.entidade;
//
//import java.util.List;
//
//import br.com.futeweb.aplicacao.interfaces.endereco.entidade.Endereco;
//import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;
//import br.com.futeweb.aplicacao.interfaces.material.entidade.Material;
//import br.com.futeweb.aplicacao.interfaces.quadra.entidade.Quadra;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.PessoaJuridica;
//
//public class Estabelecimento extends FuteWebVO {
//
//	private static final long serialVersionUID = 1L;
//	
//	private String nome;
//	private String descricao;
//	private Endereco endereco;
//	private List<PessoaJuridica> listPessoaJuridica;
//	private List<Quadra> listQuadra;
//	private List<Material> listMaterial;
//	
//	public Estabelecimento(String nome, String descricao, Endereco endereco, List<PessoaJuridica> listPessoaJuridica,
//			List<Quadra> listQuadra, List<Material> listMaterial) {
//		super();
//		this.nome = nome;
//		this.descricao = descricao;
//		this.endereco = endereco;
//		this.listPessoaJuridica = listPessoaJuridica;
//		this.listQuadra = listQuadra;
//		this.listMaterial = listMaterial;
//	}
//	
//	@Override
//	public String toString() {
//		return "Estabelecimento [nome=" + nome + ", descricao=" + descricao + ", endereco=" + endereco
//				+ ", listPessoaJuridica=" + listPessoaJuridica + ", listQuadra=" + listQuadra + ", listMaterial="
//				+ listMaterial + "]";
//	}
//
//
//
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getDescricao() {
//		return descricao;
//	}
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//	public Endereco getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//	public List<PessoaJuridica> getListPessoaJuridica() {
//		return listPessoaJuridica;
//	}
//	public void setListPessoaJuridica(List<PessoaJuridica> listPessoaJuridica) {
//		this.listPessoaJuridica = listPessoaJuridica;
//	}
//	public List<Quadra> getListQuadra() {
//		return listQuadra;
//	}
//	public void setListQuadra(List<Quadra> listQuadra) {
//		this.listQuadra = listQuadra;
//	}
//	public List<Material> getListMaterial() {
//		return listMaterial;
//	}
//	public void setListMaterial(List<Material> listMaterial) {
//		this.listMaterial = listMaterial;
//	}
//}
