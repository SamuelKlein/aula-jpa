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
	 * Define uma estratégia para atribuir um valor exclusivo para seus campos
	 * de id automaticamente. Os tipos de estratégias disponíveis são IDENTITY,
	 * SEQUENCE, TABLE, and AUTO. A estratégia padrão é AUTO, cuja aplicação é
	 * deixada ao fornecedor do JPA para implementar.
	 */
	/*
	 * @Version: Define um campo de versão em uma entidade. JPA utiliza um campo
	 * versão para detectar modificações simultâneas para um dados armazenam o
	 * registro. Quando o tempo de execução do JPA detecta múltiplas tentativas
	 * de modificar simultaneamente o mesmo registro, ele lança uma exceção ao
	 * tentar confirmar a última transação. Isso evita que você Sobrescrever a
	 * confirmação anterior com dados desatualizados.
	 */
	private int codigo;

	@Column(name = "CPF", nullable = false)
	private long cpf;

	@Column(name = "PRIMEIRO_NOME", nullable = false, length = 50)
	private String primeiroNome;

	@Column(name = "ULTIMO_NOME", length = 50)
	private String ultimoNome;

	// Quando não definimos @Column é o próprio atributo o nome
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
