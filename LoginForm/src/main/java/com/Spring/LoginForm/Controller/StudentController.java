package com.Spring.LoginForm.Controller;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import java.io.IOException;
import java.io.*;
import java.lang.Exception;
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
		return new ModelAndView("index","student",new Student());
	}

	@RequestMapping("/home")
	public String Student() throws Exception{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        	String title = driver.getTitle();
		return title;
		
	}	
		
	
}
