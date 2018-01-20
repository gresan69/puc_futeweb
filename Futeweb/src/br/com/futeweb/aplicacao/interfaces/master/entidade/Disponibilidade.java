package br.com.futeweb.aplicacao.interfaces.master.entidade;

import java.io.Serializable;
import java.util.Date;

public class Disponibilidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date dataInicio;
	private Date dataFim;
	
	public Disponibilidade(Date dataInicio, Date dataFim) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
}
