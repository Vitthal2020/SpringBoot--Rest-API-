package com.example.SpringBoot.Book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookid;
	private String name;
	private String Author;
	
	

	

}
