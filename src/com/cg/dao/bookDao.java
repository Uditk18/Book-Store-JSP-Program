package com.cg.dao;

import java.util.Collection;

import com.cg.pojo.bookPojo;

public interface bookDao {

	Collection<bookPojo> viewAllHome();

	void addBook(bookPojo book);

	Collection<bookPojo> viewCart();
	
	void delete(bookPojo book);

}