package org.cg.bookmanagement.repository;

import java.util.List;

import org.cg.bookmanagement.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{
	
	@Query("select l.libraryName from Library l")
	List<String> getAllLibraryname();
	
	@Query("select l from Library l where l.libraryName = :name")
	Library findByLibraryname(@Param("name")String libName);
}
