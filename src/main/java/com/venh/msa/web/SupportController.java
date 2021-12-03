package com.venh.msa.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupportController {
	
	@GetMapping("/venh-msa-support/{param}")
	public String getVenhMsa(@PathVariable String param) {
		
		if (param.equals("fail")) {
			throw new RuntimeException("failed");
		}
		
		return "Call Success VenhMsa Support Param : " + param;
	}
}
