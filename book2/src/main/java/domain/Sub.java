package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("sub")
public class Sub {

	private Long sno; 
	private Long mno; 
	private String startDate;
	private String endDate; 

}
