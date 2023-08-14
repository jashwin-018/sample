package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface IBookService {

	public void addBook(Book book);
	public void editBook(Book book,int bookid);
	public boolean deleteBook(int bookid);
	public Book getBookById(int bookid);
	public List<Book> getAllBooks();
}
