package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://selenium webdriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		System.out.println("New Request-2, New push from git in the eclipse workspace");
	}
}
