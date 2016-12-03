package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class KindsController {

private SubjectService subjectService;
	
	@Autowired
	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	@RequestMapping(value = "/kinds")
	public String kinds(Model model) {
		
		List<Subject> kindsList = subjectService.getPoints();
		model.addAttribute("kindsList", kindsList);
		
		int total = subjectService.getTotalPoints();
		model.addAttribute("total", total);
		
		return "kinds";
	}
	
}
