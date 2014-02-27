package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "RESERVAS")
public class Reserva {

	@ManyToMany (cascade=CascadeType.PERSIST)
	@JoinTable(name = "RESERVA_CLIENTE", 
						joinColumns = { @JoinColumn(name = "RESERVA_ID") }, 
						inverseJoinColumns = { @JoinColumn(name = "CLIENTE_ID") })
	private Set<Cliente> clientes = new HashSet<Cliente>();

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "RESERVA_ID")
	private int id;
	@Temporal(TemporalType.DATE)
	private Date dataReserva;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(Set<Cliente> clientes, Date dataReserva) {
		super();
		this.clientes = clientes;
		this.dataReserva = dataReserva;
	}
	
	public Reserva(Date dataReserva) {
		super();
		this.dataReserva = dataReserva;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public int getId() {
		return id;
	}
	
	
}
