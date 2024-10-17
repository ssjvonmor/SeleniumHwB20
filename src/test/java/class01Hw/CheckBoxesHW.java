package class01Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");
        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        if (newsLetter.isEnabled()) {
            newsLetter.click();
        }
        List<WebElement> hobbis = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement CBHobbies : hobbis) {
            if (CBHobbies.getAttribute("value").equalsIgnoreCase("Reading") || CBHobbies.getAttribute("value").equalsIgnoreCase("Cooking")) {
                CBHobbies.click();
            }
        }
        WebElement supCB = driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement musCB = driver.findElement(By.xpath("//input[@value='Music']"));
        WebElement showCB = driver.findElement(By.xpath("//button[text()='Show/Hide Interests Section']"));
        if (!supCB.isDisplayed() && !musCB.isDisplayed()) {
            showCB.click();
            Thread.sleep(1000);
            musCB.click();
        }
        WebElement rNoti = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        WebElement enableCB = driver.findElement(By.xpath("//button[text()='Enable Checkboxes']"));
        if (!rNoti.isEnabled()) {
            enableCB.click();
            rNoti.click();
        }


    }
}
