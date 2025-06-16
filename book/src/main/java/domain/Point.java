package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("point")
public class Point {
	
	private Long pono; // ����Ʈ ������ȣ
	private String mno; //���� ��ȣ
	private String amount;// �ݾ�
	private String regdate ; //������
	
	
}
