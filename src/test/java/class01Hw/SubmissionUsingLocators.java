package class01Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmissionUsingLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/locator-homework.php");
        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("John doe");
        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("JohnDoegmail.com");
        email.sendKeys("JohnDoe@gmail.com");
        WebElement cName=driver.findElement(By.name("ClientName"));
        cName.sendKeys("John");
        WebElement cId=driver.findElement(By.name("ClientId"));
        cId.sendKeys("123");
        WebElement cFId=driver.findElement(By.id("ClientfeedbackId"));
        cFId.sendKeys("askaakak");
        WebElement pId=driver.findElement(By.id("ProjectNameId"));
        pId.sendKeys("Selenium");
        WebElement pTime=driver.findElement(By.id("ProjectTimeId"));
        pTime.sendKeys("1/21/25");
        WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("Va, 20115");
        WebElement pAdd=driver.findElement(By.name("PermanentAddress"));
        pAdd.sendKeys("USA, 2024");
        WebElement btn=driver.findElement(By.id("btn-submit"));
        btn.click();
        WebElement link=driver.findElement(By.linkText("Click Here."));
        link.click();
        ////



    }
}
