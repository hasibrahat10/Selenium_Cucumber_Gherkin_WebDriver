package stepDefinitions;

import io.cucumber.java.en.* ;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;
import static sun.tools.jstat.Scale.SEC;

public class OrangeHRMsteps {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver(); //launch chrome browser


    }


    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo presence on page")
    public void i_verify_that_the_logo_presence_on_page() {
        boolean status= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }

}
