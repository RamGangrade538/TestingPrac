package EroomrentOwnerg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicklinks {
	public class ClickHyperlink {
		public static void main(String [] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.eroomrent.in/index.php");
//			For check total hyper links
			List<WebElement> b= driver.findElements(By.tagName("a"));
			
			int sizeb = b.size();
			System.out.println();
			for(int i=1;i<sizeb;i++)
			{
				WebElement a=b.get(i);
				String c = a.getText();
				System.out.println(c);	
			}
//			For click all hyper link on menu bar
			WebElement Clic = driver.findElement(By.xpath("//*[@id=\'collapsibleNavbar\']"));
			System.out.println(Clic.findElements(By.tagName("a")).size());
			
			for(int i= 01;i<Clic.findElements(By.tagName("a")).size();i++) {
				String	Opentab = Keys.chord(Keys.CONTROL,Keys.ENTER);
				Clic.findElements(By.tagName("a")).get(i).sendKeys(Opentab);
			}
			
			
			
		}
	}
}
