package model.tab;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.sun.istack.Nullable;

//@Table( name="USUARIO", uniqueConstraints=@UniqueConstraint(columnNames={"cpf"}))
@Entity
@Table(name = "CUSTOMER", uniqueConstraints = @UniqueConstraint(columnNames = { "cpf" }))
// nome da entity que corresponde a tabela no banco.
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	// Define a chave primaria
	@GeneratedValue(strategy = GenerationType.AUTO)
	/*
	 * Define uma estrat�gia para atribuir um valor exclusivo para seus campos
	 * de id automaticamente. Os tipos de estrat�gias dispon�veis s�o IDENTITY,
	 * SEQUENCE, TABLE, and AUTO. A estrat�gia padr�o � AUTO, cuja aplica��o �
	 * deixada ao fornecedor do JPA para implementar.
	 */
	/*
	 * @Version: Define um campo de vers�o em uma entidade. JPA utiliza um campo
	 * vers�o para detectar modifica��es simult�neas para um dados armazenam o
	 * registro. Quando o tempo de execu��o do JPA detecta m�ltiplas tentativas
	 * de modificar simultaneamente o mesmo registro, ele lan�a uma exce��o ao
	 * tentar confirmar a �ltima transa��o. Isso evita que voc� Sobrescrever a
	 * confirma��o anterior com dados desatualizados.
	 */
	private int codigo;

	@Column(name = "CPF", nullable = false)
	private long cpf;

	@Column(name = "PRIMEIRO_NOME", nullable = false, length = 50)
	private String primeiroNome;

	@Column(name = "ULTIMO_NOME", length = 50)
	private String ultimoNome;

	// Quando n�o definimos @Column � o pr�prio atributo o nome
	private String rua;

	@Column(name = "NUMERO", nullable = false)
	private String numero;

	private String cidade;

	@Column(name = "CEP", nullable = false)
	private String cep;

	@Column(name = "CUSTO", length = 10)
	private String custo;

	@Column(name = "DATA_ATUALIZACAO")
	@Temporal(TemporalType.DATE)
	private Date dataAtualizacao;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCusto() {
		return custo;
	}

	public void setCusto(String custo) {
		this.custo = custo;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
