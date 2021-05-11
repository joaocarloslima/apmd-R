package br.com.fiap.movies.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.movies.model.Filme;

public class Dao {

	public void create(Filme filme) {
		
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("fiap-movies");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(filme);
		manager.getTransaction().commit();
				
		manager.close();
	}

}
