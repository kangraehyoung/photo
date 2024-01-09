package com.rh.photo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rh.photo.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	// 회원가입
	@PostMapping("/member/insert")
	@ResponseBody
	public ResponseEntity<?> insertMember(@RequestParam String userId, @RequestParam String password, @RequestParam String email, @RequestParam String name){
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		paraMap.put("userId", userId);
		paraMap.put("password", password);
		paraMap.put("email", email);
		paraMap.put("name", name);
		
		log.info("param : " + paraMap);
		
		int result = memberService.insertMember(paraMap);
		
		if (result > 0) {
			return ResponseEntity.ok("success");
		} else {
			return ResponseEntity.badRequest().body("fail");
		}
	}
	
	// 로그인 
	@PostMapping("/member/login")
	@ResponseBody
	public ResponseEntity<?> memberLogin(@RequestParam String userId, @RequestParam String password, HttpSession session){
		HashMap<String, String> paraMap = new HashMap<String, String>();
		
		paraMap.put("userId", userId);
		paraMap.put("password", password);
		
		int result = memberService.memberExistChk(paraMap);
		
		if (result > 0) {
			HashMap<String, String> memberInfoMap = memberService.getMemberById(paraMap);
			
			session.setAttribute("userSession", memberInfoMap);
			
			session.setMaxInactiveInterval(1800);
			
			// System.out.println("세션값 : " + session.getAttribute("userSession"));
			
			return ResponseEntity.ok("login success");
			
		}else {
			return ResponseEntity.badRequest().body("login fail");
		}
		
	}
	
	// 회원탈퇴
	@SuppressWarnings("unchecked")
	@PostMapping("/member/delete")
	@ResponseBody
	public ResponseEntity<?> deleteMember(HttpSession session){
		HashMap<String, String> sessionMap = new HashMap<String, String>();
		
		sessionMap = (HashMap<String, String>) session.getAttribute("userSession");
		
		int result = memberService.deleteMemberByNo(sessionMap);
		
		if (result > 0) {
			return ResponseEntity.ok("delete seccess");
		}else {
			return ResponseEntity.badRequest().body("delete fail");
		}
		
	}
	
}