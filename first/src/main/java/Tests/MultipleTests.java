package Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import org.junit.Assert;


public class MultipleTests {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1728, 982));
        driver.get("https://automationintesting.com/selenium/testpage/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testFirstNameInput() {
        WebElement input = driver.findElement(By.id("firstname"));
        if (input == null) {
            Assert.fail("Element does not exist");
            return;
        }

        input.sendKeys("Bastián");
        assertThat(input.getAttribute("value"), is("Bastián"));
    }

    @Test
    public void testSurNameInput() {
        driver.findElement(By.id("surname")).click();
        driver.findElement(By.id("surname")).sendKeys("Paredes");
        assertThat(driver.findElement(By.id("surname")).getAttribute("value"), is("Paredes"));
        assertThat(driver.findElement(By.id("surname")).getAttribute("value"), not(is("Paredes2")));
    }
}
