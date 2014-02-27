package com.target.al;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.target.model.Aluno;
import com.target.model.Pessoa;

public class Factor {
	
	public static void main(String[] args) {
		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("jpa");
		
		EntityManager entity = em.createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setRg("OLA");
		Pessoa p = new Pessoa();
		p.setRg("1111");
		p.setName("OIIEIEIEIEE");
		
		entity.getTransaction().begin();
		entity.persist(aluno);
		entity.persist(p);
		entity.getTransaction().commit();
		
		em.close();
		
	}
	
}
