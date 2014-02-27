package br.com.targettrust.cadastro.apl;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.targettrust.cadastro.entidades.Usuario;
import br.com.targettrust.cadastro.entidades.dominio.EstadoCivil;

public class Factory {
	
	private static EntityManagerFactory factory;
	
	public static void main(String[] args) {
		EntityManager entity = getEntityManager();
		
		Usuario u = new Usuario();
		u.setCpf("11111111");
		u.setDataNascimento(Calendar.getInstance());
		u.setEstadoCivil(EstadoCivil.SOLTEIRO);
		u.setRg("2q3412344123423");
		u.setNome("dfsglkasdkjflkasdjflasfd");
		
		entity.getTransaction().begin();

		entity.persist(u);
		
		entity.getTransaction().commit();

		entity.close();
		
		System.out.println( entity);
	}
	
	public static EntityManager getEntityManager(){
		EntityManagerFactory factory = getFactory();
		return factory.createEntityManager();
	}
	
	public static EntityManagerFactory getFactory() {
		if(factory == null){
			factory = Persistence.createEntityManagerFactory("jpa");
		}
		return factory;
	}
}
