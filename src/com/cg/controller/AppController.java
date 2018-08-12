package com.cg.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.pojo.bookPojo;
import com.cg.service.bookService;
import com.cg.service.bookServiceImpl;

@WebServlet("*.app")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private bookService service = new bookServiceImpl();

	public AppController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);
		double sum=0.0;

		switch (action) {
		case "/home.app":
			Collection<bookPojo> book = service.viewAllHome();
			request.setAttribute("books", book);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			break;

		case "/addToCart.app":
			int id = Integer.parseInt(request.getParameter("itemId"));
			book = service.viewAllHome();
			bookPojo bookObj = null;
			for (bookPojo book1 : book) {
				if (id == book1.getId()) {
					bookObj = book1;
				}
			}
			service.addBook(bookObj);
			Collection<bookPojo> book2=service.viewCart();
			session.setAttribute("count", book2);
			for(bookPojo book3 :book2)
			{
				sum+=book3.getPrice();
			}
			session.setAttribute("sum",sum);
			response.sendRedirect("home.app");
			break;

		case "/viewCart.app":
			book = service.viewCart();
			session.setAttribute("count", book);
			request.setAttribute("books", book);
			for(bookPojo book3 :book)
			{
				sum+=book3.getPrice();
			}
			session.setAttribute("sum",sum);
			dispatcher = request.getRequestDispatcher("viewCart.jsp");
			dispatcher.forward(request, response);
			break;
		
		case "/deleteFromCart.app":
			int id1=Integer.parseInt(request.getParameter("itemId"));
			bookObj = null;
			book = service.viewCart();
			for (bookPojo books : book) {
				if (books.getId() == id1) {
					bookObj = books;
				}
			}
			service.delete(bookObj);
			response.sendRedirect("viewCart.app");
			break;
		default: break;
		
		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
