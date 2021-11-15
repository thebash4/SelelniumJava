import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	
	public class AlertExample {
	    public static void main(String[] args) throws InterruptedException {
	        
	    	//launch url
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\dibas\\workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	         String baseUrl  ="http://leafground.com/home.html";
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //250 ms
	         driver.navigate().to(baseUrl); // driver.get(baseUrl);
	         // driver.navigate().back();  driver.navigate().forward();
	         driver.manage().window().maximize(); 
	         WebDriverWait wait = new WebDriverWait(driver,30);
	         WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Alert")));
	         element.click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	         Thread.sleep(3000);
	         Alert alert = driver.switchTo().alert();
	         alert.accept(); // alert.dismiss()  alert.getText()
	         Thread.sleep(3000);
	         driver.close();
	    }

	
	
	
}  

