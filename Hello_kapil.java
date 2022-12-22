package Kapil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//			C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe
			


public class Hello_kapil {
	public static void main(String []args) {
		
		System.out.println("Hello kapil selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	//Launch Chrome
		
		driver.get("https://www.google.com/");	
		String title = driver.getTitle(); //	get title
//			Validation point
		if(title.equals("Eroomrent")){
		System.out.println("Correct Title");}
		else
			System.out.println("InCorrect Title");
		
		// for print current URL also
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());  //for page source information
		driver.close();
	}
	
}
