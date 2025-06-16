package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("book")
public class Book {
	
	
	private Long bno; // å��ȣ
	private String name; //å�̸�
	private String writer;//�ۼ���(������)
	private String publisher; //���ǻ�
	private String pages; //�������� 
	private String regdate ; //�����!
	
	

}
