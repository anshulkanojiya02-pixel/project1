import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class fin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
//        List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"nav-hamburger-menu\"]"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      WebElement res=driver.findElement(By.xpath("(//a[@class='hmenu-item' and contains(.,'Fire TV')])[1]"));
//        String num=links.get(3).getText();
//        System.out.println(num);

        System.out.println(res);
        res.click();
    }
}
