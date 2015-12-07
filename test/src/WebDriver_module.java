import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;



public class WebDriver_module {

	public static void Login(String site , WebDriver driver){
		driver.get(" + site + ");
		driver.findElement(By.xpath("//input[@class='btn-sm'][@type='submit']")).click();
	}
	
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		WebDriver firefox = new FirefoxDriver();
		Login("https://itgdev.bluematrix.com/sellside/SupportLogin.action?userNameRemote=majestic1234&passwordRemote=zNqxfjeBCcl&firmIdRemote=28341" , firefox);
		firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Author")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='useNewLayout'][@type='image']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("create-document-button")).click();
		
		WebElement title=driver.findElement(By.id("title"));
		title.sendKeys("test");
		WebElement template = driver.findElement(By.id("template_chosen"));
		template.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		template.findElement(By.xpath("//ul[@class='chosen-results']/li[contains(text(), 'ALERT')]")).click();
		
		WebElement subject = driver.findElement(By.id("subject_chosen"));
		subject.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		subject.findElement(By.xpath("//ul[@class='chosen-results']/li[contains(text(), 'ALERT')]")).click();
		
		WebElement topic = driver.findElement(By.id("topics_chosen"));
		topic.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		topic.findElement(By.xpath("//ul[@class='chosen-results']/li[contains(text(), 'ABC TEST')]")).click();
		
		/*
		WebElement author = driver.findElement(By.id("authorSpan"));
		author.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		author.findElement(By.xpath("//ul[@class='chosen-results']/li[@data-option-array-index='5']")).click();*/
		driver.findElement(By.id("content2")).click();
		
		
		
		
		
	}

}