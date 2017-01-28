import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String baseDirPath = System.getProperty("user.dir");
		String chromeServerPath = baseDirPath + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeServerPath);
	
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://wikipedia.org");
		
	}

}
