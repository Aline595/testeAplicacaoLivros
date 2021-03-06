package com.fatec.scelwebdriver;
// Generated by Selenium IDE

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REQ04CT01CadastroComRAJaCadastrado {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void rEQ04CT01CadastroComRAJaCadastrado() {
		driver.get("https://ts-scel.herokuapp.com/");
		driver.manage().window().setSize(new Dimension(694, 728));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("jose");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("button")).click();
		driver.findElement(By.linkText("Alunos")).click();
		espera();
		driver.findElement(By.id("ra")).click();
		driver.findElement(By.id("ra")).sendKeys("1234");
		driver.findElement(By.id("nome")).click();
		driver.findElement(By.id("nome")).sendKeys("Aline");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("aline.as385@gmail.com");
		driver.findElement(By.id("cep")).click();
		driver.findElement(By.id("cep")).sendKeys("09973010");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.get("https://ts-scel.herokuapp.com/");
		driver.manage().window().setSize(new Dimension(694, 728));
		driver.findElement(By.linkText("Alunos")).click();
		espera();
		driver.findElement(By.id("ra")).click();
		driver.findElement(By.id("ra")).sendKeys("1234");
		driver.findElement(By.id("nome")).click();
		driver.findElement(By.id("nome")).sendKeys("Aline");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("aline.as385@gmail.com");
		driver.findElement(By.id("cep")).click();
		driver.findElement(By.id("cep")).sendKeys("09973010");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".text-danger")).click();
		assertEquals("Dados invalidos", driver.findElement(By.cssSelector(".text-danger")).getText());
	}
	
	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
