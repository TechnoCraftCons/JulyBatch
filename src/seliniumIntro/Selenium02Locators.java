package seliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02Locators {

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\nebiy\\OneDrive\\Desktop\\JulyChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://eaapp.somee.com/");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("Register")).click();
            driver.findElement(By.name("UserName")).sendKeys("myUserName");
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("myPassWord");
            driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("myPassWord12");
            driver.findElement(By.id("Email")).sendKeys("myEmail@email.com");
            driver.findElement(By.className("btn-default")).click();

           String footerText = driver.findElement(By.xpath("//html//body//div//footer//p")).getText();
           System.out.println(footerText);

    }
}
