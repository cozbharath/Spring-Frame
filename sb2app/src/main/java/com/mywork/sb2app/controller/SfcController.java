package com.mywork.sb2app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SfcController {

	@GetMapping("/public")
	String publicInfo() {

		return "Public Info Called";

	}

	@GetMapping("/user")
	String userInfo() {

		return "User Info Called";
	}

	@GetMapping("/admin")
	String adminInfo() {

		return "Admin Info Called";

	}

}
