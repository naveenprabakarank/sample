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

import com.Spring.LoginForm.Beans.Student;

@RestController
public class StudentController {
	@RequestMapping("/")
	public ModelAndView student() {
		return new ModelAndView("index","student",new Student());
	}

	@RequestMapping("/home")
	public String Student(){
		String error=" ";
		try{
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "LoginForm/src/main/resources/chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  

	    // Launch website  
	    driver.navigate().to("http://www.google.com/");  

	    // Click on the search text box and send value  
	    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  

	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click();  }
		catch(Exception e){StringWriter sw = new StringWriter();
 
            // create a PrintWriter
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
 
             error = sw.toString();}
	    return error;
	}
	
}
