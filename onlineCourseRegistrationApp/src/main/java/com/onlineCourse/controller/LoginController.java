package com.onlineCourse.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineCourse.Services.LoginService;
import com.onlineCourse.beans.Admin;
import com.onlineCourse.beans.LoginBean;
import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;

@Controller
public class LoginController {

	 @Autowired
	 private LoginService loginService;
	
	
	
	
	@ModelAttribute("LoginOptions")
	public Map<String, String> genenrateLoginList() {

		Map<String, String> map = new HashMap<String, String>();

		map.put("", "Login As");
		map.put("admin", "Admin");
		map.put("registrar", "Registrar");
		map.put("student", "Student");

		return map;

	}
	
	@GetMapping("/")
	public String launcher()
	{
		return "titlepage";
	}
	
	@GetMapping("/homepage")
	public String homeLauncher(Model model) {
		
	    LoginBean logBean=new LoginBean();
		
		model.addAttribute("LoginData", logBean);
		
		return "home";
	}
	
	@GetMapping("/logout")
	public String logoutLauncher(HttpSession session, Model model) {
		
        session.invalidate();
		
		LoginBean loginBean =new LoginBean();
		
		model.addAttribute("LoginData",loginBean);
		
		
		return "home";
	}
	

	@PostMapping("/login")
	public ModelAndView optionLauncher(@Valid  @ModelAttribute("LoginData") LoginBean loginBean,BindingResult br) {
		
    
		 
		String logOption=loginBean.getLoginoption();
		
		System.out.println(logOption);
		
		
		if(br.hasErrors()) {
			return  new ModelAndView("home");
		}
		
		else {
			
		
        if(logOption.equals("admin")) {
        	
        	Admin admin=loginService.authenticateAdmin(loginBean.getUsername(),loginBean.getPassword());
        	
        	if(admin!=null) {
        	     return  new ModelAndView("adminPage","adminData",admin);
        	}
        	
        	else {
        	   return new ModelAndView("home","flag","Invalid Username or password!!..");
        	}
        
        }
        
        else  if(logOption.equals("student")){
        	
        	 
        	Student stu=loginService.authenticateStudent(loginBean.getUsername(),loginBean.getPassword());
        	
        	if(stu!=null) {
        	return new ModelAndView("studentPage","studentData",stu);
        	}
        	else {
        		return new ModelAndView("home","flag","Invalid Username or password!!..");
        	}
        }
        
        else if(logOption.equals("registrar")) {
        	Registrar registrar=loginService.authenticateRegistrar(loginBean.getUsername(), loginBean.getPassword());
          	
            if(registrar!=null) {
           	 
           	 
         	return new ModelAndView("registrarPage","registratData",registrar);
            }
         	else {
         		return new ModelAndView("home","flag","Invalid Username or password!!..");
        	
        	
         	}
        }
        
        else {
        	
        	return new ModelAndView("home","flag","Must select one option!");
        }
      
		}
		
	        
	}
	
}
	
	