package model.tab;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "ENDERECOS")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	private int codigo;

	private int numero;
	private String rua;
	private String bairro;

	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;

	public Endereco() {
	}

	public Endereco(int numero, String rua, String bairro, TipoEndereco tipoEndereco) {
		super();
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.tipoEndereco = tipoEndereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

}
