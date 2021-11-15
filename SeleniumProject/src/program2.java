import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class program2 {
 /*
		1. Launch the https://www.amazon.com/ url
		2. In the search bar type "Selenium books"
		3. Click on search
		4. Click on any one of the results
		5. Refresh the browser
		6. Close the browser
*/


	public static void main(String[] args) {
		
		//1.Launch the https://www.amazon.com/
		
	    //step1> Map BrowserDrivers
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dibas\\Downloads\\softwares\\browserdrivers\\chromedriver.exe");
		
		//step2> Instantiating driver object
		ChromeDriver driver = new ChromeDriver();
		
		//step3> Get Command opens a new browser window and fetches the page that you specify inside its parentheses.
		 driver.get("https://www.amazon.com/");

	//2. the search bar type "Selenium books"
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium books");
		 
	//3. Click on search
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 
	//4. Click on any one of the results	 
		 driver.findElement(By.tagName("div")).click();
		 
	//5. Refresh the browser
		 driver.navigate().refresh();
		 
	//6. Close the browser
	 	 driver.quit();
	}
}
