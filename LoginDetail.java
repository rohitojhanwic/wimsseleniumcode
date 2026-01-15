package WimsProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDetail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
    	
			WebDriver driver = new FirefoxDriver();

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://stg.nwic.in/wims/login.xhtml"); //open WIMS url

			Thread.sleep(1000);

	        // Fill username and password
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testing"); //enter username
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rohit@12345"); //enter password
	        Thread.sleep(10000);

	        driver.findElement(By.id("j_idt36")).click(); //click on the login button
	        Thread.sleep(2000); // Wait for the login to complete
	        
	        driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/ul/li[4]/a")).click(); //select Network Monitoring Management Tab
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div[2]/a/h5")).click(); //select Station Management
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click(); //click on the Add Station button
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("stationForm:hisAgency_label")).click(); // Open Agency dropdown
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//li[@id='stationForm:hisAgency_28']")).click(); // Select "Irrigation and Flood Control Department, Kashmir" from dropdown
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"stationForm:stationType\"]/tbody/tr[2]/td/div/div[2]/span")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"stationForm:telemetric\"]/div[2]/span")).click();
	        Thread.sleep(2000);
	}

}

