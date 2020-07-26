package seliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleinium01Basics {


    public static void main(String[] args) {

        // We're setting the property for selenium which browser to open
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nebiy\\OneDrive\\Desktop\\JulyChromeDriver\\chromedriver.exe");
        // We are creating an object of Webdriver
        WebDriver driver = new ChromeDriver();

        // get method will expect the url that we want to open and it will open it for us
        driver.get("https://www.facebook.com/");

        // It will maximize our browser window
        driver.manage().window().maximize();

        // getTitle will get us the title of the web app
       String title = driver.getTitle();
       System.out.println(title);

       String url = driver.getCurrentUrl();
       System.out.println(url);

       driver.findElement(By.id("email")).sendKeys("Majisha");

       driver.findElement(By.linkText("Forgot account?")).click();
        String urlForgot = driver.getCurrentUrl();
        System.out.println(urlForgot);
        //driver.close();
    }
}
