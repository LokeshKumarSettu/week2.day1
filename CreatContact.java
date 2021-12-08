package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatContact {

	public static void main(String[] args) {
		
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
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Type First Name
		driver.findElement(By.className("inputBox")).sendKeys("lokesh");
		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("kumar");
		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		//Print the first name and browser title
		String title = driver.getTitle();
		System.out.println(title);
		String text = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println(text);
		//Close the browser
		driver.close();
	}

}