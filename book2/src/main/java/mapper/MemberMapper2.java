package mapper;

import domain.Member;

public interface MemberMapper2 {
	 MemberMapper2 findById(String id);//id를넣어서  member를반환
	 MemberMapper2 findByNo(Long mno);// mno를넣어서 member를반환!
	 int insert(MemberMapper2 member);//member넣어서 insert 하겠다는것!
	 
}
