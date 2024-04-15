package step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class createUserAccount {
    public WebDriver driver;
    public int random;
    @Given("^I get on the homepage$")
    public void iGetOnTheHomepage() throws InterruptedException {
    WebDriverManager.chromedriver().setup();;
    driver = new ChromeDriver();
    driver.navigate().to("https://magento.softwaretestingboard.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();

    }

    @When("^I click the link to create account$")
    public void iClickTheLinkToCreateAccount() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//a[@class=\"action create primary\"]")).click();
    }

    @And("^I entered all the required information$")
    public void iEnteredAllTheRequiredInformation() {
        random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("wale");
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("bade");
        driver.findElement(By.xpath("//input[@id=\"email_address\"]")).sendKeys("walebade" + random + "@yahoo.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("TestNG2024");
        driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).sendKeys("TestNG2024");

    }

    @When("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).click();
        Thread.sleep(5000);
    }

    @Then("^My account should be creted successfully$")
    public void myAccountShouldBeCretedSuccessfully() throws InterruptedException {
        String expectedLoggedInMessage = "Welcome, wale bade!";
        String actualLoggedInMessage = driver.findElement(By.className("logged-in")).getText();
        Assert.assertEquals(expectedLoggedInMessage, actualLoggedInMessage);
        System.out.println(actualLoggedInMessage);
        Thread.sleep(3000);
        driver.close();

    }
}

