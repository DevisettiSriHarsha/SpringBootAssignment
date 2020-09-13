package org.cg.bookmanagement.service;

import java.util.List;

import org.cg.bookmanagement.model.Book;
import org.cg.bookmanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book findByBookId(int bid) {
		Book book = bookRepository.getOne(bid);
		return book;
	}
	
	public void updateBook(Book b) {
		Book oldbook = bookRepository.getOne(b.getBookId());
		b.setLibrary(oldbook.getLibrary());
		bookRepository.save(b);
	}
	
	public void deleteBookById(int bid) {
		bookRepository.deleteById(bid);
	}
	
	public void deleteBookByLibId(int lid) {
		List<Book> books = bookRepository.deleteAllBookByLibraryId(lid);
		
		for(Book b : books) {
			bookRepository.delete(b);
		}
	}
}
