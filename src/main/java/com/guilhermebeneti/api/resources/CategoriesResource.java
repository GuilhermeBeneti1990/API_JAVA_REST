package com.guilhermebeneti.api.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categories")
public class CategoriesResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String list() {
		return "REST is working!";
	}

}
