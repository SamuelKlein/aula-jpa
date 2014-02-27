package br.com.targettrust.cadastro.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import br.com.targettrust.cadastro.entidades.dominio.TipoCodigoPostal;

@Entity
public class CodigoPostal implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="numero_id")
	private Integer numero;
	@Enumerated(EnumType.STRING)
	private TipoCodigoPostal TIPO;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoCodigoPostal getTIPO() {
		return TIPO;
	}

	public void setTIPO(TipoCodigoPostal tIPO) {
		TIPO = tIPO;
	}

}
