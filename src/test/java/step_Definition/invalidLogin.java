package step_Definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidLogin {
    public WebDriver driver;
    @Given("^I am on the luma application page$")
    public void iAmOnTheLumaApplicationPage() throws InterruptedException {
        // ChromeDriver Setup to Maximise
        WebDriverManager.chromedriver().setup();;
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();

    }

    @When("^I click on the signin link$")
    public void iClickOnTheSigninLink() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
    }

    @And("^I enter the user \"([^\"]*)\"$")
    public void iEnterTheUser(String username) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(username);

    }

    @And("^I enter thepass \"([^\"]*)\"$")
    public void iEnterThepass(String password) throws Throwable {
        driver.findElement(By.name("login[password]")).sendKeys(password);

    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() throws InterruptedException {
        driver.findElement(By.name("send")).click();

    }

    @Then("^I should get \"([^\"]*)\"$")
    public void iShouldGet(String errorMessage) throws Throwable {
        //errorMessage assertion
        Thread.sleep(2000);
        String expectedErrorMessage = errorMessage;
        String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        System.out.println(actualErrorMessage);
        Thread.sleep(3000);
        driver.close();

    }
}
