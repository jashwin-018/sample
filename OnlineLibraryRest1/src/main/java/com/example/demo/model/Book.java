package com.example.demo.model;

public class Book {
long bookid;
String title;
double price;
String AuthorName;
public long getBookid() {
	return bookid;
}
public void setBookid(long bookid) {
	this.bookid = bookid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + ", AuthorName=" + AuthorName + "]";
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
public Book(long bookid, String title, double price, String authorName) {
	super();
	this.bookid = bookid;
	this.title = title;
	this.price = price;
	AuthorName = authorName;
}
}
