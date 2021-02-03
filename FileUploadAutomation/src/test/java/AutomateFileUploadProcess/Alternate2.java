package AutomateFileUploadProcess;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alternate2 
{
	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		String projectpath = System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver" , projectpath+"\\src\\main\\java\\MirketaProject\\MirketaProject\\Mirketa Drivers\\chromedriver.exe");    	
    	driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/compress_pdf");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement ck =driver.findElement(By.xpath("//span[contains(text(),'Select PDF files')]"));
        ck.click();
        Thread.sleep(5000);
        //You must know how to use AutoIT 
        //Compile the aut file then automatically file will be convtered to the .exe file
        Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\Hello.exe");
        Thread.sleep(15000);
        driver.findElement(By.id("processTask")).click();
	}
}
