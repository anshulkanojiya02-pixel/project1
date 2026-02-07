package pages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Reachloginpage extends baseclass {
    public static String Practice_xpath = "(//a[contains( text(), 'Practice')])[1]";
    public static String Test_loginpage_xpath = "//a[contains( text(), 'Test Login Page')]";
    public static String testexception_xpath = "//a[contains(text(),'Test Exceptions')]";
    public static String testexceptiontext = "//h2[contains(text(),'Test Exceptions')]";
    public static String addbutton_xpath = "//button[@id='add_btn']";
    public static String add2ndrow = "(//input[@class='input-field'])[2]";
    public static String Savebutton_xpath = "(//button[@name='Save'])[2]";
    public static String verifyadd = "//*[@id='confirmation']";
    public static String testtable_xpath = "//a[contains(text(),'Test Table')]";
    public static String selectjava_xpath = "//input[@type='radio' and @value='Java']";
    public static String uncheckinter_xpath = "//input[@name='level' and @value='Intermediate']";
    public static String uncheckadv_xpath = "//input[@name='level' and @value='Advanced']";
    public static String beginner_xpath = "//td[contains(text(),'Beginner')]";
    public static String beginnername_xpath = "//td[contains(text(),'Beginner')][1]";
    public static String Advanced_xpath = "//td[contains(text(),'Advanced')]";
    public static String Intermediate_xpath = "//td[contains(text(),'Interemediate')]";
    public static String dropdown_xpath = "//div[@class='dropdown-button']";
    public static String select_1000 = "//li[@role='option'][3]";
    public static String Enrollments = "//td[@data-col='enrollments']";
    public static String selectpython_xpath = "//input[@type='radio' and @value='Python']";
    public static String uncheckbeg_xpath = "//input[@name='level' and @value='Beginner']";
    public static String verfrec_xpath = "//div[contains(text(),'No matching courses.')]";
    public static String reset_xpath = "//button[contains(text(),'Reset')]";
    public static String reset_lang_xpath = "//input[@value='Any']";
    public static String reset_level1_xpath = "//input[@value='Beginner']";
    public static String reset_level2_xpath = "//input[@value='Advanced']";
    public static String reset_level3_xpath = "//input[@value='Intermediate']";
    public static String reset_enroll_xpath = "//span[contains(text(),'Any')]";
    public static String sort_xpath = "//Select[@id='sortBy']";
    public static String sortoption_xpath = "//Select[@id='sortBy']";

    public void openwebsite() throws InterruptedException {
        setup();
        driver.get("https://practicetestautomation.com/");
        Thread.sleep(4000);
    }

    public void clickonpractice() throws InterruptedException {
        driver.findElement(By.xpath(Practice_xpath)).click();
        Thread.sleep(3000);
    }

    public void clickonTestlogin() throws InterruptedException {
        driver.findElement(By.xpath(Test_loginpage_xpath)).click();
        Thread.sleep(3000);
    }

    public void takescreenshot() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\hp\\Pictures\\anshul.jpg"));
    }

    public void clickexception() {
        driver.findElement(By.xpath(testexception_xpath)).click();
    }

    public void gettextexception() {
        driver.findElement(By.xpath(testexceptiontext)).getText();
    }

    public void addnewrow() throws InterruptedException {
        driver.findElement(By.xpath(addbutton_xpath)).click();
    }

    public void verifyrow2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(add2ndrow))
        );

        driver.findElement(By.xpath(add2ndrow)).sendKeys("Burger");
    }

    public void savebutton() {
        driver.findElement((By.xpath(Savebutton_xpath))).click();
    }

    public void verifyadded() {
        String verifytext = driver.findElement(By.xpath(verifyadd)).getText();
        System.out.println(verifytext);
    }

    public void testtable() {
        driver.findElement(By.xpath(testtable_xpath)).click();
    }

    public void selectjava() {
        driver.findElement(By.xpath(selectjava_xpath)).click();
    }

    public void uncheck() {
        driver.findElement(By.xpath(uncheckinter_xpath)).click();
        driver.findElement(By.xpath(uncheckadv_xpath)).click();
    }

    public void beginner() {
        String name = driver.findElement(By.xpath(beginnername_xpath)).getText();
        int visiblecount = 0;
        if (name.equals("Beginner")) {
            List<WebElement> element = driver.findElements(By.xpath(beginner_xpath));
            for (WebElement Row : element) {
                if (Row.isDisplayed()) {
                    visiblecount++;
                }
            }
            System.out.println(visiblecount);
            System.out.println("Only beginner element visible");
        }
        if (name.equals("Advanced")) {
            List<WebElement> adv = driver.findElements(By.xpath(Advanced_xpath));
            System.out.println(adv.size());
            System.out.println("only Advanced element visible");
        }
        if (name.equals("Intermediate")) {
            List<WebElement> Int = driver.findElements(By.xpath(Intermediate_xpath));
            System.out.println(Int.size());
            System.out.println("only Intermediate element visible");
        }
    }

    public void dropdown() {
        driver.findElement(By.xpath(dropdown_xpath)).click();
        driver.findElement(By.xpath(select_1000)).click();
    }

    public void enrollmentverify() {
        int visiblecount = 0;
        List<WebElement> element = driver.findElements(By.xpath(Enrollments));
        for (WebElement Row : element) {
            if (Row.isDisplayed()) {
                visiblecount++;
                String actual_value = Row.getText();
                int enroll = Integer.parseInt(actual_value);
                System.out.println(visiblecount + " " + "value" + " " + actual_value);
                if (enroll > 10000) {
                    System.out.println(visiblecount + "match found");
                } else
                    System.out.println("match not found");
            }
        }

    }

    public void selectpython() {
        driver.findElement(By.xpath(selectpython_xpath)).click();
    }

    public void uncheckbeg() {
        driver.findElement(By.xpath(uncheckbeg_xpath)).click();
    }

    public void verifyrecords() {
        WebElement records = driver.findElement(By.xpath(verfrec_xpath));
        String rec = records.getText();
        System.out.println(rec);
    }

    public void reset() {
        driver.findElement(By.xpath(reset_xpath)).click();
    }

    public void verifylang() {
        driver.findElement(By.xpath(reset_lang_xpath)).isSelected();
    }

    public void verifylevel() {
        driver.findElement(By.xpath(reset_level1_xpath)).isSelected();
        driver.findElement(By.xpath(reset_level2_xpath)).isSelected();
        driver.findElement(By.xpath(reset_level3_xpath)).isSelected();
    }

    public void verifyenrol() {
        driver.findElement(By.xpath(reset_enroll_xpath)).isSelected();
    }

    public void resetdisabled() {
        WebElement resetbutton = driver.findElement(By.xpath(reset_xpath));
        boolean isvisble = resetbutton.isDisplayed();
        if (!isvisble) {
            System.out.println("Button is hidden");
        } else {
            System.out.println("Button is visible");
        }
    }

    public void sortby() {
//        driver.findElement(By.xpath(sort_xpath)).click();
        WebElement value = driver.findElement(By.xpath(sort_xpath));
        Select select = new Select(value);
        select.selectByVisibleText("Enrollments");
        int visiblecount = 0;
        int x = Integer.MIN_VALUE;
        boolean isascending = true;
        List<WebElement> element = driver.findElements(By.xpath(Enrollments));
        for (WebElement Row : element) {
            if (Row.isDisplayed()) {
                visiblecount++;
                String actual_value = Row.getText();
                int enroll = Integer.parseInt(actual_value);
                System.out.println(visiblecount + " " + "value" + " " + actual_value);
                if (enroll < x) {
                    isascending = false;
                    System.out.println("order mismatch");
                }
                x = enroll;
            }
        }
        if (isascending) {
            System.out.println("verification passed");
        } else {
            System.out.println("failed");
        }
    }
}

