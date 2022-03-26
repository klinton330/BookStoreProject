package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Users;

public class UserDao extends JPADao<Users> implements GenericDao<Users> {

	public UserDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	public Users create(Users t) {
		return super.Create(t);
	}

	public Users update(Users t) {
		return super.update(t);
	}

	public Users get(int id) {
		Users user=super.find(Users.class, id);
		return user;
	}

	public void delete(int id) {
		super.delete(Users.class,id);
		
	}

	public List<Users> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}