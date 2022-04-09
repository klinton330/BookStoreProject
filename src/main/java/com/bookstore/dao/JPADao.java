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
	
	public List<E> findWithNamedQuery(String queryName,int label, int noOfRecords)
	{
		System.out.println("Label:"+label+" "+"NoOfRecords:"+noOfRecords);
		Query query=	entityManager.createNamedQuery(queryName);
		query.setMaxResults(noOfRecords);
		query.setFirstResult(label);
		return query.getResultList();
	}
	
	public List<E> findWithNamedQuery(String queryName,String pos,String email)
	{
		Query query=	entityManager.createNamedQuery(queryName);
		query.setParameter(pos, email);
		return query.getResultList();
	}
	
	public long totalCount(String queryName)
	{
		Query query=entityManager.createNamedQuery(queryName);
		return  (long) query.getSingleResult();
		
	}
}
