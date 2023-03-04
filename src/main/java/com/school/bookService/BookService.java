package com.school.bookService;

import java.util.List;

import com.school.bookDto.BookDto;

public interface BookService {

	BookDto createBook(BookDto bookDto);

	List<BookDto> getAllBook(BookDto bookDto);

	BookDto getById(Long id);

	BookDto update(BookDto bookDto);

	BookDto delet(Long id);

}
