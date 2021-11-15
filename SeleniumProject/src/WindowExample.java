import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowExample {
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
	 driver.findElement(By.linkText("Window")).click();
	 
	 
	 //getWindowHandle()--> retrieve the handle of the parent page (a unique identifier)
	 
	String ParentHandle =driver.getWindowHandle();
	System.out.println ("parent window unique id: " + ParentHandle);
	 
	//getWindowHandles()-->retrieve a set of handles of the all the pages available
	 driver.findElement(By.id("home")).click();
	 Set<String> AllHandle =driver.getWindowHandles();
	 System.out.println ("Parent and child window unique id: " + AllHandle);
	 
	//get window handle of just the second window
	 Iterator<String> iterate = AllHandle.iterator();
	 iterate.next();
	 String second_window = iterate.next();
	 System.out.println ("child window unique id: " + second_window);
	 
	 //work on second window
	 driver.switchTo().window(second_window);
	 driver.findElement(By.linkText("Image")).click();
	 Thread.sleep(2000);
	 driver.close();;
	
	//multiple windows
	 driver.switchTo().window(ParentHandle);
	 driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > button")).click();
	 Set<String> Newhandles =driver.getWindowHandles();
	 Iterator<String> newiterate = Newhandles.iterator();
	 newiterate.next();
	 newiterate.next();
	 String third_window = newiterate.next();
	 System.out.println ("third window unique id: " + third_window);
	
	}

	
	
}
