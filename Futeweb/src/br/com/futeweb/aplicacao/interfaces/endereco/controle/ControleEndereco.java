package br.com.futeweb.aplicacao.interfaces.endereco.controle;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.com.futeweb.aplicacao.dao.GenericoDAO;
import br.com.futeweb.aplicacao.interfaces.endereco.entidade.Endereco;
import br.com.futeweb.aplicacao.interfaces.master.entidade.FuteWebVO;
import br.com.futeweb.aplicacao.utils.Logger;
import br.com.futeweb.aplicacao.utils.Mensagens;

@Stateless
public class ControleEndereco extends GenericoDAO implements IControleEndereco {

	private static final long serialVersionUID = 1L;
	
	private static final String CAMPOS = " select id, data_registro, id_alterador, data_alteracao, logradouro, numero, cidade, estado, cep ";

	@Override
	public int inserir(int idAlterador, Endereco object) throws SQLException {
		String query = " insert into endereco (logradouro, numero, cidade, estado, cep, id_alterador) values (?, ?, ?, ?, ?, ?) ";
		montarQuery(query);
		setParametros().setString(1, object.getLogradouro());
		setParametros().setInt(2, object.getNumero());
		setParametros().setString(3, object.getCidade());
		setParametros().setString(4, object.getEstado());
		setParametros().setString(5, object.getCep());
		setParametros().setInt(6, object.getIdAlterador());
		return executarUpdate();
	}

	@Override
	public List<Endereco> obterTodos() {
		List<Endereco> lista = new ArrayList<Endereco>();
		String query = CAMPOS + " from endereco ";
		montarQuery(query);
		String[][] retorno = executarQuery();
		if (retorno != null){
			for (String r[] : retorno){
				try {
					FuteWebVO f1 = new FuteWebVO(r[0], r[1], r[2], r[3]);
					lista.add(new Endereco(f1.getId(), f1.getDataRegistro(), f1.getIdAlterador(), f1.getDataAlteracao(), r[4], Integer.parseInt(r[5]), r[6], r[7], r[8]) );
				} catch (NumberFormatException | ParseException e) {
					new Logger(true, null, Mensagens.ERRO_CRIAR_OBJETO.replace(Mensagens.PARAMETRO_EXCEPTION, e.toString()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
				}
			}
		}
		return lista;
	}

	@Override
	public List<Endereco> obterPorCriterio(Endereco object) throws SQLException {
		List<Endereco> lista = new ArrayList<Endereco>();
		String query = CAMPOS + " from endereco where id = ? or logradouro = ? or cidade = ? or estado = ? or cep = ? ";
		montarQuery(query);
		setParametros().setInt(1, object.getId());
		setParametros().setString(2, object.getLogradouro());
		setParametros().setString(3, object.getCidade());
		setParametros().setString(4, object.getEstado());
		setParametros().setString(5, object.getCep());
		String[][] retorno = executarQuery();
		if (retorno != null){
			for (String r[] : retorno){
				try {
					FuteWebVO f1 = new FuteWebVO(r[0], r[1], r[2], r[3]);
					lista.add(new Endereco(f1.getId(), f1.getDataRegistro(), f1.getIdAlterador(), f1.getDataAlteracao(), r[4], Integer.parseInt(r[5]), r[6], r[7], r[8]) );
				} catch (NumberFormatException | ParseException e) {
					new Logger(true, null, Mensagens.ERRO_CRIAR_OBJETO.replace(Mensagens.PARAMETRO_EXCEPTION, e.toString()) , Mensagens.ID_CAMPO_MENSAGEM_QUALQUER);
				}
			}
		}
		return lista;
	}

//	id, data_registro, id_alterador, data_alteracao, logradouro, numero, cidade, estado, cep
	
	@Override
	public int atualizar(int idAlterador, Endereco object) throws SQLException {
		String query = " update endereco set logradouro = ?, numero = ?, ativo = ?, id_alterador = ? data_alteracao = now() where id = ? ";
		montarQuery(query);
//		setParametros().setString(1, object.getSenha());
//		setParametros().setInt(2, (object.isAtivo() ? 1 : 0));
		setParametros().setInt(3, idAlterador);
		setParametros().setInt(4, object.getId());
		return executarUpdate();
	}
}
