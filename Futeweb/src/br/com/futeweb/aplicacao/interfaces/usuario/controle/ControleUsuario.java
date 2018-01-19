//package br.com.futeweb.aplicacao.interfaces.usuario.controle;
//
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ejb.Stateless;
//
//import br.com.futeweb.aplicacao.dao.GenericoDAO;
//import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.PessoaFisica;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.PessoaJuridica;
//import br.com.futeweb.aplicacao.interfaces.usuario.entidade.Usuario;
//import br.com.futeweb.aplicacao.utils.Logger;
//import br.com.futeweb.aplicacao.utils.Mensagens;
//
//@Stateless
//public class ControleUsuario extends GenericoDAO implements IControleUsuario {
//
//	private static final long serialVersionUID = 1L;
//	
//	private static final String CAMPOS = " select id, data_registro, id_alterador, data_alteracao, login, senha, ativo ";
//
//	@Override
//	public int inserir(int idAlterador, Usuario object) throws SQLException {
//		String query = " insert into Usuario (login, senha, id_alterador) values (?, ?, ?) ";
//		montarQuery(query);
//		setParametros().setString(1, object.getLogin());
//		setParametros().setString(2, object.getSenha());
//		setParametros().setInt(3, idAlterador);
//		return executarUpdate();
//	}
//
//	@Override
//	public List<Usuario> obterTodos() {
//		List<Usuario> lista = new ArrayList<Usuario>();
//		String query = CAMPOS + " from usuario ";
//		montarQuery(query);
//		String[][] retorno = executarQuery();
//		if (retorno != null){
//			for (String r[] : retorno){
//				try {
//					FuteWebVO f1 = new FuteWebVO(r[0], r[1], r[2], r[3]);
//					lista.add(new Usuario(f1.getId(), f1.getDataRegistro(), f1.getIdAlterador(), f1.getDataAlteracao(), r[4], r[5], ("1".equals(r[6])) ));
//				} catch (NumberFormatException | ParseException e) {
//					new Logger(true, null, Mensagens.ERRO_CRIAR_OBJETO.replace(Mensagens.PARAMETRO_EXCEPTION, e.toString()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
//				}
//			}
//		}
//		return lista;
//	}
//
//	@Override
//	public List<Usuario> obterPorCriterio(Usuario object) throws SQLException{
//		List<Usuario> lista = new ArrayList<Usuario>();
//		String query = CAMPOS + " from usuario where id = ? or login = ? ";
//		montarQuery(query);
//		setParametros().setInt(1, object.getId());
//		setParametros().setString(2, object.getLogin());
//		String[][] retorno = executarQuery();
//		if (retorno != null){
//			for (String r[] : retorno){
//				try {
//					FuteWebVO f1 = new FuteWebVO(r[0], r[1], r[2], r[3]);
//					lista.add(new Usuario(f1.getId(), f1.getDataRegistro(), f1.getIdAlterador(), f1.getDataAlteracao(), r[4], r[5], ("1".equals(r[6])) ));
//				} catch (NumberFormatException | ParseException e) {
//					new Logger(true, null, Mensagens.ERRO_CRIAR_OBJETO.replace(Mensagens.PARAMETRO_EXCEPTION, e.toString()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
//				}
//			}
//		}
//		return lista;
//	}
//
//	@Override
//	public int atualizar(int idAlterador, Usuario object) throws SQLException {
//		String query = " update usuario set senha = ?, ativo = ?, id_alterador = ?, data_alteracao = now() where id = ? ";
//		montarQuery(query);
//		setParametros().setString(1, object.getSenha());
//		setParametros().setInt(2, (object.isAtivo() ? 1 : 0));
//		setParametros().setInt(3, idAlterador);
//		setParametros().setInt(4, object.getId());
//		return executarUpdate();
//	}
//
//	@Override
//	public int inserir(int idAlterador, PessoaFisica object) {
//		return 0;
//	}
//
//	@Override
//	public List<PessoaFisica> obterPessoaFisica() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<PessoaFisica> obterPorCriterio(PessoaFisica object) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int atualizar(int idAlterador, PessoaFisica object) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int inserir(int idAlterador, PessoaJuridica object) throws SQLException {
//		String query = " insert into pessoa_juridica (usuario_id, cnpj, nome, email, id_alterador) values (?, ?, ?, ?, ?) ";
//		montarQuery(query);
//		setParametros().setInt(1, object.getUsuario().getId());
//		setParametros().setString(2, object.getCnpj());
//		setParametros().setString(3, object.getNome());
//		setParametros().setString(4, object.getEmail());
//		setParametros().setInt(5, idAlterador);
//		return executarUpdate();
//	}
//
//	@Override
//	public List<PessoaJuridica> obterPessoaJuridica() {
//		List<PessoaJuridica> lista = new ArrayList<PessoaJuridica>();
//		String query = " select "+
//				" p.id, p.data_registro, p.id_alterador, p.data_alteracao, p.nome, p.email, p.cnpj, "+
//				" u.id, u.data_registro, u.id_alterador, u.data_alteracao, u.login, u.senha, u.ativo "+
//				" from pessoa_juridica p "+
//				" inner join usuario u on (u.id = p.usuario_id) ";
//		montarQuery(query);
//		String[][] retorno = executarQuery();
//		if (retorno != null){
//			for (String r[] : retorno){
//				try {
//					FuteWebVO f1 = new FuteWebVO(r[0], r[1], r[2], r[3]);
//					FuteWebVO f2 = new FuteWebVO(r[7], r[8], r[9], r[10]);
//					lista.add(new PessoaJuridica(f1.getId(), f1.getDataRegistro(), f1.getIdAlterador(), f1.getDataAlteracao(), r[4], r[5], r[6], new Usuario(f2.getId(), f2.getDataRegistro(), f2.getIdAlterador(), f2.getDataAlteracao(), r[11], r[12], "1".equals(r[13])), null));
//				} catch (NumberFormatException | ParseException e) {
//					new Logger(true, null, Mensagens.ERRO_CRIAR_OBJETO.replace(Mensagens.PARAMETRO_EXCEPTION, e.toString()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
//				}
//			}
//		}
//		return lista;
//	}
//
//	@Override
//	public List<PessoaJuridica> obterPorCriterio(PessoaJuridica object) throws SQLException {
//		List<PessoaJuridica> lista = new ArrayList<PessoaJuridica>();
//		String query = " select "+
//				" p.id, p.data_registro, p.id_alterador, p.data_alteracao, p.nome, p.email, p.cnpj, "+
//				" u.id, u.data_registro, u.id_alterador, u.data_alteracao, u.login, u.senha, u.ativo "+
//				" from pessoa_juridica p "+
//				" inner join usuario u on (u.id = p.usuario_id) "+
//				" where p.id = ? or p.nome = ? or p.email = ? or p.cnpj = ? ";
//		montarQuery(query);
//		setParametros().setInt(1, object.getId());
//		setParametros().setString(2, object.getNome());
//		setParametros().setString(3, object.getEmail());
//		setParametros().setString(4, object.getCnpj());
//		String[][] retorno = executarQuery();
//		if (retorno != null){
//			for (String r[] : retorno){
//				try {
//					FuteWebVO f1 = new FuteWebVO(r[0], r[1], r[2], r[3]);
//					FuteWebVO f2 = new FuteWebVO(r[7], r[8], r[9], r[10]);
//					lista.add(new PessoaJuridica(f1.getId(), f1.getDataRegistro(), f1.getIdAlterador(), f1.getDataAlteracao(), r[4], r[5], r[6], new Usuario(f2.getId(), f2.getDataRegistro(), f2.getIdAlterador(), f2.getDataAlteracao(), r[11], r[12], "1".equals(r[13])), null));
//				} catch (NumberFormatException | ParseException e) {
//					new Logger(true, null, Mensagens.ERRO_CRIAR_OBJETO.replace(Mensagens.PARAMETRO_EXCEPTION, e.toString()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
//				}
//			}
//		}
//		return lista;
//	}
//
//	@Override
//	public int atualizar(int idAlterador, PessoaJuridica object) throws SQLException {
//		String query = " update pessoa_juridica set nome = ?, email = ?, cnpj = ?, id_alterador = ? data_alteracao = now() where id = ? ";
//		montarQuery(query);
//		setParametros().setString(1, object.getNome());
//		setParametros().setString(2, object.getEmail());
//		setParametros().setString(3, object.getCnpj());
//		setParametros().setInt(4, idAlterador);
//		setParametros().setInt(5, object.getId());
//		return executarUpdate();
//	}
//}
