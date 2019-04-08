package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FouthMavenProjectStepDefinition {
    static WebDriver mydriver;
    @Given("^Open The Chrome Browers$")
    public void open_The_Chrome_Browers()  {
        System.setProperty("webdriver.chrome.driver","C:\\work_space\\MyFourthMavenProject\\src\\chromedriver.exe");
        // Write code here that turns the phrase above into concrete actions
        mydriver = new ChromeDriver();

    }

    @When("^Enter Valid Santader URL$")
    public void enter_Valid_Santader_URL() {
        // Write code here that turns the phrase above into concrete actions
        mydriver.get("https://www.google.com/search?q=santander&oq=santa&aqs=chrome.0.0j69i57j69i60j0l3.7078j0j8&sourceid=chrome&ie=UTF-8");

    }

    @Then("^Validated Santader Web Sites OPen Sucessfuly$")
    public void validated_Santader_Web_Sites_OPen_Sucessfuly()  {
        // Write code here that turns the phrase above into concrete actions
        mydriver.getTitle();
        System.out.println(mydriver.getTitle());
        mydriver.quit();

    }

}
