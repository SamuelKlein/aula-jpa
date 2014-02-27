package br.com.target.ap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.target.model.Aluno;

public class Factory {
	public static void main(String[] args) {
		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("jpa");
		
		EntityManager et = em.createEntityManager();
		
		Aluno a = new Aluno();
		a.setId(1);
		
		et.getTransaction().begin();
		et.persist(a);
		et.getTransaction().commit();
		et.close();
		em.close();
		
	}
}
