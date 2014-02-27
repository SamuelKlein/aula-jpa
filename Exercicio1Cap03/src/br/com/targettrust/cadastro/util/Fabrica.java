package br.com.targettrust.cadastro.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
			em.close();
			System.out.println("Fabrica Funcionou ; )");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}