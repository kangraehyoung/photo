package com.rh.photo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rh.photo.dao.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int insertMember(HashMap<String, String> paraMap) {
		// TODO Auto-generated method stub
		return memberMapper.insertMember(paraMap);
	}

	@Override
	public int memberExistChk(HashMap<String, String> paraMap) {
		// TODO Auto-generated method stub
		return memberMapper.memberExistChk(paraMap);
	}

	@Override
	public HashMap<String, String> getMemberById(HashMap<String, String> paraMap) {
		// TODO Auto-generated method stub
		return memberMapper.getMemberById(paraMap);
	}

	@Override
	public int deleteMemberByNo(HashMap<String, String> sessionMap) {
		// TODO Auto-generated method stub
		return memberMapper.deleteMemberByNo(sessionMap);
	}
	
}
