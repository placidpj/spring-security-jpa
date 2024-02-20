package com.pj.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	// anyone can access
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	// only user can access
	@GetMapping("/user")
	public String user() {
		return ("<h1> Welcome User </h1>");
	}
	
	//  only admin can access
	@GetMapping("/admin")
	public String admin() {
		return ("<h1> Welcome admin </h1>");
	}
}
