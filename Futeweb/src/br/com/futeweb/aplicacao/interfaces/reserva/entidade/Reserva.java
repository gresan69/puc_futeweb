//package br.com.futeweb.aplicacao.interfaces.reserva.entidade;
//
//import br.com.futeweb.aplicacao.interfaces.master.entidade.Disponibilidade;
//import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.PessoaFisica;
//
//public class Reserva extends FuteWebVO {
//
//	private static final long serialVersionUID = 1L;
//	
//	private Disponibilidade disponibilidadeQuadra;
//	private Disponibilidade disponibilidadeMaterial;
//	private PessoaFisica pessoaFisica;
//	
//	public Reserva(Disponibilidade disponibilidadeQuadra, Disponibilidade disponibilidadeMaterial,
//			PessoaFisica pessoaFisica) {
//		super();
//		this.disponibilidadeQuadra = disponibilidadeQuadra;
//		this.disponibilidadeMaterial = disponibilidadeMaterial;
//		this.pessoaFisica = pessoaFisica;
//	}
//	
//	@Override
//	public String toString() {
//		return "Reserva [disponibilidadeQuadra=" + disponibilidadeQuadra + ", disponibilidadeMaterial="
//				+ disponibilidadeMaterial + ", pessoaFisica=" + pessoaFisica + "]";
//	}
//
//	public Disponibilidade getDisponibilidadeQuadra() {
//		return disponibilidadeQuadra;
//	}
//	public void setDisponibilidadeQuadra(Disponibilidade disponibilidadeQuadra) {
//		this.disponibilidadeQuadra = disponibilidadeQuadra;
//	}
//	public Disponibilidade getDisponibilidadeMaterial() {
//		return disponibilidadeMaterial;
//	}
//	public void setDisponibilidadeMaterial(Disponibilidade disponibilidadeMaterial) {
//		this.disponibilidadeMaterial = disponibilidadeMaterial;
//	}
//	public PessoaFisica getPessoaFisica() {
//		return pessoaFisica;
//	}
//	public void setPessoaFisica(PessoaFisica pessoaFisica) {
//		this.pessoaFisica = pessoaFisica;
//	}
//}
