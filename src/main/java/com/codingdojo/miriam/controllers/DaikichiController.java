package com.codingdojo.miriam.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping(value="",method=RequestMethod.GET)
	public String deployWelcome() {
		return "<h1>Welcome!</h1>";
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String deployToday() {
		return "<h1>Today, you'll find luck in your endeavors!</h1>";
	}
	
	@RequestMapping(value="/tomorrow", method=RequestMethod.GET)
	public String deployTomorrow() {
		return "<h1>Tomorrow, an opportunity will arise, so be sure to be open to new ideas!</h1>";
	}
	
	
}
