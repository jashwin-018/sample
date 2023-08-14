package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookStoreController {
@Autowired 								//Has a Relationship..
private BookService bookservice;

@GetMapping("/bookstore/books")
public List<Book> getAllBooks(){
 List<Book> allBookList = bookservice.getAllBooks();

	return allBookList;
	
}

@GetMapping("/bookstore/books/{bookid}")
public Book getBookById(@PathVariable String bookid) {
	Book bookdetails =bookservice.getBookById(Integer.parseInt(bookid));
	return bookdetails;
}
}