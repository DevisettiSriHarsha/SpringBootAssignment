package org.cg.bookmanagement.service;

import java.util.List;

import org.cg.bookmanagement.model.Library;
import org.cg.bookmanagement.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LibraryService {
	
	@Autowired
	LibraryRepository libraryRepository;
	
	@Autowired
	BookService bookService;
	
	public void addLibrary(Library library) {
		libraryRepository.save(library);
	}
	
	public List<Library> getAllLibrary(){
		return libraryRepository.findAll();
	}
	
	public List<String> getAllLibraryName(){
		return libraryRepository.getAllLibraryname();
	}
	
	public Library getLibraryByName(String name) {
		return libraryRepository.findByLibraryname(name);
	}
	
	public Library findById(int lid) {
		Library lib = libraryRepository.getOne(lid);
		return lib;
	}
}
