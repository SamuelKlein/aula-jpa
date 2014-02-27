package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Endereco
 *
 */

@Entity
public class Endereco implements Serializable {
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Codigo;
	private String rua;
	private int Numero;
	private String bairro;
	private String cidade;
	private String estado;
	private static final long serialVersionUID = 1L;

	public Endereco() {
		super();
	}   
	
	public Endereco(String rua, int numero, String bairro, String cidade,
			String estado) {
		super();
		this.rua = rua;
		Numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}   
	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}   
	public int getNumero() {
		return this.Numero;
	}

	public void setNumero(int Numero) {
		this.Numero = Numero;
	}   
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}   
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}   
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
   
}
