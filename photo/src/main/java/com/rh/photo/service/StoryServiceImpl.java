package com.rh.photo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rh.photo.dao.StoryMapper;

@Service
public class StoryServiceImpl implements StoryService {
	
	@Autowired
	private StoryMapper storyMapper;

	@Override
	public HashMap<String, Object> getStoryList() {
		// TODO Auto-generated method stub
		return storyMapper.getStoryList();
	}

	@Override
	public HashMap<String, String> getStoryInfoByNo(HashMap<String, String> paraMap) {
		// TODO Auto-generated method stub
		return storyMapper.getStoryInfoByNo(paraMap);
	}

}
