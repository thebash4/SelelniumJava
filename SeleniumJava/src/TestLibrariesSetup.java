import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class TestLibrariesSetup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dibas\\Downloads\\softwares\\browserdrivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Users\\dibas\\Downloads\\softwares\\browserdrivers\\msedgedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		
		 EdgeDriver edriver = new EdgeDriver();
		edriver.get("https://www.bing.com");

	}

}
