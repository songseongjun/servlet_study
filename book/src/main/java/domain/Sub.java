package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("sub")
public class Sub {

	private Long sno; // 구독번호
	private Long mno; // 유저번호
	private String startDate;// 멤버쉽 시작날짜
	private String endDate; // 멤버쉽 종료날짜

}
