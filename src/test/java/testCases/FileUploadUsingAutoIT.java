package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadUsingAutoIT {
	WebDriver driver;

	@Test
	public void fileupload() {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://smallpdf.com/word-to-pdf");
		driver.findElement(By.xpath("//span[@class='omnibox-link']")).click();
		String filepath="C:\\Users\\Rahul\\Desktop\\demo.txt";
		ProcessBuilder pb=new ProcessBuilder("C:\\Users\\Rahul\\Desktop\\AutoIT\\test2.exe",filepath);
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
