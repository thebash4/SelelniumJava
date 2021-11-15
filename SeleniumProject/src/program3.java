import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class program3 {
/*	
	 	1. Launch the http://leafground.com/ url
		2. Click on the edit button
		3. In the text field for "Enter your email address" - enter your email address
		4. In the text field for "Append a text and press keyboard tab" - clear the text "Append" which is already in this text field
		5. In the text field for "Get default text entered" get the text already present in this text box and print it on the java console.
*/
	
	public static void main(String[] args) {
		
	//1. Launch the http://leafground.com/ url
		
		//Map BrowserDrivers
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dibas\\Downloads\\softwares\\browserdrivers\\chromedriver.exe");
		
		//create driver object
		ChromeDriver driver = new ChromeDriver();
		
		//Get Command opens a new browser window and fetches the page that you specify inside its parentheses.
		 driver.get("http://leafground.com");
		 
	//2. Click on the edit button 
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
	//3. In the text field for "Enter your email address" - enter your email address
		 
		 driver.findElement(By.id("email")).sendKeys("dibash.chuke1@gmail.com");
	
	//4. In the text field for "Append a text and press keyboard tab" - clear the text "Append" which is already in this text field
		 
		 driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > input[type=text]")).clear();
		 
	//5. In the text field for "Get default text entered" get the text already present in this text box and print it on the java console.
		 
		
		 String val = driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(7) > div > div > input[type=text]")).getAttribute("value");
		 System.out.println("Entered text is:"+ val);
		 
		 
		 
	}
	
	
	
	
	
	
}
