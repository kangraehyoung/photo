package com.rh.photo.service;

import java.util.HashMap;
import java.util.List;

public interface StoryService {

	HashMap<String, Object> getStoryList();

	HashMap<String, String> getStoryInfoByNo(HashMap<String, String> paraMap);

	List<String> getAutoCompleteSearchWord(HashMap<String, String> paraMap);

}
