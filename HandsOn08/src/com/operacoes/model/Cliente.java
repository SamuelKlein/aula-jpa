package com.operacoes.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "CLIENTES")

public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLIENTE_ID")
	private int id;

	@Column(name = "NOME_CLIENTE")
	private String nome;

	@OneToMany(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "CLIENTE_ID")
	private Collection<Telefone> telefones = new ArrayList<Telefone>();

	@OneToMany (cascade = {CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	

}
