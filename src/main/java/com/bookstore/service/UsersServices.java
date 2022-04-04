package com.bookstore.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.Users;

public class UsersServices {
	private static EntityManagerFactory createEntityManagerFactory;
	private static EntityManager createEntityManager;
	private UserDao userdao;
	private List<Users> listUsers;

	public UsersServices() {
		createEntityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
		createEntityManager = createEntityManagerFactory.createEntityManager();
		userdao = new UserDao(createEntityManager);
		System.out.println("User service called");
	}

	// By default u get three records
	public List<Users> listUsers(int label, int noOfRecords) {
		listUsers = userdao.listAll(label, noOfRecords);
		return listUsers;
	}
	
	public long count()
	{
		return userdao.count();
	}

}
