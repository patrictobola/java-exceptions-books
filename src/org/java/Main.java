package org.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static final File mioFile = new File("D:\\test.txt");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Quanti libri vuoi inserire? 0. Per uscire");
		String strBooks = in.nextLine();
		int nBooks = Integer.valueOf(strBooks);

		if (nBooks == 0) {
			System.out.println("Nessun libro da inserire. Il programma termina.");
			System.exit(0);
		}

		Book[] library = new Book[nBooks];

		for (int x = 0; x < nBooks; x++) {
			try {
				System.out.println("Inserisci i dati per il libro numero " + (x + 1) + ".");
				System.out.println("");
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
				System.out.println("---------------------------------------------");
				System.out.println(e.getMessage());
				System.out.println("---------------------------------------------");
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
		} catch (IOException e) {
			System.out.println("Errore nella scrittura: " + e.getMessage());
		} finally {
			if (myWriter != null) {
				try {
					myWriter.close();
				} catch (IOException e) {
					System.out.println("Errore nella chiusura: " + e.getMessage());
				}
			}
		}

		Scanner reader = null;
		try {
			reader = new Scanner(mioFile);

			System.out.println("\nInfo dei libri letti da 'library.txt':");
			System.out.println("---------------------------------------------");
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Errore nella lettura: " + e.getMessage());
		} finally {
			if (reader != null) {
				reader.close();
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