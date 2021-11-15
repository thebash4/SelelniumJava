

//Import Packages
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver; 

//Declare Class
public class LaunchApp {

	//Declare Method
public static void main(String[] args) {
	
	//Map BrowserDrivers
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dibas\\Downloads\\softwares\\browserdrivers\\chromedriver.exe");
	
	//create driver object
	ChromeDriver driver = new ChromeDriver();
	
	//Get Command opens a new browser window and fetches the page that you specify inside its parentheses.
	 driver.get("http://leafground.com");
	 
	 //Resize current window to the maximum 
	 driver.manage().window().maximize();
	 
	 //The click() method is used to simulate the clicking of any element
	 
	 //linkText locator
	 driver.findElement(By.linkText("Button")).click();  
	 
	 //By ID locator
	 driver.findElement(By.id("home")).click();
	 
	//Close the browser
 	 driver.quit();
	 
}


	

}
