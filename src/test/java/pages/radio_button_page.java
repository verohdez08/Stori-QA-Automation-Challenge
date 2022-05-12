package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class radio_button_page {
    private ChromeDriver driver;

    public void validate_home_page() {
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

    public void validate_section_rdbtn() {
        WebElement radiobutton_section = driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/legend"));
        if (radiobutton_section.isDisplayed()) {
            System.out.println("Se encuentra la seccion de los radio button");
        }else{
            System.out.println("NO se encuentra la seccion de los radio button");
        }
    }

    public void validate_function_rdbtn() {
        WebElement rdbtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        rdbtn2.click();
        WebElement rdbtn3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        rdbtn3.click();
        WebElement rdbtn1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        rdbtn1.click();
    }
}
