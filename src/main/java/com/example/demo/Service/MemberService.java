package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Member;
import com.example.demo.Repository.MemberRepository;

@Service
public class MemberService {
	private final MemberRepository memberRepository;
	
	 @Autowired
	    public MemberService(MemberRepository memberRepository) {
	        this.memberRepository = memberRepository;
	    }
	    public Member createMember(@RequestBody Member member) {
	        return memberRepository.save(member);
	    }
		public List<Member> getAllMembers() {
			return memberRepository.findAll();
		}

}
