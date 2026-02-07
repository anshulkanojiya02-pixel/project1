package pages;

import org.openqa.selenium.By;
import utility.baseclass;

public class Loginpage extends baseclass{
    public static String username_xpath="//input[@id='username']";
    public static String password_xpath="//input[@id='password']";
    public static String submit_btn="//button[@id='submit']";
    public static String pagetitle="//*[@id='login']/h2";
    public static String logoutbtn=" //*[contains(text(),'Log out')]";
    public static String logoutsuccess="//strong[normalize-space()='Congratulations student. You successfully logged in!']";
    public static String invalidcreds="//div[@id='error']";


    public void entercreds(String username, String password){
        driver.findElement(By.xpath(username_xpath)).sendKeys(username);
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }
    public void clicklogin(){
        driver.findElement(By.xpath(submit_btn)).click();
    }
    public void gettitle(){
       String title= driver.findElement(By.xpath(pagetitle)).getText();
        System.out.println(title);
    }
    public void logout(){
        driver.findElement(By.xpath(logoutbtn)).click();
    }
    public void Logoutsuccessscreen(){
        try {
            String text = driver.findElement(By.xpath(logoutsuccess)).getText();
            if (text.equals("Congratulations student. You successfully logged in!")) {
                System.out.println(text);
            }
        }
        catch (Exception e) {
        }
        try {
            String text1 = driver.findElement(By.xpath(invalidcreds)).getText();
            if (text1.equals("Your username is invalid!")) {
                System.out.println(text1);

            }
        }
        catch (Exception e){


        }
        try{
            String text2=driver.findElement(By.xpath(invalidcreds)).getText();
            if(text2.equals("Your password is invalid!")){
                System.out.println(text2);
            }
        }
        catch (Exception e){

        }
    }
}
