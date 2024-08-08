package com.example.SpringBoot.Repository;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.Book.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	Optional<Book> findByName(String bookname);






	
	
	

}
