package mapper;

import domain.Member;

public interface MemberMapper2 {
	 MemberMapper2 findById(String id);//id���־  member����ȯ
	 MemberMapper2 findByNo(Long mno);// mno���־ member����ȯ!
	 int insert(MemberMapper2 member);//member�־ insert �ϰڴٴ°�!
	 
}
