package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("book")
public class Book {
	
	
	private Long bno; // 책번호
	private String name; //책이름
	private String writer;//작성자(지은이)
	private String publisher; //출판사
	private String pages; //총페이지 
	private String regdate ; //등록일!
	
	

}
