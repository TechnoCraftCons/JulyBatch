package seliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium04DropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nebiy\\OneDrive\\Desktop\\JulyChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/nebiy/OneDrive/Desktop/MybeautifulWebSite.html");
        WebElement myDropDown = driver.findElement(By.id("myFruit"));

        Select myDdl = new Select(myDropDown);
        //myDdl.selectByValue("fruit2");
        //myDdl.selectByIndex(2);
        myDdl.selectByVisibleText("Apple");
    }
}
