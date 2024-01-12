package com.rh.photo.controller;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rh.photo.config.ValidationConfig;
import com.rh.photo.service.MemberService;
import com.rh.photo.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	private final Logger log = LoggerFactory.getLogger(getClass());

	// 회원가입
	@PostMapping("/member/insert")
	@ResponseBody
	public ResponseEntity<?> insertMember(@RequestParam String userId, @RequestParam String password,
			@RequestParam String name) {

		HashMap<String, String> paraMap = new HashMap<String, String>();

		ValidationConfig val = new ValidationConfig(userId, password);

		if (val.validateEmailAndPassword(userId, password)) {
			log.info("아이디, 비밀번호 유효성 체크 통과");
		} else {
			log.info(val.getErrors());
			return ResponseEntity.badRequest().body(val.getErrors());
		}

		paraMap.put("userId", userId);
		paraMap.put("password", password);
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
	public ResponseEntity<?> memberLogin(@RequestParam String userId, @RequestParam String password,
			HttpSession session) {

		HashMap<String, String> paraMap = new HashMap<String, String>();

		ValidationConfig val = new ValidationConfig(userId, password);

		if (val.validateEmailAndPassword(userId, password)) {
			log.info("아이디, 비밀번호 유효성 체크 통과");
		} else {
			log.info(val.getErrors());
			return ResponseEntity.badRequest().body(val.getErrors());
		}

		paraMap.put("userId", userId);
		paraMap.put("password", password);

		int result = memberService.memberExistChk(paraMap);

		if (result > 0) {

			HashMap<String, String> memberInfoMap = memberService.getMemberById(paraMap);

			session.setAttribute("memberNo", memberInfoMap.get("member_no"));
			session.setAttribute("memberId", memberInfoMap.get("member_id"));
			session.setAttribute("memberNickName", memberInfoMap.get("member_nickname"));

			session.setMaxInactiveInterval(1800);

			log.info("Session Value = memberNo : " + session.getAttribute("memberNo") + ", memberId : " + session.getAttribute("memberId") + ", memberNickName : " + session.getAttribute("memberNickName"));

			return ResponseEntity.ok("login success");
		} else {
			return ResponseEntity.badRequest().body("login fail");
		}

	}

	// 회원탈퇴
	@SuppressWarnings("unchecked")
	@PostMapping("/member/delete")
	@ResponseBody
	public ResponseEntity<?> deleteMember(HttpSession session) {
		
		HashMap<String, String> sessionMap = new HashMap<String, String>();

		sessionMap = (HashMap<String, String>) session.getAttribute("userSession");

		int result = memberService.deleteMemberByNo(sessionMap);

		if (result > 0) {
			return ResponseEntity.ok("delete seccess");
		} else {
			return ResponseEntity.badRequest().body("delete fail");
		}

	}

	// 회원 정보 수정
	@PostMapping("/member/updateinfo")
	@ResponseBody
	public ResponseEntity<?> updateUserInfo(@RequestParam String email, @RequestParam String name,
			@RequestParam String password, HttpServletRequest request) {

		HashMap<String, String> paraMap = new HashMap<String, String>();
		MemberVo memberVo = (MemberVo) request.getSession().getAttribute("userSession");

		paraMap.put("no", String.valueOf(memberVo.getMemberNo()));
		paraMap.put("email", email);
		paraMap.put("name", name);
		paraMap.put("password", password);

		int result = memberService.updateUserInfo(paraMap);

		if (result > 0) {
			return ResponseEntity.ok("userInfo update success");
		} else {
			return ResponseEntity.badRequest().body("fail");
		}

	}

}