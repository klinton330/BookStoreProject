package com.bookstore.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.Users;

public class UserDaoTest01 {
	private static EntityManagerFactory createEntityManagerFactory;
	private static EntityManager createEntityManager;
	private static UserDao userdao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		createEntityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
		createEntityManager = createEntityManagerFactory.createEntityManager();
		 userdao = new UserDao(createEntityManager);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		createEntityManager.close();
		createEntityManagerFactory.close();
	}

	@Test
	public void test() {
		Users user = new Users();
		user.setFullName("John");
		user.setEmail("jv@gmail.com");
		user.setPassword("jb");
		user = userdao.Create(user);
		assertTrue(user.getUserid() > 1);
	}
	
	@Test
	public void test1() {
		Users user = new Users();
		user.setUserid(3);
		user.setFullName("klinton");
		user.setEmail("klinton@gmail.com");
		user.setPassword("klinton");
		user = userdao.Create(user);
		assertTrue(user.getUserid() > 1);
	}
	@Test
	public void updateTest()
	{
		Users user = new Users();
		user.setUserid(3);
		user.setFullName("klinton");
		user.setEmail("klinton@gmail.com");
		user.setPassword("klinton");
		user = userdao.update(user);
		assertTrue(user.getPassword().equalsIgnoreCase("klinton"));
	}

	@Test
	public void findTest()
	{
		Users user =userdao.get(3);
		if(user!=null)
		System.out.println(user.getEmail()+" "+user.getFullName() );
		assertNotNull(user);
	}
	
	@Test
	public void findTestNotNull()
	{
		Users user =userdao.get(333);
		assertNull(user);
	}
	
	@Test
	public void findByNamedQueryTest()
	{
	   List<Users>list=userdao.listAll();
	   assertTrue(list.size()>0);
	   list.forEach(n->System.out.println(n.getFullName()+" "+n.getPassword()+" "+n.getEmail()));
	}
	@Test
	public void deleteUser()
	{
		userdao.delete(2);
		Users user=userdao.find(Users.class,2 );
		assertNull(user);
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void deleteNotExixtingUser()
	{
		userdao.delete(77);
	}
	
	@Test
	public void countAllTest()
	{
		long l=userdao.count();
		System.out.println(l);
		assertTrue(l>0);
	}
}
