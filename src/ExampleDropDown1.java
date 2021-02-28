


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleDropDown1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha\\OneDrive\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		
		//driver.findElement(By.id("job_role")).sendKeys("Architect/CTO");
		
		WebElement ddOption=driver.findElement(By.id("job_role"));
		Select s=new Select(ddOption);
		
		// s.selectByIndex(3);
		// s.selectByValue("IT Manager/Executive");
		
		// s.selectByVisibleText("Business Manager/Executive");
		
		List<WebElement> ddOptionsList=s.getOptions();
		System.out.println("total values in the list are:" +ddOptionsList.size());
		
		for(int i=0; i<ddOptionsList.size();i++) {
			String ddText=ddOptionsList.get(i).getText();
			System.out.println("value is:" +ddText);
			
		}
		
		Thread.sleep(6000);
		driver.quit();
		
		
	}

}
		