package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();

//        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.get("https://amazon.com/");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//      WebElement search= driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div//a"));
//        List<WebElement> link=driver.findElements(By.xpath("//*[@id=\"PageList1\"]/div//a"));
//      System.out.println(search.getText());
//      System.out.println(link.size());
//     System.out.println(search.isEnabled());
//     driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
//     WebElement male= driver.findElement(By.xpath("//*[@id=\"male\"]"));
//     System.out.println(male.isSelected());
//     driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.navigate().to("https://flipkart.com/");
//        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("anshul");
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("anshul@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
//       String my= driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement firetv= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Fire TV')]/ancestor::a")));
//                firetv.click();
//        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/div[1]/section[2]/ul/li[2]/a")).click();
//        List<WebElement> link=driver.findElements(By.xpath("//*[@id=\"hmenu-content\"]/div[1]/section[2]/ul"));
////        Select drop=new Select(link.get(0));
////        drop.selectByVisibleText("Fire TV");
//        System.out.println(link.size());
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://demoqa.com/text-box");
driver.navigate().to("https://demoqa.com/text-box");
    }
    }
