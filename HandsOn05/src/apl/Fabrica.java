package apl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.*;

public class Fabrica {
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		gravaAluno();
		// excluiCliente();
		// excluiTelefone();

	}
	private static void gravaAluno() {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
/*
			Curso c = new Curso("JPA");
			Aluno a = new Aluno("Fagner");
			InteresseCurso ic = new InteresseCurso(c, new Date(), new Date(),Periodo.MANHA,a);
			//a.getInteresses().add(ic);
		
			//a.getInteresses().add(new InteresseCurso(c, new Date(), new Date(),	Periodo.NOITE));

			em.getTransaction().begin();

			em.persist(ic);
			em.getTransaction().commit();
	*/		em.close();

			System.out.println("OK)");

		} catch (Exception e) {
						System.out.println(e.getMessage());
		}

	}
/*	private static void excluiCliente() {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();

			em.getTransaction().begin();

			Sala s = em.find(Sala.class, 1);
			System.out
					.println("Sala a ser Removida_____________________________________________________");
			System.out.println("Codigo: " + s.getCodigo() + " Nome: "
					+ s.getNome());

			em.remove(s);

			em.getTransaction().commit();
			em.close();

			// remove da coleção de telefones em Cliente

			// cliente.getTelefones().remove(fone);
		} catch (RuntimeException e) {
			System.out.println("TRACE____________________________:");
			e.printStackTrace();
		}

	}

	private static void excluiTelefone() {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();

			em.getTransaction().begin();

			Turma t = em.find(Turma.class, 2);
			System.out.println("Tuma a ser Removide é:");
			System.out.println(t.getNome());

			em.remove(t);

			em.getTransaction().commit();
			em.close();

			// remove da coleção de telefones em Cliente

			// cliente.getTelefones().remove(fone);
		} catch (RuntimeException e) {
			System.out.println("TRACE____________________________:");
			e.printStackTrace();
		}

	}
*/


}
