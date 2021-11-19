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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineCourse.Services.CourseService;
import com.onlineCourse.Services.StudentService;
import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;
import com.onlineCourse.exceptions.StudentNotFoundException;

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
	
	@GetMapping("/studentViewCourses/{studentId}")
	public String studentCoursesLaunch(@PathVariable Integer studentId,Model model) {
		
		List<CourseBean> stuCourse = courseService.getCoursesForStudents();
		
		model.addAttribute("studentCourse", stuCourse);
		
		return "studentCourses";
	}
	
	@GetMapping("/enrollCourse/{studentId}/{courseId}")
	public String courselink(@PathVariable Integer studentId,@PathVariable Integer courseId,Model model) {
		
		return "PaymentDetails";
		
	}
	
	@PostMapping("/payment/{studentId}/{courseId}")
	public String doPayment(@PathVariable Integer studentId,@PathVariable Integer courseId,Model model)
	{
		
		return "PaymentSuccess";
	}
	
//	@GetMapping("/courseStudentLink/{studentId}/{courseId}")
//	public String courselink(@PathVariable Integer studentId,@PathVariable Integer courseId) {
//		
//		stdservice.insertCourseIdwithStudent(studentId,courseId);
//		
//		return "studentPage";
//	}
	
	@GetMapping("/updateStuProfile/{studentId}")
    public String updateStudentProfileLauncher(@PathVariable Integer studentId, Model model) throws StudentNotFoundException {
		
		System.out.println(studentId);
		
		Student student = stdservice.getStudentById(studentId);
		
		System.out.println(student+"*********");
		
		model.addAttribute("updateStudentData", student);
		
		return"updateStudentProfile";
	}
	
	
	@PostMapping("/updateStudent")
	public ModelAndView doUpdateStudent(@ModelAttribute("updateStudentData") Student student, BindingResult br) {
		
		if(br.hasErrors()) {
			
			return new ModelAndView("updateStudentProfile");
		}
			
			 stdservice.updateStudent(student);
		
		
		return  new ModelAndView("updateStudentSuccess");	}
	
	

}
