package class01Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommandsPractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        WebElement customAtt=driver.findElement(By.xpath("//div[@data-text-attr='This is a custom attribute value']"));
        String attVal=customAtt.getAttribute("data-text-attr");
        System.out.println(attVal);
        WebElement mealOpt=driver.findElement(By.xpath("//input[@value='music_festival']"));
        WebElement mealOpt2=driver.findElement(By.xpath("//input[@value='tech_talk']"));
        WebElement mealOpt3=driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        WebElement button=driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        boolean isMeal= mealOpt.isEnabled();
        boolean isMeal2= mealOpt2.isEnabled();
        if (isMeal&&!isMeal2){
            mealOpt.click();
            button.click();
            boolean isMeal3=mealOpt3.isDisplayed();
            if (isMeal3){
                mealOpt3.click();
            }
        }
        WebElement tb=driver.findElement(By.xpath("//input[@id='inputField']"));
        tb.clear();

    }
}
