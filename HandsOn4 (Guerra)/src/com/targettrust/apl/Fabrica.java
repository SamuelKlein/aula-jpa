package com.targettrust.apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.targettrust.model.Sala;
import com.targettrust.model.Turma;

public class Fabrica {

	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		try {
			factory = Persistence.createEntityManagerFactory("HandsOn4");
			EntityManager em = factory.createEntityManager();
			System.out.println("Fabricado com Sucesso ; )");
			
			Sala sala = new Sala("sala 1");
			Turma turma1 = new Turma("turma 1", 8, sala);
			Turma turma2 = new Turma("turma 2", 10, sala);
			
			em.getTransaction().begin();
			em.persist(sala);
			em.persist(turma1);
			em.persist(turma2);
			em.getTransaction().commit();
			
			em.close();
		} catch (RuntimeException e) {
			System.out.println("TRACE____________________________:");
			e.printStackTrace();
		}
	}
}