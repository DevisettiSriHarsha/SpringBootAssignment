package org.cg.bookmanagement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int libraryId;
	private String libraryName;
	
	@OneToMany(mappedBy = "library")
	private List<Book> books;

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Library() {
		super();
	}

	public Library(int libraryId, String libraryName, List<Book> books) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.books = books;
	}
}
