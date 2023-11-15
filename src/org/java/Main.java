package org.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static final File mioFile = new File("D:\\test.txt");
			
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
		
		
		
		FileWriter myWriter = null;
		try {
		    myWriter = new FileWriter(mioFile);

		    for (Book book : library) {
		        myWriter.write(book.toString() + "\n");
		    }
		    System.out.println("\nDati dei libri scritti su 'test.txt'");
		} catch (IOException e) {
		    System.out.println("Errore durante la scrittura su file: " + e.getMessage());
		} finally {
		    if (myWriter != null) {
		        try {
		            myWriter.close();
		        } catch (IOException e) {
		            // Gestione dell'eccezione durante la chiusura del file
		            System.out.println("Errore durante la chiusura del file: " + e.getMessage());
		        }
		    }
		}
		
		
//		System.out.println(Arrays.asList(library));
//		System.out.println("Libri:" + '\n'
//				+ "---------------------------------------------");
//        for (Book book : library) {
//            System.out.println(book.toString());
//        }
	}
}