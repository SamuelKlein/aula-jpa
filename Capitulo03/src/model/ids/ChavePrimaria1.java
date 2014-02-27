package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/*
 Estratégia:
 IDENTITY: deixa para o banco
 SEQUENCE: cria uma sequência
 TABLE: usa uma tabela auxiliar
 AUTO: o banco de dados determina se é identity, sequence ou table

 */
@Entity
@Table(name = "CHAVES1")
public class ChavePrimaria1 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "chave_generator1",
							      table="GENERATOR_TABLE_CHAVES1 ", 
							      pkColumnName="KEY",
							      valueColumnName="VALUE",
							      pkColumnValue="ID_CHAVE1",
							      allocationSize=10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "chave_generator1")
	@Column(name = "ID_CHAVE1")
	private int codigo;
	
	private String nome;
	public ChavePrimaria1() {
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
