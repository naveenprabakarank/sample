package com.Spring.LoginForm.Controller;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import java.io.IOException;
import java.io.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.Spring.LoginForm.Beans.Student;

@RestController
public class StudentController {
	@RequestMapping("/")
	public ModelAndView student() {
		return new ModelAndView("index","student",new student());
	}

	@RequestMapping("/home")
	public String Student(){
		
		try{
		WebDriver driver = new HtmlUnitDriver();
        
			     // Navigate to Google		
		   driver.get("http://www.google.com");					

			 // Locate the searchbox using its name		
		
			// This code will print the page title		
		  System.out.println("Page title is: " + driver.getTitle());		

		  driver.quit();}
		catch(Exception e){
		}
		return "Success";
	}	
		
	
}
