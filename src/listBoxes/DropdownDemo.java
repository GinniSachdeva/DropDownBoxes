package listBoxes;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	@Test
	public void ListBoxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\DXC Selenium Automation Class\\DropDownBoxes\\ChromeBrowserJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
	
		//driver.navigate().to("https://www.facebook.com/campaign/landing.php");

		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
/*      month_dd.selectByIndex(3);
		Thread.sleep(10000);
		month_dd.selectByValue("9");
		Thread.sleep(8000);
		month_dd.selectByVisibleText("Aug");
	*/
		//Printing the number of items in the dropdown.
		List<WebElement> month_List = month_dd.getOptions();
		int total_Month = month_List.size();
		System.out.println("Total month count is List Box: " + total_Month);
	//printing each and every data of drop down
		for(WebElement ele: month_List) {
			String month_name = ele.getText();
			System.out.println("Months in list box are: " + month_name);
			
		}
		driver.quit();
	}
	
}
