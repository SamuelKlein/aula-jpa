package model;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Instrutor
 *
 */
@Entity
public class Instrutor implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matricula;
	private String nome;
	private String email;
	private String telefone;
	
	@JoinColumn(name="endereco", referencedColumnName="codigo" )
	@OneToOne(cascade=(CascadeType.PERSIST))
	private Endereco endereco;
	
	private static final long serialVersionUID = 1L;

	public Instrutor() {
		super();
	}   
	
	
	public Instrutor(String nome, String email, String telefone,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public int getMatricul() {
		return this.matricula;
	}

	public void setMatricul(int matricula) {
		this.matricula = matricula;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
   
}
