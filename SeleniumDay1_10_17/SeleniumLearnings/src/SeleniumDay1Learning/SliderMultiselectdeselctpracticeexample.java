package SeleniumDay1Learning;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SliderMultiselectdeselctpracticeexample {
private WebDriver driver;

	@Test
	public void Slider() {
		driver= new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
	}
	}


