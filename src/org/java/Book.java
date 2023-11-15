package org.java;

public class Book {
	private String title;
	private int pages;
	private String author;
	private String publisher;
	
	public Book(String title, int pages, String author, String publisher) throws Exception {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if(title.isEmpty() || title.length() < 2)
			throw new Exception("Il titolo deve contenere almeno 2 lettere");
		
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		if(pages == 0 || pages < 10)
			throw new Exception("Inserire un numero di pagine valide che sia superiore a 10");
		
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if(author.isEmpty() || author.length() < 2)
			throw new Exception("L'autore deve avere un nome superiore alle 2 lettere");
		
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception {
		if(publisher.isEmpty() || publisher.length() < 2)
			throw new Exception("L'editore deve avere almeno 2 lettere");
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
