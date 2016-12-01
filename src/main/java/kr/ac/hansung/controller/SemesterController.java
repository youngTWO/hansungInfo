package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SemesterController {
	
	@RequestMapping(value = "/semester", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "semester";
	}
}
