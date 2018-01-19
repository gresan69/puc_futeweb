//package br.com.futeweb.aplicacao.interfaces.usuario.entidade;
//
//import java.util.Date;
//import java.util.List;
//
//import br.com.futeweb.aplicacao.interfaces.endereco.entidade.Endereco;
//import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;
//import br.com.futeweb.aplicacao.interfaces.reserva.entidade.Reserva;
//
//public class PessoaFisica extends FuteWebVO {
//
//	private static final long serialVersionUID = 1L;
//
//	private String nome;
//	private String email;
//	private Usuario usuario;
//	private String cpf;
//	private Date dataNascimento;
//	private Endereco endereco;
//	private List<Reserva> listReserva;
//	
//	public PessoaFisica(int id, Date dataRegistro, int idAlterador, Date dataAlteracao, String nome, String email,
//			Usuario usuario, String cpf, Date dataNascimento, Endereco endereco, List<Reserva> listReserva) {
//		super(id, dataRegistro, idAlterador, dataAlteracao);
//		this.nome = nome;
//		this.email = email;
//		this.usuario = usuario;
//		this.cpf = cpf;
//		this.dataNascimento = dataNascimento;
//		this.endereco = endereco;
//		this.listReserva = listReserva;
//	}
//	
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public Usuario getUsuario() {
//		return usuario;
//	}
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}
//	public String getCpf() {
//		return cpf;
//	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
//	public Date getDataNascimento() {
//		return dataNascimento;
//	}
//	public void setDataNascimento(Date dataNascimento) {
//		this.dataNascimento = dataNascimento;
//	}
//	public Endereco getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//	public List<Reserva> getListReserva() {
//		return listReserva;
//	}
//	public void setListReserva(List<Reserva> listReserva) {
//		this.listReserva = listReserva;
//	}
//	
//}
