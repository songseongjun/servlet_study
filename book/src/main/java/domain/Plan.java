package domain;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("plan")
public class Plan {
	
	private  int plno; // �������ȣ
	private String name; //������̸�
	private int price;//����
	private int days ; //���ǻ�
	
	
}
