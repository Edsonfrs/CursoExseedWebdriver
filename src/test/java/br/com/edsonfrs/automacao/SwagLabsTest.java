package br.com.edsonfrs.automacao;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTest {

    @Test
    public void verificarSeLoginOcorreComDadosCorretos() {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com");
        String urlInicial = driver.getCurrentUrl();

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement buttonLogin = driver.findElement(By.id("login-button"));
        userNameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        buttonLogin.submit();
        String urlAtual = driver.getCurrentUrl();
        String logo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();

        Assert.assertNotEquals(urlInicial, urlAtual);
        Assert.assertEquals("Swag Labs", logo);


    }

}
