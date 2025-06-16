package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("member")
public class Member {
	
	
	private Long mno; // ������ȣ
	private String id; //���̵� 
	private String pw;//��й�ȣ
	private String name; //�̸�
	private String tel; //��ȭ��ȣ 
	private String email; //�̸���
	private String regdate ; //�����!ȸ�����Գ�¥!
	
	
}
