package br.com.edsonfrs.automacao;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BlazeDemoTest {

    @Test
    public void verificarSeLoginOcorreComDadosCorretos() {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();





        driver.navigate().to("https://www.blazedemo.com/login");
        //String urlInicial = driver.getCurrentUrl();

        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        emailInput.sendKeys("fulano@gmail.com");
        passwordInput.sendKeys("123456");

        List<WebElement> buttonsList= driver.findElements(By.tagName("button"));
        for (WebElement button: buttonsList){
            if (button.getAttribute("type").equals("submit")){
                button.submit();
            }
        }


        /*
        String urlAtual = driver.getCurrentUrl();
        String logo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();

        Assert.assertNotEquals(urlInicial, urlAtual);
        Assert.assertEquals("Swag Labs", logo);

         */

        //driver.quit();

    }


}
