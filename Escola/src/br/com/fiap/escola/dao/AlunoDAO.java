package br.com.fiap.escola.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.escola.model.Aluno;
import br.com.fiap.escola.util.JPAUtil;

public class AlunoDAO {
	
	EntityManager manager = JPAUtil.getManager();
	
	
	public List<Aluno> buscarTodos() {
		TypedQuery<Aluno> query = 
				manager.createQuery("SELECT a FROM Aluno a", Aluno.class);
		return query.getResultList();
		//return retornarDadosDeTeste();
	}
	
	public void apagar(Aluno aluno) {
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
	}

	public void apagar(Long id) {
		apagar(buscarPorId(id));
	}

	public Aluno buscarPorId(Long id) {
		return manager.find(Aluno.class, id);
	}

	private List<Aluno> retornarDadosDeTeste(){
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno("Joao", 20, "3ECR"));
		lista.add(new Aluno("Maria", 22, "3ECA"));
		lista.add(new Aluno("Marta", 21, "3ECA"));
		return lista;
	}



	
	

}
