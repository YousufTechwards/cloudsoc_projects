import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class remediation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//Users//macbook//Desktop//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://eoe.elastica-inc.com/static/ng/appForensics/index.html#/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("yousuf.masood@broadcom.com");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("Techwards@123123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		Thread.sleep(15000);

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[2]/div/ul/li[3]/div/ul[1]/li[1]/a")).click();
		
		Thread.sleep(15000);
		
		WebElement files_div = driver.findElement(By.xpath("//div[@class=\"slick-viewport\"]"));
		
		Thread.sleep(5000);
		
		
		List<WebElement> all_files = files_div.findElements(By.xpath("//div[@role=\"row\"]"));
		
		for(WebElement elem :all_files) {
		   
			Thread.sleep(3000);
		   if (elem.findElements(By.xpath("//span[@tooltip-title=\"HIPAA\"]")).size() != 0) {
				
			   
			   elem.findElement(By.xpath("//span[@tooltip-title=\"HIPAA\"]")).click();
			} 
		   else {
				System.out.println("Element doesn't exist");
			}
		}
		Thread.sleep(15000);	
		
		driver.findElement(By.linkText("Remediations")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter folder path\"]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//span[normalize-space()='Move with tombstone']")).click();
		
		driver.findElement(By.xpath("//div[@class='e-multi-purpose-dd list-dropdown ng-empty']//button[@type='button']")).click();
		
		//Thread.sleep(1000);
		
		//WebElement dd_elem = driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]"));
		//List <WebElement> dd_list_items = dd_elem.findElements(By.tagName("li"));
		
//		dd_list_items.get(0).findElement(By.tagName("a")).click();
		
////		dd_list_items.size()
//		System.out.println("Size of list = "
//                + dd_list_items.size());
//		for ( WebElement a : dd_list_items) {
//			System.out.println(a);
//		}
//		System.out.println(dd_list_items);
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='Move Document']")).click();
	}

}
