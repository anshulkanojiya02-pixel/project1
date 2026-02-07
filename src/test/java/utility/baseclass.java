package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
    public static WebDriver driver;

    public void setup() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }
}