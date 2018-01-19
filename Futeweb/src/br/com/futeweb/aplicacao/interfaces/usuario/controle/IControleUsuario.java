//package br.com.futeweb.aplicacao.interfaces.usuario.controle;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import br.com.futeweb.aplicacao.dao.IGenericoDAO;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.PessoaFisica;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.PessoaJuridica;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.Usuario;
//
//public interface IControleUsuario extends IGenericoDAO<Usuario> {
//	
//	public int inserir(int idAlterador, PessoaFisica object) throws SQLException;
//	public List<PessoaFisica> obterPessoaFisica();
//	public List<PessoaFisica> obterPorCriterio(PessoaFisica object) throws SQLException;
//	public int atualizar(int idAlterador, PessoaFisica object) throws SQLException;
//	
//	public int inserir(int idAlterador, PessoaJuridica object) throws SQLException;
//	public List<PessoaJuridica> obterPessoaJuridica();
//	public List<PessoaJuridica> obterPorCriterio(PessoaJuridica object) throws SQLException;
//	public int atualizar(int idAlterador, PessoaJuridica object) throws SQLException;
//	
//}
