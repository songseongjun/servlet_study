package mapper;

import domain.Member;

public interface MemberMapper {
	 Member findById(String id);//id���־  member����ȯ
	 Member findByNo(Long mno);// mno���־ member����ȯ!
	 int insert(Member member);//member�־ insert �ϰڴٴ°�!
	 
}
