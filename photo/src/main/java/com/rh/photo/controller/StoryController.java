package com.rh.photo.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rh.photo.service.StoryService;
import com.rh.photo.vo.StoryVo;

@Controller
public class StoryController {
	
	@Autowired
	private StoryService storyService;
	
	@GetMapping("/story/list")
	@ResponseBody
	public ResponseEntity<?> getStoryList(){
		
		Optional<HashMap<String, Object>> storyList = Optional.ofNullable(storyService.getStoryList());
		
		if (storyList != null) {
			return ResponseEntity.ok(storyList.get());
		}else {
			return ResponseEntity.badRequest().body("empty");
		}
		
		
	}
	
	@PostMapping("/story/insert")
	@ResponseBody
	public ResponseEntity<?> insertStory(){
		
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		return ResponseEntity.ok("success");
	}
	
	//게시글 수정 페이지 이동 url
	@GetMapping("/story/update")
	@ResponseBody
	public ResponseEntity<?> updateStory(@RequestParam int storyNo){
		
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		paraMap.put("storyNo", String.valueOf(storyNo));
		
		HashMap<String, String> storyInfoMap = storyService.getStoryInfoByNo(paraMap);
		
		return ResponseEntity.ok(storyInfoMap);
	}
	
	// 게지글 수정 url
	@PostMapping("/story/updatedata")
	@ResponseBody
	public ResponseEntity<?> updateStoryByData(@RequestBody StoryVo story){
		
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		//paraMap.put("", null);
		
		return ResponseEntity.ok("success");
	}
	
}
