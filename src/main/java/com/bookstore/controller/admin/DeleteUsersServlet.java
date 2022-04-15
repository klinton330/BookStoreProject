package com.bookstore.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.service.UsersServices;

/**
 * Servlet implementation class DeleteUsersServlet
 */
@WebServlet("/admin/delete_user")
public class DeleteUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsersServices userService=new UsersServices();
		userService.deleteUser(request, response);
	//	userService.listUsers(request, response, "User Successfully Deleted");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
