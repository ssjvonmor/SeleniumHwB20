package class01Hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAssignment {
    public static void main(String[] args) {
        /*1. The user should be able to launch a web browser and navigate to the URL `https://www.syntaxprojects.com/`.
2. The user should be able to maximize the browser window
2. The current URL should be printed on the console and match `https://www.syntaxprojects.com/`.
3. The page title retrieved should be printed on the console and match `Syntax - Website to practice Syntax Automation Platform`.
4. The browser should close automatically after retrieving both the URL and title.*/

        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.syntaxprojects.com/");
        driver.manage().window().maximize();
        String currentUrl=driver.getCurrentUrl();
        String title= driver.getTitle();
        System.out.println(currentUrl);
        System.out.println(title);
        driver.close();
    }
}
