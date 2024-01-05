package com.rh.photo.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rh.photo.service.StoryService;

@Controller
public class StoryController {
	private StoryService storyService;
	
	@GetMapping("/story/list")
	public ResponseEntity<?> getStoryList(){
		
		Optional<HashMap<String, Object>> storyList = Optional.ofNullable(storyService.getStoryList());
		
		return ResponseEntity.ok(storyList.get());
	}
	
	@PostMapping("/story/insert")
	public ResponseEntity<?> insertStory(){
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		
		return ResponseEntity.ok("success");
	}
	
}
