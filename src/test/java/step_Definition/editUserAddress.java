package step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.bcel.generic.Select;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class editUserAddress {
    public WebDriver driver;
    @Given("^I already logged in$")
    public void iAlreadyLoggedIn() throws InterruptedException {
        // ChromeDriver Setup to Maximise
        WebDriverManager.chromedriver().setup();;
        driver = new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("walebade@yahoo.com");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("TestGN2024");
        driver.findElement(By.name("send")).click();
        Thread.sleep(2000);
    }

    @When("^I enter details for changing address$")
    public void iEnterDetailsForChangingAddress() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//a[@data-ui-id=\"default-billing-edit-link\"]")).click();
        driver.findElement(By.xpath("//input[@title=\"Phone Number\"]")).click();
        driver.findElement(By.xpath("//input[@title=\"Phone Number\"]")).clear();
        driver.findElement(By.xpath("//input[@title=\"Phone Number\"]")).sendKeys("0442771639");

        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//option[@value=\"FI\"]")).click();
        //Select Country = new Select(driver.findElement(By.id("country")));
        //Country.selectByVakue("FI");
       // driver.findElement(By.xpath("//input[@id=\"zip\"]")).click();
        //driver.findElement(By.xpath("//input[@id=\"zip\"]")).sendKeys("023784");
        driver.findElement(By.xpath("//select[@id=\"region_id\"]")).click();
        driver.findElement(By.xpath("//option[@value=\"336\"]")).click();
        //Select province = new Select(driver.findElement(By.id("region_id")));
        //province.selectByValue(336);
        //driver.findElement(By.xpath("////input[@id=\"city\"]")).click();
        //driver.findElement(By.xpath("////input[@id=\"city\"]")).clear();
        //driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Espoo");
        //driver.findElement(By.xpath("////input[@id=\"street_3\"]")).click();
        //driver.findElement(By.xpath("////input[@id=\"street_3\"]")).clear();
        //driver.findElement(By.xpath("////input[@id=\"street_3\"]")).sendKeys("13");
        //driver.findElement(By.xpath("////input[@id=\"street_2\"]")).click();
        //driver.findElement(By.xpath("////input[@id=\"street_2\"]")).clear();
        //driver.findElement(By.xpath("////input[@id=\"street_2\"]")).sendKeys("13");
        //driver.findElement(By.xpath("////input[@id=\"street_1\"]")).click();
        // driver.findElement(By.xpath("////input[@id=\"street_1\"]")).clear();
       // driver.findElement(By.xpath("////input[@id=\"street_1\"]")).sendKeys("Kirstinhuja 13");



    }

    @And("^I clicked on the save button$")
    public void iClickedOnTheSaveButton() {
        driver.findElement(By.xpath("//button[@title=\"Save Address\"]")).click();

    }

    @Then("^My address should be edited successfully$")
    public void myAddressShouldBeEditedSuccessfully() throws InterruptedException {
        String expectedMessage = "You saved the address.";
        String actualMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        System.out.println(actualMessage);
        Thread.sleep(3000);
        driver.close();

    }
}
