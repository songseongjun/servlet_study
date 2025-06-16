package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("member")
public class Member {
	
	
	private Long mno; 
	private String id; 
	private String pw;
	private String name; 
	private String tel; 
	private String email; 
	private String regdate ; 
	
}
