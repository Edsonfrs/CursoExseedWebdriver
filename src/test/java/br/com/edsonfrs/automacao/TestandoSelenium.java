package br.com.edsonfrs.automacao;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestandoSelenium {

    @Test
    public void Test() {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.google.com.br");
        //Assert.assertEquals("Google", driver.getTitle());

        driver.navigate().to("file:///home/edson/intelij-workspace/Meu-Primeiro-Projeto/camp/teste.html");
        WebElement texto = driver.findElement(By.id("meuTexto"));
        texto.sendKeys("Escrevendo no campo de testes 001");
        WebElement botaoClique = driver.findElement(By.id("botaoClique"));
        botaoClique.click();


    }

}

