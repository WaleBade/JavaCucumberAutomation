package step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LumaLogo {

    public WebDriver driver;

    @Given("^I am on the luma home page$")
    public void i_am_on_the_luma_home_page() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();

    }

    @Then("^I should see the luma logo$")
    public void i_should_see_the_luma_logo() throws Throwable {
    driver.findElement(By.className("logo")).isDisplayed();
    driver.findElement(By.className("logo")).isEnabled();
    driver.close();


    }

    public static class mainNavDropdownContent {
        public WebDriver driver;

        @Given("^I am on the luma dropdown page$")
        public void iAmOnTheLumaDropdownPage() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://magento.softwaretestingboard.com/");
            driver.manage().window().maximize();
        }

        @When("^I hover on the dropdown elements$")
        public void iHoverOnTheDropdownElements() {
            Actions actions = new Actions(driver);
            actions.moveToElement( driver.findElement(By.linkText("Women"))).perform();
            driver.findElement(By.linkText("Tops")).isDisplayed();
            driver.findElement(By.linkText("Bottoms")).isDisplayed();



        }

        @Then("^I should see all the correct dropdown contents$")
        public void iShouldSeeAllTheCorrectDropdownContents() {
            driver.close();
        }
    }
}