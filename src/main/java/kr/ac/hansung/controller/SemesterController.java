package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class SemesterController {
	
	private SubjectService subjectService;
	
	@Autowired
	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	@RequestMapping(value = "/semester")
	public String semesterList(Model model) {
		
		List<Subject> semesterList = subjectService.getSemesterList();
		model.addAttribute("semesterList", semesterList);
		
		return "semester";
	}
	
	@RequestMapping(value = "/semesterDetail")
	public String semesterDetail(Model model, @RequestParam int year, @RequestParam int semester){
		
		List<Subject> semesterDetail = subjectService.getSemesterDetail(year, semester);
		model.addAttribute("detail", semesterDetail);
		
		return "semesterDetail";
	}
}
