package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("plan")
public class Plan {
	
	private  int plno; // 멤버쉽번호
	private String name; //멤버쉽이름
	private int price;//가격
	private int days ; //출판사
	
	
}
