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

	@RequestMapping(value="/home", method = RequestMethod.POST)
	public ModelAndView home(@ModelAttribute("student")Student student) {
		String name=student.getName();
		String id=Integer.toString(student.getId());
		String age=Integer.toString(student.getAge());
		System.out.println(name+" "+age+" "+id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.addObject("id", id);
		return mv;
	}
	
}
