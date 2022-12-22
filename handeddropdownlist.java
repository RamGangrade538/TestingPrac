package Kapil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handeddropdownlist {
		public static void main(String []args) {
			
			System.out.println("Hello kapil selenium");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	//Launch Chrome
			
			driver.get("https://www.eroomrent.in/index.php/");	
			String title = driver.getTitle(); //	get title
			
			Select select = new Select(driver.findElement(By.id("cat")));
			select.selectByVisibleText("Hostel");
			
			Select select1 = new Select(driver.findElement(By.name("ddlsubcat")));
			select1.selectByVisibleText("Boys");
			
			Select select2 = new Select(driver.findElement(By.id("location")));
			select2.selectByVisibleText("LIG");
			
			driver.findElement(By.className("btn-one w-100")).click();
			
//			error is available have solve first
			
	}

}
