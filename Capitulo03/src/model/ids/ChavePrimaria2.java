package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 Estratégia:
 IDENTITY: deixa para o banco
 SEQUENCE: cria uma sequência
 TABLE: usa uma tabela auxiliar
 AUTO: o banco de dados determina se é identity, sequence ou table

 */
@Entity
@Table(name = "CHAVES2")
public class ChavePrimaria2 implements Serializable{
	
	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CHAVE2")
	private int codigo;
	
	private String nome;
	public ChavePrimaria2() {
	}
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
