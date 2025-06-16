package service;

import org.apache.ibatis.session.SqlSession;

import domain.Member;
import mapper.MemberMapper;
import util.MybatisUtil;
import util.PasswordEncoder;

public class MemberService {
	public int register(Member member) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class); 
			member.setPw(PasswordEncoder.encode(member.getPw()));
			return mapper.insert(member);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public Member findById(String id) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class); 
			
			if(mapper.findById(id) == null) {
				return null;
			}
			
			return mapper.findById(id);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		MemberService service = new MemberService();
		//service.register(Member.builder().id("tac").pw("1234").name("º€º∫¡ÿ").email("tsc").tel("010-47012571").build());
		service.findById("tac");  
	}
}
