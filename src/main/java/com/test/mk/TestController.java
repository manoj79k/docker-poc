package com.test.mk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {
	
	@GetMapping
	public String hello(@RequestParam String msg)
		{
		  return "hello "+msg;
	 }

}
