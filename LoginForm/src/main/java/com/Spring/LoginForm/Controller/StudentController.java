package com.Spring.LoginForm.Controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.LoginForm.Beans.Student;

@RestController
public class StudentController {
	@RequestMapping("/")
	public ModelAndView student() {
		return new ModelAndView("index","student",new Student());
	}

	@RequestMapping("/home")
	public String Student(){
		
		Runtime rt = Runtime.getRuntime();
		try{
		rt.exec(new String[]{"cmd.exe","/c","start"});}
		catch(Exception e){e.printStackTrace();}
		return "Success";
	}
	
}
