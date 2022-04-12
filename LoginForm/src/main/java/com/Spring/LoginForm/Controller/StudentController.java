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
		WebDriver driver = new HtmlUnitDriver();
        
			     // Navigate to Google		
		   driver.get("http://www.google.com");					

			 // Locate the searchbox using its name		
		   WebElement element = driver.findElement(By.name("q"));	

		  // Enter a search query		
		  element.sendKeys("Guru99");	

		  // Submit the query. Webdriver searches for the form using the text input element automatically		
		  // No need to locate/find the submit button		
		  element.submit();			

			// This code will print the page title		
		  System.out.println("Page title is: " + driver.getTitle());		

		  driver.quit();
		return "Success";
		
		
	
}
