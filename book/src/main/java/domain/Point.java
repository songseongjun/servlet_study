package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("point")
public class Point {
	
	private Long pono; // 포인트 충전번호
	private String mno; //유저 번호
	private String amount;// 금액
	private String regdate ; //충전일
	
	
}
