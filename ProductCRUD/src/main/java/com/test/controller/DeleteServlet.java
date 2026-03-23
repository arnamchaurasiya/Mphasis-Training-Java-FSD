package com.test.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.test.dao.ProductDaoImpl;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		ProductDaoImpl pimpl = new ProductDaoImpl();
		
		int x = pimpl.deleteProductById(id);
		
		response.sendRedirect("ListProducts");
	}

}
