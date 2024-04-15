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

public class validLogin {
    public WebDriver driver;
    @Given("^I am on the luma landing screen$")
    public void iAmOnTheLumaLandingScreen() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();
    }

    @When("^I click on the sign in link$")
    public void iClickOnTheSignInLink() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

    }

    @And("^I enter correct username$")
    public void iEnterCorrectUsername() {
        driver.findElement(By.id("email")).sendKeys("olabisibalqees@yahoo.com");
    }

    @And("^I enter correct password$")
    public void iEnterCorrectPassword() throws InterruptedException {
        driver.findElement(By.name("login[password]")).sendKeys("Testing2023");
        Thread.sleep(2000);
    }

    @When("^I clcik the login button$")
    public void iClcikTheLoginButton() throws InterruptedException {
        driver.findElement(By.name("send")).click();
        Thread.sleep(5000);
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() throws InterruptedException {
    //Welcome, balqees salami! Change
        String expectedLoggedInMessage = "Welcome, balqees salami!";
        String actualLoggedInMessage = driver.findElement(By.className("logged-in")).getText();
        Assert.assertEquals(expectedLoggedInMessage, actualLoggedInMessage);
        System.out.println(actualLoggedInMessage);
        Thread.sleep(3000);
        driver.close();



    }
}
