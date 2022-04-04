package com.bookstore.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.entity.Users;
import com.bookstore.service.UsersServices;

/**
 * Servlet implementation class ListUsersServlet
 */
@WebServlet("/admin/list_users")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersServices userservice = new UsersServices();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int page = 1;
		int recordPerPage=3;
		if (request.getParameter("record") != null) {
			recordPerPage = Integer.parseInt(request.getParameter("record"));
		}
		System.out.println("Record Per Page:"+recordPerPage);
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		List<Users> list_user = userservice.listUsers((page - 1) * recordPerPage, recordPerPage);
		int noOfRecords = (int) userservice.count();
		System.out.println("noOfRecords"+noOfRecords);
		int noOfPage = (int) Math.ceil(noOfRecords * 1.0 / recordPerPage);
		request.setAttribute("list_user", list_user);
		request.setAttribute("noOfPages", noOfPage);
		request.setAttribute("currentpage", page);
		String path = "list_users.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
