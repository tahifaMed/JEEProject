package org.spring.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
	
	
	
	@RequestMapping(value="/")
	public String IndexPage(){
		
		return "index";
	}

}
