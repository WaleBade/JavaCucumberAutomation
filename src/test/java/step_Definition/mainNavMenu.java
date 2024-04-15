package step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainNavMenu {

    public WebDriver driver;

    @Given("^I am on the luma homepage$")
    public void iAmOnTheLumaHomepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();

    }
        //Asset What's New navigation link
    @Then("^I should see all navigation correctly displayed$")
        public void iShouldSeeAllNavigationCorrectlyDisplayed() {
        driver.findElement(By.linkText("What's New")).isDisplayed();
        driver.findElement(By.linkText("What's New")).isEnabled();
        String NavLink1 = (driver.findElement(By.linkText("What's New"))).getText();
        System.out.println(NavLink1);

        //Asset women navigation link
        driver.findElement(By.linkText("Women")).isDisplayed();
        driver.findElement(By.linkText("Women")).isEnabled();
        String NavLink2 = (driver.findElement(By.linkText("Women"))).getText();
        System.out.println(NavLink2);

        //Asset Men navigation link
        driver.findElement(By.linkText("Men")).isDisplayed();
        driver.findElement(By.linkText("Men")).isEnabled();
        String NavLink3 = (driver.findElement(By.linkText("Men"))).getText();
        System.out.println(NavLink3);

        //Asset Gear navigation link
        driver.findElement(By.linkText("Gear")).isDisplayed();
        driver.findElement(By.linkText("Gear")).isEnabled();
        String NavLink4 = (driver.findElement(By.linkText("Gear"))).getText();
        System.out.println(NavLink4);

        //Asset Training navigation link
        driver.findElement(By.linkText("Training")).isDisplayed();
        driver.findElement(By.linkText("Training")).isEnabled();
        String NavLink5 = (driver.findElement(By.linkText("Training"))).getText();
        System.out.println(NavLink5);

        //Asset Sale navigation link
        driver.findElement(By.linkText("Sale")).isDisplayed();
        driver.findElement(By.linkText("Sale")).isEnabled();
        String NavLink6 = (driver.findElement(By.linkText("Sale"))).getText();
        System.out.println(NavLink6);

        driver.close();



    }



}
