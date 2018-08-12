package com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.pojo.bookPojo;

public class bookDaoImpl implements bookDao {

	// This list is used to store books which will be displayed on the homepage
	private Map<Integer, bookPojo> bookList = new HashMap<>();

	private Map<Integer, bookPojo> cartList = new HashMap<>();

	@Override
	public Collection<bookPojo> viewAllHome() {
		bookList.put(1, new bookPojo(1, "BOSE Rx100", 100.0, "Earphones"));
		bookList.put(2, new bookPojo(2, "JBL Go", 2220.0, "Bluetooth Speakers"));
		bookList.put(3, new bookPojo(3, "Stanmore Rx100", 1100.0, "Best speakers"));

		return bookList.values();

	}

	public Collection<bookPojo> viewCart() {
		return cartList.values();
	}

	@Override
	public void addBook(bookPojo book) {
		cartList.put(book.getId(), book);

	}
	public void delete(bookPojo book) {
		cartList.remove(book.getId());

		
	}

}
