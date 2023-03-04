package com.school.bookReposeroty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.bookEntity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
