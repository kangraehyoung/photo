package com.rh.photo.service;

import java.util.HashMap;

public interface StoryService {

	HashMap<String, Object> getStoryList();

	HashMap<String, String> getStoryInfoByNo(HashMap<String, String> paraMap);

}
