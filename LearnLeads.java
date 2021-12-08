package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLeads {

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
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Type Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		//Type First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("lokesh");
		//Type Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		//Click Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//verify browser title
		String title = driver.getTitle();
		System.out.println(title);
		//to verify company name
		String text = driver.findElement(By.xpath("//span[text()='Company Name']")).getText();
		System.out.println(text);
		//close browser
		driver.close();
      
	}

}

