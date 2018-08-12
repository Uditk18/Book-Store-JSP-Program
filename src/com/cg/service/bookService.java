package com.cg.service;

import java.util.Collection;

import com.cg.pojo.bookPojo;

public interface bookService {

	Collection<bookPojo> viewAllHome();

	void addBook(bookPojo book);
	
	Collection<bookPojo> viewCart();

	void delete(bookPojo book);

	

}
