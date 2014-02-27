package org.jboss.tools.example.html5.rest;

import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.tools.example.html5.model.Casa;


@Path("/JPA")
@RequestScoped
@Stateful
public class JPA {

	
	
	@GET
	public String mensagens(){
		return "OLA ESTOU FUNCIONADO";
	}
	
	
	@GET
	@Path("/OIEEE")
	@Produces(MediaType.APPLICATION_JSON)
	public Casa getCasa(){
		Casa casa = new Casa();
		
		casa.setNome("RUA DO BURRO");
		casa.setNumero("ZERO");
		
		return casa;
	}
	
	
	
}
