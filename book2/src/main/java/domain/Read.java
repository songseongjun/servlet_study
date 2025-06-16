package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("read")
public class Read {
	
	private String rno; 
	private Long mno; 
	private String bno;
	private String rpage; 
	private String moddate; 

	
	
}
