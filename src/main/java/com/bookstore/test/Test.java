package com.bookstore.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class Test {

	public static void main(String[] args) {
		// Create an EntityManagerFactory
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
		// Create an EntityManager
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		Users user = new Users();
		user.setFullName("Hari");
		user.setEmail("klintonece@gmail.com");
		user.setPassword("hari");
		// Begin Transaction
		createEntityManager.getTransaction().begin();
		// Store the Object
		createEntityManager.persist(user);
		// Commit Transaction
		createEntityManager.getTransaction().commit();
		// close an EntityManager
		createEntityManager.close();
		// Close an EntityManagerFactory
		createEntityManagerFactory.close();
		System.out.println("User is stored");
		}
}
