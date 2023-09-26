package com.amdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spring_demo {
	@GetMapping("/get")
	public String show() {
		String newline = System.getProperty("line.separator");  
		String str1="Name: Harsh Darak";
		String str2 = "Unit: AQE, " + '\n' + "email: harsh.darak@amdocs.com";
		String a = str1 + newline + str2;
		return a;
//		return "Welcome to spring";
	}
	
}
