package org.example.sof3041_sum25_sd20102;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumWebdriverTest {

    private WebDriver webDriver;

    @BeforeEach
    void setup() {

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {

        // open
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        // click menu
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

        // log in
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        // input values to form
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        // submit form
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        // test
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));

        String actualFirstCategory = webElement.getText();
        String expectedFirstCategory = "Formal Shoes";
        assertEquals(expectedFirstCategory, actualFirstCategory);

        // ...

        webDriver.quit();



    }
}
