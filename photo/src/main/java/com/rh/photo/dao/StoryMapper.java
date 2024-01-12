package com.rh.photo.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
@Mapper
public interface StoryMapper {

	HashMap<String, Object> getStoryList();

	HashMap<String, String> getStoryInfoByNo(HashMap<String, String> paraMap);

	List<String> getAutoCompleteSearchWord(HashMap<String, String> paraMap);

	int insertStory(HashMap<String, String> paraMap);

}
