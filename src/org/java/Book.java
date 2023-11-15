package org.java;

public class Book {
	private String title;
	private int pages;
	private String author;
	private String publisher;
	
	public Book(String title, int pages, String author, String publisher) {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Il libro si chiama: " + getTitle() + "\n"
		+ "Che ha come numero di pagine: " + getPages() + "\n"
		+ "Nome Autore: " + getAuthor() + "\n"
		+ "Nome casa editrice: " + getPublisher() + ".";
	}
}
