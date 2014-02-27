package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Endereco;
import model.Instrutor;

public class Fabrica {
	private static EntityManagerFactory factory;

	public static void main(String[] args) {

		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();

			Endereco endereco = new Endereco("Frei Clemente", 6, "Partenon",
					"Porto Alegre", "RS");
			Instrutor instrutor = new Instrutor("Cassio", "cassiowt@gmail.com",
					"5199677239", endereco);
			
			em.getTransaction().begin();
			em.persist(instrutor);
	 		em.getTransaction().commit();
	
			em.close();

			System.out.println("ok  !!!!!!!!!!!! ; )");


		} catch (RuntimeException e) {
			System.out.println("TRACE____________________________:");
			e.printStackTrace();
		}

	}

}
