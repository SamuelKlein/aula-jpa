package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 Estratégia:
 IDENTITY: deixa para o banco
 SEQUENCE: cria uma sequência
 TABLE: usa uma tabela auxiliar
 AUTO: o banco de dados determina se é identity, sequence ou table

 */
@Entity
@Table(name = "CHAVES")
public class ChavePrimaria  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(sequenceName = "CHAVES_SEQ", name = "chave_generator", initialValue=150 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chave_generator" )
	@Column(name = "ID_CHAVE")
	private int codigo;
	
	private String nome;
	public ChavePrimaria() {
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
