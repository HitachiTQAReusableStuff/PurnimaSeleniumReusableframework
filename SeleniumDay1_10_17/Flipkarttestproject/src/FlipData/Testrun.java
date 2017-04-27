package FlipData;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testrun {
private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\v-poori\\Desktop\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8008366966");
        driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("rithu@purnima");
         driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
         WebElement w1 =driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
         w1.sendKeys("Fridge");
         Thread.sleep(2000);
         WebElement w2 =driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
         w2.sendKeys("Iphone 7");
         driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();
         List<WebElement> anchors = driver.findElements(By.tagName("a"));
     	Iterator<WebElement> itr = anchors.iterator();
     	while(itr.hasNext()){
     		WebElement link = itr.next();
     		System.out.println(link.getText());
     		if(link.getAttribute("href").contains("Iphone 7")){
     		 link.click();
     			break;
	}

}