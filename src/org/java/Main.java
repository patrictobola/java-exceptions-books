package org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi inserire?");
		String strBooks = in.nextLine();
		int nBooks = Integer.valueOf(strBooks);
		
		Book[] library = new Book[nBooks];
		
		for(int x = 0; x < nBooks; x++) {
			try {
			System.out.println("Inserisci i dati per il libro numero " + (x + 1) + ".");
			System.out.print("Titolo: ");
			String title = in.nextLine();
			
			System.out.print("Numero di pagine: ");
			String strPages = in.nextLine();
			int pages = Integer.valueOf(strPages);
			
			System.out.print("Autore: ");
			String author = in.nextLine();			
			
			System.out.print("Editore: ");
			String publisher = in.nextLine();
			
			library[x] = new Book(title, pages, author, publisher);
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
				x--;
			}
			
		}
		in.close();
//		System.out.println(Arrays.asList(library));
		System.out.println("Libri:" + '\n'
				+ "---------------------------------------------");
        for (Book book : library) {
            System.out.println(book.toString());
        }
	}
}