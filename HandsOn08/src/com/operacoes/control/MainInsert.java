package com.operacoes.control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.operacoes.model.Cliente;
import com.operacoes.model.Endereco;
import com.operacoes.model.Telefone;
import com.operacoes.model.TipoTelefone;

public class MainInsert {
	
	@PersistenceContext(unitName="hjpa")
	private EntityManager entityManager;
	
	
	public static void main(String[] args) {
		new MainInsert().rodar();
	}
	
	public void rodar() {
		
		entityManager.getTransaction().begin();
		for (int i = 34; i < 90; i++) {
			List<Telefone> listaTelefone = new ArrayList<>();
			listaTelefone.add(new Telefone(i*1,TipoTelefone.CELULAR));
			listaTelefone.add(new Telefone(i*2,TipoTelefone.CELULAR));
			listaTelefone.add(new Telefone(i*3,TipoTelefone.CELULAR));
			listaTelefone.add(new Telefone(i*4,TipoTelefone.CELULAR));
			listaTelefone.add(new Telefone(i*5,TipoTelefone.RESIDENCIAL));
			listaTelefone.add(new Telefone(i*6,TipoTelefone.COMERCIAL));
			
			List<Endereco> listaEnderenco = new ArrayList<>();
			listaEnderenco.add(new Endereco("RUA A" + i));
			listaEnderenco.add(new Endereco("RUA B" + i));
			listaEnderenco.add(new Endereco("RUA C" + i));
			listaEnderenco.add(new Endereco("RUA D" + i));
			listaEnderenco.add(new Endereco("RUA E" + i));
			listaEnderenco.add(new Endereco("RUA F" + i));
			
			Cliente cliente = new Cliente();
			cliente.setEnderecos(listaEnderenco);
			cliente.setTelefones(listaTelefone);
			cliente.setNome("JOAOZINHO...... " + i );
			entityManager.persist(cliente);
		}
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}
}
