package listBoxes;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Exercise {
	@Test
	public void xyz() {
		System.setProperty("webdriver.chrome.driver", "C:\\DXC Selenium Automation Class\\DropDownBoxes\\ChromeBrowserJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/campaign/landing.php");
		
		WebElement date_Dropdown = driver.findElement(By.id("day"));
		Select date_dd = new Select(date_Dropdown);
		//date_dd.selectByIndex(11);
		//Thread.sleep(10000);
		date_dd.selectByValue("12");
		//Thread.sleep(8000);
		WebElement year_Dropdown = driver.findElement(By.id("year"));
		Select year_dd = new Select(year_Dropdown);
		year_dd.selectByVisibleText("2022");
		List<WebElement> day_List = date_dd.getOptions();
		int total_days = day_List.size();
		System.out.println("Total days in List Box: " + total_days);
	}

}
