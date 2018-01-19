package br.com.futeweb.aplicacao.interfaces.master.entidade;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import br.com.futeweb.aplicacao.utils.AplicacaoUtils;

public class FuteWebVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private Date dataRegistro;
	private int idAlterador;
	private Date dataAlteracao;
	
	public FuteWebVO(int id, Date dataRegistro, int idAlterador, Date dataAlteracao) {
		super();
		this.id = id;
		this.dataRegistro = dataRegistro;
		this.idAlterador = idAlterador;
		this.dataAlteracao = dataAlteracao;
	}
	
	public FuteWebVO(String id, String dataRegistro, String idAlterador, String dataAlteracao) throws NumberFormatException, ParseException {
		new FuteWebVO(Integer.parseInt(id), AplicacaoUtils.sdf.parse(dataRegistro), Integer.parseInt(idAlterador), AplicacaoUtils.sdf.parse(dataAlteracao));
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public int getIdAlterador() {
		return idAlterador;
	}
	public void setIdAlterador(int idAlterador) {
		this.idAlterador = idAlterador;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	
	
}
