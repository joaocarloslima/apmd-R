package br.com.fiap.escola.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.escola.model.Aluno;

public class AlunoDAO {
	
	public List<Aluno> buscarTodos() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola");
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Aluno> query = 
				manager.createQuery("SELECT a FROM Aluno a", Aluno.class);
		return query.getResultList();
		//return retornarDadosDeTeste();
	}
	
	private List<Aluno> retornarDadosDeTeste(){
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno("Joao", 20, "3ECR"));
		lista.add(new Aluno("Maria", 22, "3ECA"));
		lista.add(new Aluno("Marta", 21, "3ECA"));
		return lista;
	}
	
	

}
