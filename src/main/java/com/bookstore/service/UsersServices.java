package com.bookstore.service;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.Users;

public class UsersServices {
	private static EntityManagerFactory createEntityManagerFactory;
	private static EntityManager createEntityManager;
	private UserDao userdao;
	private List<Users> listUsers;
	private int recordPerPage = 5;

	public UsersServices() {
		createEntityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
		createEntityManager = createEntityManagerFactory.createEntityManager();
		userdao = new UserDao(createEntityManager);
		System.out.println("User service called");
	}

	public void listUsers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		listUsers(request, response, null);
	}

	public void listUsers(HttpServletRequest request, HttpServletResponse response, String message)
			throws ServletException, IOException {
		System.out.println("called");
		int page = 1;
		if (request.getParameter("record") != null) {
			recordPerPage = Integer.parseInt(request.getParameter("record"));
		}
		System.out.println("Record Per Page:" + recordPerPage);
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		listUsers = userdao.listAll((page - 1) * recordPerPage, recordPerPage);
		int noOfRecords = (int) count();
		System.out.println("noOfRecords" + noOfRecords);
		int noOfPage = (int) Math.ceil(noOfRecords * 1.0 / recordPerPage);
		request.setAttribute("list_user", listUsers);
		request.setAttribute("noOfPages", noOfPage);
		request.setAttribute("currentpage", page);
		if (message != null)
			request.setAttribute("message", message);
		String path = "list_users.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
		return;
	}

	public long count() {
		return userdao.count();
	}

	public void createUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("full_name");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		Users user = new Users();
		user.setFullName(name);
		user.setEmail(email);
		user.setPassword(password);

		Users exixt = userdao.findByEmail(email);
		if (exixt != null) {
			String message = "Email is already exixt in Database";
			request.setAttribute("message", message);
			RequestDispatcher rd = request.getRequestDispatcher("users_form.jsp");
			rd.forward(request, response);
		} else
		{
			userdao.create(user);
			listUsers(request, response, "New User successfully Added");
		}

	}
}
