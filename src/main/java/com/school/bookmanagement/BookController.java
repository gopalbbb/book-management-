package com.school.bookmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.school.bookDto.BookDto;
import com.school.bookEntity.Book;
import com.school.bookService.BookService;
import com.school.serviceImp.ServiceImp;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	/* @PostMapping("/save") */
	/*
	 * public ResponseEntity<Book> saveBook(@RequestBody BookDto bookDto) {
	 * 
	 * Book book= this.bookService.addNewbook(bookDto);
	 * 
	 * return new ResponseEntity<Book>(book,HttpStatus.CREATED);
	 * 
	 * }
	 */
	
	@PostMapping("/create")
	public ResponseEntity<BookDto>addbook(@RequestBody BookDto bookDto){
		BookDto bookDto2= this.bookService.createBook(bookDto);
		return new ResponseEntity<>(bookDto2,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<BookDto>> getAllBooks(BookDto bookDto){
		return ResponseEntity.ok(this.bookService.getAllBook(bookDto));
		
		
	}
}
