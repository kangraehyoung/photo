package com.rh.photo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		return "main/index";
	}

	@GetMapping("/signup")
	public String signupPage() {
		return "main/signup";
	}


	@GetMapping("/image/story")
	public String storyPage() {
		return "image/story";
	}

	@GetMapping("/image/popular")
	public String popularPage() {
		return "image/popular";
	}

	@GetMapping("/image/upload")
	public String uploadPage() {
		return "image/upload";
	}

	@GetMapping("/user/profile")
	public String profilePage() {
		return "user/profile";
	}

	@GetMapping("/user/update")
	public String updatePage() {
		return "user/update";
	}

	@GetMapping("/signin")
	public String signin() {
		return "main/index";
	}
	
	@GetMapping("/listPage")
	public String listPage() {
		return "main/main";
	}

	/*
	 * @GetMapping("/main/main") public String main() { return "main/main"; }
	 */
}
