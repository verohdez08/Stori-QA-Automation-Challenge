package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import pages.radio_button_page;

import java.util.concurrent.TimeUnit;

public class rdbtn_steps {

    private ChromeDriver driver;

    @Given("^I should see the practice page$")
    public void iShouldSeeThePracticePage() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement titlepage = driver.findElement(By.xpath("//h1['Practice Page']"));
        if (titlepage.isDisplayed()) {
            System.out.println("Se encuentra dentro de la pagina principal");
        }else{
            System.out.println("NO se encuentra dentro de la pagina principal");
        }
    }

    @Then("^I should see the section of radio button$")
    public void iShouldSeeTheSectionOfRadioButton() {
        WebElement radiobutton_section = driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/legend"));
        if (radiobutton_section.isDisplayed()) {
            System.out.println("Se encuentra la seccion de los radio button");
        }else{
            System.out.println("NO se encuentra la seccion de los radio button");
        }
    }

    @And("^I validate the options of radio button$")
    public void iValidateTheOptionsOfRadioButton() {
        WebElement rdbtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        rdbtn2.click();
        WebElement rdbtn3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        rdbtn3.click();
        WebElement rdbtn1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        rdbtn1.click();
    }

    @Then("^I should see the section of sugession class$")
    public void iShouldSeeTheSectionOfSugessionClass() {
        WebElement radiobutton_section = driver.findElement(By.xpath("//*[@id='select-class-example']/fieldset/legend"));
        if (radiobutton_section.isDisplayed()) {
            System.out.println("Se encuentra la seccion de los radio button");
        }else{
            System.out.println("NO se encuentra la seccion de los radio button");
        }
    }

    @Then("^I close the page$")
    public void iCloseThePage() {
        driver.quit();
    }

    @When("^I tap on type select country$")
    public void iTapOnTypeSelectCountry() {
        WebElement select_country = driver.findElement((By.xpath("//input[@id='autocomplete']")));
        select_country.click();
    }

    @Then("^I write the word \"([^\"]*)\"$")
    public void iWriteTheWord(String word) {
        WebElement select_country = driver.findElement((By.xpath("//input[@id='autocomplete']")));
        select_country.sendKeys(word);
    }

    @And("^I select Mexico in the list$")
    public void iSelectMexicoInTheList() {
        WebElement list = driver.findElement(By.xpath("//*[@class='ui-menu-item-wrapper']"));
        String result =  list.getAttribute("innerText");
            if (result.equalsIgnoreCase("Mexico")){

            }else{
                System.out.println("No se encuentra la opcion");
            }
    }
    @Then("^I should see the section of dropdown$")
    public void iShouldSeeTheSectionOfDropdown() {
        WebElement dropdown_section = driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/legend"));
        if (dropdown_section.isDisplayed()) {
            System.out.println("Se encuentra la seccion de los radio button");
        }else{
            System.out.println("NO se encuentra la seccion de los radio button");
        }
    }
    @And("^I validate dropdown options$")
    public void iValidateDropdownOptions() {
        WebElement dropdown_section = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        dropdown_section.click();
        WebElement option2 = driver.findElement(By.xpath("//option[@value='option2']"));
        option2.click();
        WebElement option3 = driver.findElement(By.xpath("//option[@value='option3']"));
        option3.click();
    }
    @Then("^I should see the section of checkbox$")
    public void iShouldSeeTheSectionOfCheckbox() {
        WebElement checkbox_section = driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/legend"));
        if (checkbox_section.isDisplayed()) {
            System.out.println("Se encuentra la seccion de los radio button");
        }else{
            System.out.println("NO se encuentra la seccion de los radio button");
        }
    }
    @And("^I validate checkbox options$")
    public void iValidateCheckboxOptions() {
        WebElement option1 = driver.findElement(By.cssSelector("input[id=checkBoxOption1]"));
        option1.click();
        WebElement option2 = driver.findElement(By.cssSelector("input[id=checkBoxOption2]"));
        option2.click();

    }

    @Then("^I should see the section of switch alert$")
    public void iShouldSeeTheSectionOfSwitchAlert() {
        WebElement switch_section = driver.findElement(By.xpath("/html/body/div[2]/div[3]/fieldset/legend"));
        if (switch_section.isDisplayed()) {
            System.out.println("Se encuentra la seccion de los radio button");
        }else{
            System.out.println("NO se encuentra la seccion de los radio button");
        }
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
    public void iTapOnAlertButton() {
        WebElement btn_alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        btn_alert.click();
        driver.switchTo().alert().accept();

    }

    @And("^Validate element displayed$")
    public void validateElementDisplayed() {
        WebElement element_displayed = driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[1]/input[3]"));
        if (element_displayed.isDisplayed()){
            System.out.println("El elemento no esta oculto");
        }else{
            System.out.println("El elemento esta oculto");
        }

    }
}


