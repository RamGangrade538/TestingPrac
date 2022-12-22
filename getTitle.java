package Kapil;
//Create Script to get the title of the Current Web Page?
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class getTitle {
	public static void main(String []args) {
		
		System.out.println("Hello kapil selenium");
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	    String title = driver.getTitle();
	    System.out.print(title);
	    
	    if(title.equals("newtour")){
			System.out.println("Correct Title");}
			else
				System.out.println("InCorrect Title");
	    driver.close();
	}
}