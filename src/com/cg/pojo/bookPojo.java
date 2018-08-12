//This is the POJO class defining methods and instance variables of book type

package com.cg.pojo;

public class bookPojo {
	String bookName;
	int id;
	double price;
	String description;

	public bookPojo(int id, String bookName, double price, String description) {
		super();
		this.bookName = bookName;
		this.id = id;
		this.price = price;
		this.description = description;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
