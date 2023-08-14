package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Book;

@Component
public class BookService implements IBookService {
		
	static ArrayList<Book> books = new ArrayList<>();
	static {
		Book b1 =new Book(1,"Assasins",450.00,"willy");
		Book b2 =new Book(2,"Game of Thrones",700.00,"Ryan");
		Book b3 =new Book(3,"Flash",350.00,"jame");
		Book b4 =new Book(4,"After",800.00,"geoge");
		Book b5 =new Book(5,"Vampire Diaries",1000.00,"Damon");
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		
	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	@Override
	public void editBook(Book book, int bookid) {
		// TODO Auto-generated method stub
		Book record = getBookById(bookid);
		books.remove(record);
		book.setBookid(bookid);
		books.add(book);
	}

	@Override
	public boolean deleteBook(int bookid) {
		// TODO Auto-generated method stub
		Book record = getBookById(bookid);
		books.remove(record);
		return Boolean.TRUE;
	}

	@Override
	public Book getBookById(int bookid) {
		// TODO Auto-generated method stub
		return books.stream().filter(b->b.getBookid()==bookid).findFirst().get();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

}
