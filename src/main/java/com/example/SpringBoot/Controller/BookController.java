package com.example.SpringBoot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Book.Book;
import com.example.SpringBoot.Repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;
	@PostMapping("/demo1")
	public String demo(@RequestBody Book book) {
		bookRepository.save(book);
		return "Book Added Successfully";	
	}
	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		List<Book>books=bookRepository.findAll();
		return books;
		
	}
//	
	@PutMapping("/updatebook")
	public String updatebook(@RequestParam String name,@RequestParam int bookid) {
		Optional<Book>bk=bookRepository.findById(bookid);
		Book book1=bk.get();
		book1.setName(name);
		bookRepository.save(book1);
		return "updated successfully";
		
	}
	@GetMapping("/getbyid")
	public Book getbyid(@RequestParam int bookid) {
		Optional<Book>book=bookRepository.findById(bookid);
		Book book2=book.get();
		return book2;
		
	}
	@GetMapping("/getbyname")
	public Book getbyname(@RequestParam String name) {
		Optional<Book>bk1=bookRepository.findByName(name);
		Book book3=bk1.get();
		return book3;
		
	}
	@DeleteMapping("/del")
	public String delBook(@RequestParam int id) {
		bookRepository.deleteById(id);
		return "data deleted successfully";
		
	}
	
	
}
