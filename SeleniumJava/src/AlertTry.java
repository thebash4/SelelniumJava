import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertTry {

	public static void main(String[] args) throws InterruptedException {
		
		//Map BrowserDrivers
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dibas\\Downloads\\softwares\\browserdrivers\\chromedriver.exe");
		
		//create driver object
		ChromeDriver driver = new ChromeDriver();
		
		//Get Command opens a new browser window and fetches the page that you specify inside its parentheses.
		 driver.get("http://leafground.com");
		 
		 //Resize current window to the maximum 
		 driver.manage().window().maximize();
		 
		 //linkText locator
		 driver.findElement(By.linkText("Alert")).click();  
		 
		 //xpath locator
		 //driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div[1]/div/div/button")).click();
		 Thread.sleep(3000);
		 
		// Switching to Alert and objectifying alert driver        
	        Alert alert = driver.switchTo().alert();
	        Thread.sleep(3000);
	        
		 //Store the alert message
		 
		 String alertmsg = alert.getText();
		 
		 System.out.println(alertmsg);
		 
		 // Accepting alert		
	        alert.accept();	
	        Thread.sleep(3000);
		
		//Close the browser
	 	 driver.quit();
		
		
	}
	
	
}

/*

1) void dismiss() // To click on the ‘Cancel’ button of the alert==>  driver.switchTo().alert().dismiss();
 
2) void accept() // To click on the ‘OK’ button of the alert==> driver.switchTo().alert().accept();

3) String getText() // To capture the alert message==> driver.switchTo().alert().getText();

4) void sendKeys(String stringToSend) // To send some data to alert box==> driver.switchTo().alert().sendKeys("Text");

*/
