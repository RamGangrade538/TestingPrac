package Kapil;
//2)   Automation script to check that title is equal or not?

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleEquals {

	public static void main(String []args) {
		
		System.out.println("Hello kapil selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eroomrent.in");
		String s = driver.getTitle();
		System.out.println("Title is "+s);
				if(s.length()>60)
				{
					System.out.println("Title is Invalid");
				}
				else
				{
					System.out.println("Title is valid");
				}
	}
}
