package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class rdbtn_steps {

    private ChromeDriver driver;

    @Given("^I should see the practice page$")
    public void iShouldSeeThePracticePage() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement titlepage = driver.findElement(By.xpath("//h1['Practice Page']"));
        Assert.assertTrue("No se redirecciono correcctamente a la pagina", titlepage.isDisplayed());
    }

    @Then("^I should see the section of radio button$")
    public void iShouldSeeTheSectionOfRadioButton() {
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        WebElement radiobutton_section = driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/legend"));
        Assert.assertTrue("No se encontro la sección de los radio buttons", radiobutton_section.isDisplayed());
    }

    @And("^I validate the options of radio button$")
    public void iValidateTheOptionsOfRadioButton() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement rdbtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        wait.until(ExpectedConditions.elementToBeClickable(rdbtn2));
        rdbtn2.click();
        WebElement rdbtn3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        wait.until(ExpectedConditions.elementToBeClickable(rdbtn3));
        rdbtn3.click();
        WebElement rdbtn1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        wait.until(ExpectedConditions.elementToBeClickable(rdbtn1));
        rdbtn1.click();
    }

    @Then("^I should see the section of sugession class$")
    public void iShouldSeeTheSectionOfSugessionClass() {
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        WebElement sugession_class = driver.findElement(By.xpath("//*[@id='select-class-example']/fieldset/legend"));
        Assert.assertTrue("No se encontro la sección de sugession class", sugession_class.isDisplayed());
    }

    @Then("^I close the page$")
    public void iCloseThePage() {
        driver.quit();
    }

    @When("^I tap on type select country$")
    public void iTapOnTypeSelectCountry() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement select_country = driver.findElement((By.xpath("//input[@id='autocomplete']")));
        wait.until(ExpectedConditions.elementToBeClickable(select_country));
        select_country.click();
    }

    @Then("^I write the word \"([^\"]*)\"$")
    public void iWriteTheWord(String word) {
        WebElement select_country = driver.findElement((By.xpath("//input[@id='autocomplete']")));
        select_country.sendKeys(word);
    }

    @And("^I select Mexico in the list$")
    public void iSelectMexicoInTheList() {
        WebElement mx = driver.findElement(By.xpath("//*[@class='ui-menu-item-wrapper'][contains(text(), 'Mexico')]"));
        mx.click();
        WebElement text = driver.findElement(By.id("autocomplete"));
        String text1 = text.getText();
        Assert.assertTrue("No se encontro la opcion México", text1.equals("Mexico") );
    }
    @Then("^I should see the section of dropdown$")
    public void iShouldSeeTheSectionOfDropdown() {
        WebElement dropdown_section = driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/legend"));
        Assert.assertTrue("No se encontro la sección de dropdown", dropdown_section.isDisplayed());
    }
    @And("^I validate dropdown options$")
    public void iValidateDropdownOptions() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement dropdown_section = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        wait.until(ExpectedConditions.elementToBeClickable(dropdown_section));
        dropdown_section.click();
        WebElement option2 = driver.findElement(By.xpath("//option[@value='option2']"));
        wait.until(ExpectedConditions.elementToBeClickable(option2));
        option2.click();
        WebElement option3 = driver.findElement(By.xpath("//option[@value='option3']"));
        wait.until(ExpectedConditions.elementToBeClickable(option3));
        option3.click();
    }
    @Then("^I should see the section of checkbox$")
    public void iShouldSeeTheSectionOfCheckbox() {
        WebElement checkbox_section = driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/legend"));
        Assert.assertTrue("No se encontro la sección de checkbox", checkbox_section.isDisplayed());
    }
    @And("^I validate checkbox options$")
    public void iValidateCheckboxOptions() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement option1 = driver.findElement(By.cssSelector("input[id=checkBoxOption1]"));
        wait.until(ExpectedConditions.elementToBeClickable(option1));
        option1.click();
        WebElement option2 = driver.findElement(By.cssSelector("input[id=checkBoxOption2]"));
        wait.until(ExpectedConditions.elementToBeClickable(option2));
        option2.click();

    }

    @Then("^I should see the section of switch alert$")
    public void iShouldSeeTheSectionOfSwitchAlert() {
        WebElement switch_section = driver.findElement(By.xpath("/html/body/div[2]/div[3]/fieldset/legend"));
        Assert.assertTrue("No se encontro la sección de switch", switch_section.isDisplayed());
    }

    @When("^I tap on text box$")
    public void iTapOnTextBox() {
        WebElement text_box = driver.findElement(By.cssSelector("input[name=enter-name]"));
        text_box.click();
    }

    @And("^I write the \"([^\"]*)\"$")
    public void iWriteThe(String text) {
        WebElement text_box = driver.findElement(By.cssSelector("input[name=enter-name]"));
        text_box.sendKeys(text);
    }

    @Then("^I tap on alert button$")
    public void iTapOnAlertButton() throws InterruptedException {
        WebElement btn_alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        btn_alert.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }

    @And("^Validate element displayed$")
    public void validateElementDisplayed() throws InterruptedException {
        WebElement element_displayed = driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[1]/input[3]"));
        Thread.sleep(1000);
        if (element_displayed.isDisplayed()){
            System.out.println("El elemento no esta oculto");
        }else{
            System.out.println("El elemento esta oculto");
        }

    }
}


