package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.gecko.driver", "geckodriver2");

				// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				
				String url = "https://ajmason20.github.io/";

		        //Launches Personal Website
				driver.get(url);
				
				//Fetches the title of current page
				String title = driver.getTitle();
				
				//Fetches the length of the current page title.
				int titleLength = driver.getTitle().length();
			
		 
		        // Print title and length of title
		        System.out.println(title);
		        System.out.println(titleLength);
		        
		        // Gets string representing current URL
		        String actualUrl = driver.getCurrentUrl();
		        
		        //Verifies if actual URL matches with expected URL
		        if( actualUrl.equals(url)){
		        	System.out.println("Verification successful - correct URL loaded");
		        } else {
		        	System.out.println("Verification failed - incorrect URL loaded");
		        	System.out.println("Expected URL is" + url);
		        	System.out.println("Actual URL is" + actualUrl);
		        }
		        
		        String pageSource = driver.getPageSource();
		        int sourceCodeLength = pageSource.length();
		        
		        System.out.println(sourceCodeLength);
		 
				//Wait for 5 Sec
				Thread.sleep(5);
				
		        // Close the driver
//		        driver.quit();

	}

}
