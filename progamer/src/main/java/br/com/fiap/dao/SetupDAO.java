package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.model.Setup;
import br.com.fiap.util.JPAUtil;

public class SetupDAO {
	
	private EntityManager manager = JPAUtil.getEntityManager();

	public void save(Setup setup) {
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		manager.close();
	}

}
