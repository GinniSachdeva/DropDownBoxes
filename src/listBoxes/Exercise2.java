package listBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Exercise2 {
	@Test
	public void abc() {
		System.setProperty("webdriver.chrome.driver", "C:\\DXC Selenium Automation Class\\DropDownBoxes\\ChromeBrowserJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement a_dd = driver.findElement(By.id("dropdown1"));
		Select a_dd1 = new Select(a_dd);
		a_dd1.selectByValue("2");
		
	}

}
