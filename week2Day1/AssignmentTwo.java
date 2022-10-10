package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement CRMlink = driver.findElement(By.linkText("CRM/SFA"));
		CRMlink.click();
		
		WebElement leadslink = driver.findElement(By.linkText("Leads"));
		leadslink.click();
		
		WebElement lead = driver.findElement(By.linkText("Create Lead"));
		lead.click();
		
		
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Capgemini");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Priyanka");
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Ganesan");
		
		WebElement fnlocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fnlocal.sendKeys("Priya");
		
		WebElement Dept = driver.findElement(By.id("createLeadForm_departmentName"));
		Dept.sendKeys("Testing");
		
		WebElement Desc = driver.findElement(By.id("createLeadForm_description"));
		Desc.sendKeys("Testleaf");
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("priyankabuvana3@gmail.com");
		
		WebElement leadbtn = driver.findElement(By.className("smallSubmit"));
		leadbtn.click();
		
		
		  WebElement edit = driver.findElement(By.className("subMenuButton"));
		  edit.click();
		  
		  WebElement Desc1 = driver.findElement(By.id("createLeadForm_description"));
		  Desc1.clear();
		  
		  WebElement note = driver.findElement(By.className("inputBox"));
		  note.sendKeys("test");
		  
		  WebElement update = driver.findElement(By.name("submitButton"));
		  update.click();
		  
		String title = driver.getTitle(); 
		 System.out.println(title);
		 
		
		
		
		
		
		
		
		
		

	}

}
