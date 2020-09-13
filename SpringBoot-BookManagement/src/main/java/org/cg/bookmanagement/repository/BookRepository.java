package org.cg.bookmanagement.repository;

import java.util.List;

import org.cg.bookmanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	@Query("select b from Book b,Library l where b.library = l.libraryId and b.library.libraryId = :lid")
	List<Book> deleteAllBookByLibraryId(@Param("lid")int lid);
}
