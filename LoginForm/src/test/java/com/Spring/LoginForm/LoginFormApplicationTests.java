package com.Spring.LoginForm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest
class LoginFormApplicationTests {

	@Test
	void contextLoads() {
		 WebDriverManager.chromedriver().setup();
		    

		  
	        WebDriver driver = new ChromeDriver();

	    

	        driver.get("https://google.com");
	        String title = driver.getTitle();
	        System.out.print(title);
			
	        driver.quit();
	}

}
