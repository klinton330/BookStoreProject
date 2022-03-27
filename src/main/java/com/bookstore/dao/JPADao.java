package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JPADao<E> {

	protected EntityManager entityManager;

	public JPADao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public E Create(E entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.refresh(entity);
		entityManager.flush();
		entityManager.getTransaction().commit();
		return entity;
	}

	public E update(E entity) {
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		return entity;
	}

	public E find(Class<E> entityClass, Object primaryKey) {
		E entity = entityManager.find(entityClass, primaryKey);
		return entity;
	}

	public void delete(Class<E> entityClass, Object primaryKey) {
		entityManager.getTransaction().begin();
		Object reference = entityManager.getReference(entityClass, primaryKey);
		entityManager.remove(reference);
		entityManager.getTransaction().commit();
	}
	
	public List<E> findWithNamedQuery(String queryName)
	{
		Query query=	entityManager.createNamedQuery(queryName);
		return query.getResultList();
	}
	
	public long totalCount(String queryName)
	{
		Query query=entityManager.createNamedQuery(queryName);
		return (long) query.getSingleResult();
		
	}
}
