package step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mainNavDropdownContent {
    public WebDriver driver;

    @Given("^I am on the luma landing page$")
    public void iAmOnTheLumaLandingPage() throws InterruptedException {
        // ChromeDriver Setup to Maximise
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();

    }

    @When("^I hover on the dropdown elements on the landing page$")
    public void iHoverOnTheDropdownElementsOnTheLandingPage() throws InterruptedException {
        //Hovering on Women to inspect content
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Women"))).perform();
        driver.findElement(By.linkText("Tops")).isDisplayed();
        driver.findElement(By.linkText("Bottoms")).isDisplayed();
        Thread.sleep(2000);

        //Hovering on Men to inspect content
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(driver.findElement(By.linkText("Men"))).perform();
        driver.findElement(By.linkText("Tops")).isDisplayed();
        driver.findElement(By.linkText("Bottoms")).isDisplayed();
        Thread.sleep(2000);

        //Hovering on Gear to inspect content
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(By.linkText("Gear"))).perform();
        driver.findElement(By.linkText("Bags")).isDisplayed();
        driver.findElement(By.linkText("Fitness Equipment")).isDisplayed();
        driver.findElement(By.linkText("Watches")).isDisplayed();
        Thread.sleep(2000);

        //Hovering on Training to inspect content
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(driver.findElement(By.linkText("Training"))).perform();
        driver.findElement(By.linkText("Video Download")).isDisplayed();
        Thread.sleep(2000);

        driver.close();
    }


    @Then("^I should see all the correct dropdown content$")
    public void iShouldSeeAllTheCorrectDropdownContent() {
    }
}
