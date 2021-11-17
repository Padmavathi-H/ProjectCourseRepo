package com.onlineCourse.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.onlineCourse.Services.RegistrarService;
import com.onlineCourse.beans.Registrar;

@Controller
public class AdminController {

	@Autowired
	private RegistrarService service;
	
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
	
	
	
}
