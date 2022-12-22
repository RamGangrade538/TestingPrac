package SwitchCmd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchcmd {
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/test3.html");
		/*driver.findElement(By.cssSelector("input[value='alert']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		driver.findElement(By.cssSelector("input[value='confirm']")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.accept();
		confirm.dismiss();*/
		
		driver.findElement(By.cssSelector("input[value='prompt']")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("EnteryourNmae");
		System.out.println(prompt.getText());
//		prompt.accept();
		
		prompt.dismiss();
		driver.close();
	
	
	}
}