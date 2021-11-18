package com.onlineCourse.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineCourse.Services.CourseService;
import com.onlineCourse.Services.StudentService;
import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService stdservice;
	
	@Autowired
	private CourseService courseService;
	
	@ModelAttribute("genderList")
	public Map<String,String> genderList(){
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("Male", "MALE");
		map.put("Female", "FEMALE");
	
	    return map;
	}
	
	@GetMapping("/StudentLogin")
	public String studentLauncher(Model model) {
		

		Student student=new Student();
		
		model.addAttribute("studentData",student);
		
		return "studentSignUpForm";
	}
	
	@PostMapping("/SignUp")
	public ModelAndView studentSignUp(@Valid @ModelAttribute("studentData") Student student , BindingResult br) {
		
		if(br.hasErrors()) {
			return new ModelAndView("studentSignUpForm");
		}

		Student saveStudent=stdservice.saveStudent(student);
		ModelAndView mv=new ModelAndView("studentRegisterSuccess","student",saveStudent);
		
		return mv;
	}
	
	@GetMapping("/studentViewCourses")
	public String studentCoursesLaunch(Model model) {
		
		List<CourseBean> stuCourse = courseService.getCoursesForStudents();
		
		model.addAttribute("studentCourse", stuCourse);
		
		return "studentCourses";
	}
	
	@GetMapping("/enrollCourse")
	public String PayPageLaunch() {
		
		
		return "PaymentDetails";
		
	}
	
	@PostMapping("/payment")
	public String doPayment()
	{
		return "PaymentSuccess";
	}
	
    
	
	
	

}
