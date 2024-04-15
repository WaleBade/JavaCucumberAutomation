package step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class mainNavDropdownSubContent {
    public WebDriver driver;
    @Given("^I am on the luma page$")
    public void iAmOnTheLumaPage() throws InterruptedException {
        // ChromeDriver Setup to Maximise
        WebDriverManager.chromedriver().setup();;
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();

    }

    @When("^I hover on the dropdown elements on the luma page$")
    public void iHoverOnTheDropdownElementsOnTheLumaPage() throws InterruptedException {
        //Hovering on Women to inspect content
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Women"))).perform();
        driver.findElement(By.linkText("Tops")).isDisplayed();
        driver.findElement(By.linkText("Tops")).isEnabled();
        driver.findElement(By.linkText("Bottoms")).isDisplayed();
        driver.findElement(By.linkText("Bottoms")).isEnabled();
        Thread.sleep(2000);
        String Name = driver.findElement(By.linkText("Tops")).getText();
        System.out.println(Name);
        String Name1 = driver.findElement(By.linkText("Bottoms")).getText();
        System.out.println(Name1);

        //Hovering over WOMEN TOPS To Inspect SubContent
        actions.moveToElement(driver.findElement(By.linkText("Tops"))).perform();
        driver.findElement(By.xpath("//a[@id=\"ui-id-11\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-12\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-13\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-14\"]")).isDisplayed();
        Thread.sleep(2000);

        //Hovering over WOMEN BOTTOMS To Inspect SubContent
        actions.moveToElement(driver.findElement(By.linkText("Bottoms"))).perform();
        driver.findElement(By.xpath("//a[@id=\"ui-id-15\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-16\"]")).isDisplayed();
        Thread.sleep(2000);

        //Hovering on Men to inspect content
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(By.linkText("Men"))).perform();
        driver.findElement(By.linkText("Tops")).isDisplayed();
        driver.findElement(By.linkText("Tops")).isEnabled();
        driver.findElement(By.linkText("Bottoms")).isDisplayed();
        driver.findElement(By.linkText("Bottoms")).isEnabled();
        Thread.sleep(2000);

        //Hovering over MEN TOPS To Inspect SubContent
        actions2.moveToElement(driver.findElement(By.linkText("Tops"))).perform();
        driver.findElement(By.xpath("//a[@id=\"ui-id-19\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-20\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-21\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-22\"]")).isDisplayed();
        Thread.sleep(2000);

        //Hovering over MEN BOTTOMS To Inspect SubContent
        actions.moveToElement(driver.findElement(By.linkText("Bottoms"))).perform();
        driver.findElement(By.xpath("//a[@id=\"ui-id-23\"]")).isDisplayed();
        driver.findElement(By.xpath("//a[@id=\"ui-id-24\"]")).isDisplayed();
        Thread.sleep(2000);
        driver.close();





    }

    @And("^I should see all the correct main dropdown content$")
    public void iShouldSeeAllTheCorrectMainDropdownContent() {


    }

    @And("^I hover on the main dropdown content$")
    public void iHoverOnTheMainDropdownContent() {

    }

    @Then("^I should see all the correct subcontent$")
    public void iShouldSeeAllTheCorrectSubcontent() {

    }
}
