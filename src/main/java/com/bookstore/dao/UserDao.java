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

	public List<Users> findByEmail(String email)
	{
		List<Users>userList= super.findWithNamedQuery("user.findByEmail", "email", email);
		/*System.out.println("From Dao:"+userList);
		if(userList!=null && userList.size()==1)
		{
			return userList.get(0);
		}
		return null;*/
		return userList;
		
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

	public List<Users> listAll(int label, int noOfRecords) {
		return super.findWithNamedQuery("users.findAll",label,noOfRecords);
	}

	public long count() {
		return super.totalCount("user.count");
	}



}
