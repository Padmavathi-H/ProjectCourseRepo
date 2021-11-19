package com.onlineCourse.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlineCourse.Services.CourseService;
import com.onlineCourse.Services.RegistrarService;
import com.onlineCourse.Services.StudentService;
import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;
import com.onlineCourse.exceptions.RegistrarNotFoundException;

@Controller
public class AdminController {

	@Autowired
	private RegistrarService service;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentService studentService;
	
	@ModelAttribute("genderList")
	public Map<String,String> genderList(){
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("Male", "MALE");
		map.put("Female", "FEMALE");
	
	    return map;
	}
	
	@GetMapping("/addNewRegistrar")
	public String launch(Model model)
	{
	    Registrar logBean=new Registrar();
		
		model.addAttribute("regisData", logBean);
		
		return "NewRegistrar";
	}	
	


	@PostMapping("/insertRegistrar")
	public ModelAndView doRegisterRegistrar(@Valid @ModelAttribute("regisData") Registrar regis,BindingResult br)
	{
		
		if(br.hasErrors())
		{
			return new ModelAndView("NewRegistrar");
		}
		
		Registrar savedRegistrar= service.InsertRegistrar(regis);
		
		ModelAndView mv=new ModelAndView("RegistrarSuccess","regis",savedRegistrar);
		
		return mv;
	}
	
	@GetMapping("/viewCourse")
	public String viewCourselaunch(Model model)
	{	
        List<CourseBean> courseList = courseService.viewCourses();
		
		model.addAttribute("viewCourse", courseList);
		
		return "viewCoursesForAdmin";
	}
	
	@GetMapping("/viewStudent")
	public String viewStudentlaunch(Model model)
	{	
		
        List<Student> studentList = studentService.getAllStudents();
		
		model.addAttribute("viewStudents", studentList);
		
		return "viewAllStudentsPage";
	}
	
	@GetMapping("/viewRegistrar")
	public String getallregistrarsHandler(Model model)
	{
	
		List<Registrar> rlist=service.getAllRegistarDetails();
	
		model.addAttribute("registrarList", rlist);
	
		return "allregistrarlist";
	}
	
	@GetMapping("/deleteRegistrar")
	public String doDeleteRegistrar(@RequestParam("rid") Integer registrarId,Model model) throws RegistrarNotFoundException{
		
		List<Registrar> regiList = service.deleteRegistrarById(registrarId);
		
		model.addAttribute("registrarList", regiList);
		
		return "allregistrarlist";
	}

	
	@GetMapping("/getregistrarbyemail")
	public String getregistrarbyusernameLauncher() {


	return "getregistrarbyemail";

	}


	@PostMapping("/registrardisplay")
	public ModelAndView registrardisplaylaunch(String email) {


	Registrar registrar= service.getRegistrarByEmail(email);


	ModelAndView mv=new ModelAndView("registrarDetails","reg",registrar);

	return mv;

	}
	
	@GetMapping("/viewStudentByCourse")
	public String launchStudentByCourse() {
		
		return "getStudentByCourseName";
		
	}
	
	@PostMapping("/studentByCourse")
	public String studentByCourseLaunch(String courseName,ModelMap map) {
		
		CourseBean course = studentService.getStudentByCourseName(courseName);
		
		List<Student> studentData = course.getStudent();
		
		map.addAttribute("studentdata",studentData);
		
		map.addAttribute("courseName", course);
		
		return "studentByCourseName";
	}
	
	
}
