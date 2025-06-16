package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("book")
public class Book {
	
	
	private Long bno; 
	private String name; 
	private String writer;
	private String publisher;
	private String pages;
	private String regdate ;
	
	

}
