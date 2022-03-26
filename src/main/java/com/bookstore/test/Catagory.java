package com.bookstore.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Catagory {
	
	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
		// Create an EntityManager
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		com.bookstore.entity.Catagory c=new com.bookstore.entity.Catagory();
		c.setCatagory_name("Novel");
		createEntityManager.getTransaction().begin();
		// Store the Object
		createEntityManager.persist(c);
		// Commit Transaction
		createEntityManager.getTransaction().commit();
		// close an EntityManager
		createEntityManager.close();
		// Close an EntityManagerFactory
		createEntityManagerFactory.close();
		System.out.println("Catagory is stored");
		
	}

}
