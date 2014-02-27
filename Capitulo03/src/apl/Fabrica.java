package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ids.*;
import model.tab.Endereco;
import model.tab.TipoEndereco;

public class Fabrica {
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		FabricaUm();
		FabricaDois();
		}

	private static void FabricaUm() {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();

			ChavePrimaria1 c = new ChavePrimaria1();

			c.setNome("Chave Mestra 23");
	
			em.getTransaction().begin();

			em.persist(c);
			em.getTransaction().commit();

			em.close();

			System.out.println("Fabrica Funcionou ; )");

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
	}
	private static void FabricaDois() {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();

			Endereco end = new Endereco(10,"Frei Clemente","São José",TipoEndereco.RESIDENCIAL);

			em.getTransaction().begin();

			em.persist(end);
			em.getTransaction().commit();

			em.close();

			System.out.println("Fabrica Funcionou ; )");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}