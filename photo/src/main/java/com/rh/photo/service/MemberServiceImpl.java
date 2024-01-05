package com.rh.photo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rh.photo.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int insertMember(HashMap<String, String> paraMap) {
		// TODO Auto-generated method stub
		return memberMapper.insertMember(paraMap);
	}
	
}
