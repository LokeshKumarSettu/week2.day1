package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
        //Enter UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        //Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
        //Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		//Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		//Find Contacts
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Type email as babu@testleaf.com
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		//Click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		//Close the browser
		driver.close();
		

	}

}



