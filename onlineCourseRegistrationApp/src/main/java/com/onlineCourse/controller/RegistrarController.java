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
import com.onlineCourse.Services.RegistrarService;
import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;
import com.onlineCourse.exceptions.CourseNotFoundException;
import com.onlineCourse.exceptions.RegistrarNotFoundException;

@Controller
public class RegistrarController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private RegistrarService registrarService;
	
	private int initialCourseCapacity=0;
	
	@ModelAttribute("genderList")
	public Map<String,String> genderList(){
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("Male", "MALE");
		map.put("Female", "FEMALE");
	
	    return map;
	}
	
	@GetMapping("/addNewCoursePage")
	public String newCoursePageLaunch(Model model) {
		
		CourseBean course = new CourseBean();
		
		model.addAttribute("insCourse", course);
		
		return "addNewCourse";
	}
	
	@PostMapping("/insertCourse")
	public ModelAndView doInsertCourse(@Valid @ModelAttribute("insCourse") CourseBean course,BindingResult br) {
		
		if(br.hasErrors()) {
			return new ModelAndView("addNewCourse");
		}
		
		CourseBean savedCourse = courseService.insertCourse(course);
		
		ModelAndView mv = new ModelAndView("insertedCourse","course",savedCourse);
        
		return mv;
	}
	
	@GetMapping("/viewCoursePage")
	public String viewCoursePageLaunch(Model model) {
		
		List<CourseBean> courseList = courseService.viewCourses();
		
		model.addAttribute("viewCourse", courseList);
		
		return "viewCourses";
	}
	
	
	@GetMapping("/editCourse/{courseId}")
	public String EditCourse(@PathVariable Integer courseId,Model model) throws CourseNotFoundException {
		
		CourseBean course=courseService.getCourseById(courseId);
		
		initialCourseCapacity =course.getcCapacity();
		
		model.addAttribute("Course",course);
		
		return "editCourseForm";
	}
	

	@PostMapping("/editCoursedDetails")
	public ModelAndView updatedCourse(@Valid @ModelAttribute("Course")CourseBean course,BindingResult br) {
	
	
		   Integer finalCourseCapacity=course.getcCapacity();
		   
		   Integer courseCapacity=finalCourseCapacity-initialCourseCapacity;
		   
		   Integer finalseats=course.getcSeats()+courseCapacity;
		
	       course.setcSeats(finalseats);
         
			if(br.hasErrors()) {
			
			return new ModelAndView("editCourseForm");
		}
			
			else {
				
			  
				 courseService.updateCourse(course);
				
				return new ModelAndView("updateCourseSuccess");  
			
			}
		
        
	}
	
	
	@GetMapping("/updateRegProfile/{registrarId}")
	public String updateRegistrar(@PathVariable Integer registrarId,Model model ) throws RegistrarNotFoundException{
		
		System.out.println(registrarId);
		
		Registrar registrar =  registrarService.getRegistrarById(registrarId);
		
		System.out.println(registrar);
		model.addAttribute("updateRegistrarData", registrar);
		
		return "updateRegistrarPage";
		
		
	}
	
	
	@PostMapping("/updateRegistrar")
	public ModelAndView doUpdateStudent(@Valid @ModelAttribute("updateRegistrarData") Registrar registrar, BindingResult br) {
		
		if(br.hasErrors()) {
			
			return new ModelAndView("updateRegistrarPage");
		}
			
			 registrarService.updateRegistrar(registrar);
		
		
		return  new ModelAndView("updateRegistrarSuccess");	}
	
	
	
}
