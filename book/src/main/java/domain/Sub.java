package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("sub")
public class Sub {

	private Long sno; // ������ȣ
	private Long mno; // ������ȣ
	private String startDate;// ����� ���۳�¥
	private String endDate; // ����� ���ᳯ¥

}
