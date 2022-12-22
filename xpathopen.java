package Kapil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//			C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe
			


public class xpathopen {
	public static void main(String []args) {
		
		System.out.println("Hello kapil selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//Launch Chrome
		
		driver.get("https://www.eroomrent.in/reg.php/");	
		String title = driver.getTitle(); //	get title

		//1. Xpath : locator   ---2nd priority
//		absolute xpath should not be used
//		only relative xpath should be used
		
		
//		driver.findElement(By.xpath("txtfname")).sendKeys("Tom");
//		driver.findElement(By.xpath("txtmobile")).sendKeys("8602797437");
		
//		2. throw id locator  ----1 prioroty
//		driver.findElement(By.id("txtfname")).sendKeys("Tom");
//		driver.findElement(By.id("txtmobile")).sendKeys("8602797437");

		
		//		3. name  -------3rd
		
//		driver.findElement(By.name("txtfname")).sendKeys("Peter");
//		driver.findElement(By.name("txtmobile")).sendKeys("7415545448");
		
//		4. linktext locator   ----------for link 1st
//		((WebElement) driver.findElements(By.linkText("reg.php"))).click();
		
//		5.partiallinktext
//		this is not usefull
//		driver.findElement(By.partialLinkText(title)).click();
		
//		6. CSS selector --------2nd
//		if id is there ----#(id)
//		if class is there ---- .(class)
		driver.findElement(By.cssSelector("#txtfname")).sendKeys("Peter");
	
//		7. class name :not useful
		driver.findElement(By.className("")).click();
	
	}
	
}