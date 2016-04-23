import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Tests {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void getInWebPage(){
        driver.get("http://kashpi.com/");
    }

    @After
    public void inTheHomePage(){

        WebElement homeButton = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[1]/a"));
        homeButton.click();

        String expectedResult = "Начало";

        WebElement homepage = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[1]/a"));
        assertEquals(expectedResult, homepage.getText());
    }

    @Test
    public void clickOnProductPage(){
        driver.get("http://kashpi.com/");
        WebElement productsButton = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a"));
        productsButton.click();
    }

    @After
    public void inProductsPage(){

        String expectedResult = "Продукти";
        WebElement products = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a"));
        assertEquals(expectedResult, products.getText());
    }

    @Test
    public void clickOnTermsOfDelivery(){
        driver.get("http://kashpi.com/");
        WebElement termsButton = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[3]/a"));
        termsButton.click();
    }

    @After
    public void inTermsPage(){
        String expectedResult = "Условия за доставка";
        WebElement terms = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[3]/a"));
        assertEquals(expectedResult, terms.getText());
    }

    @Test
    public void getInContactsPage(){
        driver.get("http://kashpi.com/");
        WebElement productsButton = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[4]/a"));
        productsButton.click();
    }

    @After
    public void inCatalogPage(){
        String expectedResult = "Контакти";
        WebElement contacts = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[4]/a"));
        assertEquals(expectedResult, contacts.getText());
    }

    @Test
    public void getInProductDescription(){
        driver.get("http://kashpi.com/");
        WebElement user = driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a"));
        user.click();

        user = driver.findElement(By.xpath(
                "/html/body/div[2]/div[1]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr/td/div/div[2]/div/table/tbody/tr/td[1]/span[2]"));
        user.click();

        user = driver.findElement(By.xpath(
                "/html/body/div[2]/div[1]/div[1]/div[2]/div/div[2]/table[2]/tbody/tr/td[1]/div[1]/div[3]/div[1]/div/h3/a"));
        user.click();
    }

    @After
    public void inProductDelta(){
        String expected = "DELTA";
        WebElement delta = driver.findElement(By.xpath(
                "/html/body/div[2]/div[1]/div[1]/div[2]/div/div[2]/table[2]/tbody/tr/td[1]/div[1]/div[3]/div[1]/div/h3/a"));
        assertEquals(expected, delta.getText());
    }
}
