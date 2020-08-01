package seliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Selenium03ElementsSpiceJet {

    // There are two types of dropdowns
    // 1. Static drop down - the element always start with select tag
    // 2. Dynamic drop down - will not have a select tag
    // Synchronization is a way that we can synchronize the selenium test with our web page
    // We can use wait to achieve synchronization in selenium
    // We have two types of wait
    // 1. implicit - we will give selenium a certain time and it will try it's action after that
    // 2. explicit wait - we will set a certain condition for selenium to try it's action
    // We have a different way to select a dropdown 1. byindex 2. byvalue 3. byvisible text
    // Difference between assert and verify
    // Assert - will stop execution of test if it got any failures
    // Verify - will continue the execution of our test even if there is a failure on the test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nebiy\\OneDrive\\Desktop\\JulyChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//div[@id='wrapper']//ul[1]//li[12]//a[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//ul[1]//li[9]//a[1]")).click();
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();

        WebElement passengerDdl = driver.findElement(By.xpath("//div[@class='paxinfo']"));
        passengerDdl.click();


        // Selecting a drop down by index
        WebElement pcDdl = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
        Select passengerCount = new Select(pcDdl);
        passengerCount.selectByIndex(6);

        // Selecting a drop down by value
        WebElement pChildDdl = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
        Select childPassengerCount = new Select(pChildDdl);
        childPassengerCount.selectByValue("1");

        // Selecting a drop down by visible text
        WebElement pInfantDdl = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
        Select infantPassenger = new Select(pInfantDdl);
        infantPassenger.selectByVisibleText("3");

        WebElement currencyDdl = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select currencyValue = new Select(currencyDdl);
        currencyValue.selectByVisibleText("USD");

        WebElement friendAndFamily = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
        friendAndFamily.click();

        String passengerNumbers = passengerDdl.getText();
        System.out.println(passengerNumbers);

        Assert.assertEquals(passengerNumbers,"7 Adult, 1 Child, 3 Infant");

         boolean checkFriAndFam = friendAndFamily.isSelected();
         System.out.println(checkFriAndFam);
         Assert.assertEquals(checkFriAndFam,true);

         driver.close();
    }
}
