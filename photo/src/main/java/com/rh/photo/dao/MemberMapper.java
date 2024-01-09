package com.rh.photo.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
@Mapper
public interface MemberMapper {

	int insertMember(HashMap<String, String> paraMap);

	int memberExistChk(HashMap<String, String> paraMap);

	HashMap<String, String> getMemberById(HashMap<String, String> paraMap);

	int deleteMemberByNo(HashMap<String, String> sessionMap);

}
