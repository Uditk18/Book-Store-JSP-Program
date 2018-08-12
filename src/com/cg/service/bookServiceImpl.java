package com.cg.service;

import com.cg.dao.bookDao;
import com.cg.dao.bookDaoImpl;

import java.util.Collection;
import com.cg.pojo.bookPojo;

public class bookServiceImpl implements bookService {
	
	private bookDao dao = new bookDaoImpl();
	
	@Override
	public Collection<bookPojo> viewAllHome()
	{
		return dao.viewAllHome();
		
	}

	@Override
	public void addBook(bookPojo book)
	{
		dao.addBook(book);
		
	}
	
	public Collection<bookPojo> viewCart()
	{
		return dao.viewCart();
		
	}
	public void delete(bookPojo book) {
		dao.delete(book);
	}
	
	
}
