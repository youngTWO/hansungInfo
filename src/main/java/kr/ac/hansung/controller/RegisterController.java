package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class RegisterController {

	private SubjectService subjectSerivce;

	@Autowired
	public void setSubjectSerivce(SubjectService subjectSerivce) {
		this.subjectSerivce = subjectSerivce;
	}

	@RequestMapping(value = "/register")
	public String register(Model model, @Valid Subject subject, BindingResult result) {

		if(result.hasErrors())
			return "register";
		
		subjectSerivce.insert(subject);

		return "home";
	}

	@RequestMapping(value = "/registerCheck")
	public String registerCheck(Model model) {

		List<Subject> registerDetail = subjectSerivce.getSemesterDetail(2017, 1);
		model.addAttribute("detail", registerDetail);
		
		return "registerCheck";
	}
}
