package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("read")
public class Read {
	
	private String rno; //읽은히스토리번호
	private Long mno; // 유저번호
	private String bno;//책번호
	private String rpage; //마지막으로 읽은페이지
	private String moddate; //마지막으로 읽은 날짜

	
	
}
