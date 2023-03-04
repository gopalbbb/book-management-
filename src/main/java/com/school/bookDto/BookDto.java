package com.school.bookDto;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.validation.constraints.NegativeOrZero;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@Data

public class BookDto implements Serializable {
	
	private static final long serialVersionUID = 3387934401753858061L;
	
	
	private Long bookId;
	private String bookName;
	private String authorName;
	private Integer authorId;
	private String aboutbook;

	
	
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getAboutbook() {
		return aboutbook;
	}
	public void setAboutbook(String aboutbook) {
		this.aboutbook = aboutbook;
	}
	
	
	

	
	
}
