package AutomateFileUploadProcess;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alternate1 
{
	static WebDriver driver;	
	public static void main(String[] args) throws Exception 
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
    	System.setProperty("webdriver.chrome.driver" , projectpath+"\\src\\main\\java\\ChromeDrivers\\chromedriver.exe");    	
    	driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/compress_pdf");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement ck =driver.findElement(By.xpath("//span[contains(text(),'Select PDF files')]"));
        ck.click();
        Thread.sleep(5000);
        StringSelection str = new StringSelection("C:\\Users\\user\\Desktop\\sample.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);     
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(7000);	
        Thread.sleep(15000);
        driver.findElement(By.id("processTask")).click();
	}
}
