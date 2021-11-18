package com.onlineCourse.controller;

import java.util.List;

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
import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.exceptions.CourseNotFoundException;

@Controller
public class RegistrarController {
	
	@Autowired
	private CourseService courseService;
	
	
	
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
		
		model.addAttribute("Course",course);
		
		return "editCourseForm";
	}
	

	@PostMapping("/editCoursedDetails")
	public ModelAndView updatedCourse(@Valid @ModelAttribute("Course")CourseBean course,BindingResult br) {
	
         
			if(br.hasErrors()) {
			
			return new ModelAndView("editCourseForm");
		}
			
			else {
			  
				courseService.updateCourse(course);
				
				return new ModelAndView("updateCourseSuccess");  
			
			}
		
/*
			else {
       
				CourseBean correctionBean=courseService.updateCourse(course);
        
              if(correctionBean.getC_Capacity()==course.getC_Capacity()) {
        	
            	  return new ModelAndView("editCourseForm","flag","Capacity can not be decreased!..");       	   
             }
        
              else {	
        	 
            	  return new ModelAndView("updateCourseSuccess");   	
             }
        
			}
			
			*/
        
	}
	
	
	
	
	
}
