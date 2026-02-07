package stepdefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.Loginpage;
import pages.Reachloginpage;

import java.io.IOException;

public class googlesearchp {

    Reachloginpage loginpage=new Reachloginpage();
    Loginpage login=new Loginpage();
    @Given("user is on Practice website")
    public void user_is_on_practice_website() throws InterruptedException {
        loginpage.openwebsite();
    }
    @When("user click on PRACTICE")
    public void user_click_on_practice() throws Throwable {
        loginpage.clickonpractice();
    }
    @And("user click on Test login page")
    public void user_click_on_test_login_page() throws InterruptedException {
        loginpage.clickonTestlogin();
    }
//    @Then("user successfully enter the login page")
//    public void user_successfully_enter_the_login_page() throws IOException {
//        loginpage.takescreenshot();
//    }
    @And("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        login.gettitle();
    }
    @And("^user enter the (.*) and (.*)$")
    public void user_enter_the_username_and_password(String username, String password) {
    login.entercreds(username,password);
    }
    @And("user click on login button")
    public void user_click_on_login_button() {
    login.clicklogin();
    }
    @And("user successfully login")
    public void user_successfully_login() throws IOException {
        loginpage.takescreenshot();
    }
    @Then("user click logout")
    public void user_click_logout(){
        login.logout();
    }
    @Then("user is successfully logedin")
    public void user_is_successfully_logedin(){
        login.Logoutsuccessscreen();
    }
    @And("user click on Test Exception")
    public void user_click_on_Test_Exception(){
        loginpage.clickexception();
    }
    @And("user is on test Exception page")
    public void user_is_on_test_Exception_page(){
        loginpage.gettextexception();
    }
    @When("user click on add button")
    public void user_click_on_add_button() throws InterruptedException {
        loginpage.addnewrow();
    }
//    @And("new row is added")
//    public void new_row_is_added(){
//        loginpage.verifyrow2();
//    }
    @When("user enter new entry")
    public void user_enter_new_entry(){
        loginpage.verifyrow2();
    }
    @And("click on Save button")
    public void click_on_Save_button() throws InterruptedException {
        loginpage.savebutton();
    }
    @Then("verify the saved message")
    public void verify_the_saved_message(){
        loginpage.verifyadded();
    }
    @And("user click on Test Table")
    public void user_click_on_Test_Table(){
        loginpage.testtable();
    }
    @When("select the JAVA")
    public void select_the_JAVA(){
        loginpage.selectjava();
    }
    @And("Uncheck Intermediate and Advanced")
    public void Uncheck_Intermediate_and_Advanced(){
        loginpage.uncheck();
    }
    @And("Verify only beginner is visible")
    public void Verify_only_beginner_is_visible(){
        loginpage.beginner();
    }
    @And("user select 1000 enrolment")
    public void user_select_1000_enrolment(){
        loginpage.dropdown();
    }
    @And("verify all enrollments")
    public void verify_all_enrollments(){
        loginpage.enrollmentverify();
    }
    @When("select python")
    public void select_python(){
        loginpage.selectpython();
    }
    @And("uncheck beginner")
    public void uncheck_beginner(){
        loginpage.uncheckbeg();
    }
    @Then("verify records")
    public void verify_records() throws InterruptedException {
        loginpage.verifyrecords();
        Thread.sleep(3000);
    }
    @And("click on reset")
    public void click_on_reset() throws InterruptedException {
        loginpage.reset();
        Thread.sleep(3000);
    }
    @And("verify language level and enrollment")
    public void verify_language_level_and_enrollment() throws InterruptedException {
        loginpage.verifylang();
        loginpage.verifylevel();
        loginpage.verifyenrol();
        Thread.sleep(3000);
    }
    @Then("verify resetbutton is disabled")
    public void verify_resetbutton_is_disabled(){
        loginpage.resetdisabled();
    }
    @And("select sortby enrollment")
    public void select_sortby_enrollment() throws InterruptedException {
        loginpage.sortby();
        Thread.sleep(3000);
    }
}

