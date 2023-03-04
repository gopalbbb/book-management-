package com.school.bookDto;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.validation.constraints.NegativeOrZero;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Data
@Getter
@Setter
public class BookDto implements Serializable{
	
	private static final long serialVersionUID = -6636101227417116139L;


	private long bookId;

	private String bookName;
	

	private String authorName;
	
	
	private String authorId;
	
	private String aboutBook;
}
