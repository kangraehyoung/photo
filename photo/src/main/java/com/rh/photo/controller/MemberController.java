package com.rh.photo.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.rh.photo.service.MemberService;

@Controller
public class MemberController {
	
//	private MemberService memberService;
	
	@PostMapping
	public ResponseEntity<?> insertMember(@RequestParam String userId, @RequestParam String password, @RequestParam String email, @RequestParam String name){
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		paraMap.put("userId", userId);
		paraMap.put("password", password);
		paraMap.put("email", email);
		paraMap.put("name", name);
		
//		int result = memberService.insertMember(paraMap);
		
//		if (result > 0) {
			return ResponseEntity.ok("success");
//		} else {
//			return ResponseEntity.badRequest().body("fail");
//		}
		
	}
	
}
