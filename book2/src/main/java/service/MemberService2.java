package service;

import org.apache.ibatis.session.SqlSession;

import domain.Member;
import domain.Member2;
import mapper.MemberMapper;
import util.MybatisUtil;
import util.PasswordEncoder;

public class MemberService2 {
	public int register(Member member) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			Member mapper = session.getMapper(MemberMapper.class); 
			member.setPw(PasswordEncoder.encode(member.getPw()));
			return mapper.insert(member);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public Member2 findById(String id) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			Member2 mapper = session.getMapper(Member2Mapper.class); 
			
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
		MemberService2 service = new MemberService2();
		//service.register(Member.builder().id("tac").pw("1234").name("º€º∫¡ÿ").email("tsc").tel("010-47012571").build());
		service.findById("tac");  
	}
}
