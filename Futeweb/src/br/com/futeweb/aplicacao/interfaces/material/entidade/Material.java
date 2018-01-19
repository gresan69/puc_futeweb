//package br.com.futeweb.aplicacao.interfaces.material.entidade;
//
//import java.util.List;
//
//import br.com.futeweb.aplicacao.interfaces.estabelecimento.entidade.Estabelecimento;
//import br.com.futeweb.aplicacao.interfaces.master.entidade.Disponibilidade;
//import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;
//
//public class Material extends FuteWebVO {
//
//	private static final long serialVersionUID = 1L;
//	
//	private String descricao;
//	private Estabelecimento estabelecimento;
//	private List<Disponibilidade> listDisponibilidade;
//	
//	public Material(String descricao, Estabelecimento estabelecimento, List<Disponibilidade> listDisponibilidade) {
//		super();
//		this.descricao = descricao;
//		this.estabelecimento = estabelecimento;
//		this.listDisponibilidade = listDisponibilidade;
//	}
//	
//	@Override
//	public String toString() {
//		return "Material [descricao=" + descricao + ", estabelecimento=" + estabelecimento + ", listDisponibilidade="
//				+ listDisponibilidade + "]";
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//	public Estabelecimento getEstabelecimento() {
//		return estabelecimento;
//	}
//	public void setEstabelecimento(Estabelecimento estabelecimento) {
//		this.estabelecimento = estabelecimento;
//	}
//	public List<Disponibilidade> getListDisponibilidade() {
//		return listDisponibilidade;
//	}
//	public void setListDisponibilidade(List<Disponibilidade> listDisponibilidade) {
//		this.listDisponibilidade = listDisponibilidade;
//	}
//}
