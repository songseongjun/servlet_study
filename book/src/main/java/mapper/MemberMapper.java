package mapper;

import domain.Member;

public interface MemberMapper {
	 Member findById(String id);//id를넣어서  member를반환
	 Member findByNo(Long mno);// mno를넣어서 member를반환!
	 int insert(Member member);//member넣어서 insert 하겠다는것!
	 
}
