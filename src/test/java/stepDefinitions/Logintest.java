package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	public WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/";
	@Given("launch application")
	public void launch_application() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	@When("Enter Username")
	public void enter_Username() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
	}
	@When("Enter Password")
	public void enter_Password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	
	@When("click Login")
	public void click_Login(){
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
		@Then("Homepage Display")
		public void homepage_Display() throws Exception {
			Thread.sleep(2000);
		}
			
			@Then("Click PIM empmodule")
			public void click_pim_empmodule() throws Exception {
				driver.findElement(By.xpath("//a[contains(@href,'pim')]")).click();
				
				Thread.sleep(2000);
			
				
			String acrRes=driver.getCurrentUrl();
			if(acrRes.contains("pim"))
			{
				System.out.println("Valid credentials");
			}
			else
			{
				System.out.println("Invalid credentials");
			}
				
	}

	}
