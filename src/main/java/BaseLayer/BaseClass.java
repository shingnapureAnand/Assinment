package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static WebDriver driver;
	protected static Properties prop;
//	public BaseClass()
//	{
//		prop=new Properties();
//		FileInputStream fis;
//		try {
//		 fis=new FileInputStream(System.getProperty("user.dir")+"//ConfigLayer//cofig.properties");
//		 prop.load(fis);	
//		}
//		catch(Exception e)
//		{
//				
//			e.printStackTrace();
//		}
//		
//	}
	public static void initialization()
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//AllDriver//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	 driver.manage().deleteAllCookies();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	

}
}