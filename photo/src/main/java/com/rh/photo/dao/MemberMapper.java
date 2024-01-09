package com.rh.photo.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
@Mapper
public interface MemberMapper {

	int insertMember(HashMap<String, String> paraMap);

}
