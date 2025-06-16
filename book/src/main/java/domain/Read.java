package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("read")
public class Read {
	
	private String rno; //���������丮��ȣ
	private Long mno; // ������ȣ
	private String bno;//å��ȣ
	private String rpage; //���������� ����������
	private String moddate; //���������� ���� ��¥

	
	
}
