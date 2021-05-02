package com.fatec.scelwebdriver;

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

public class REQ04CT03CadastrarAlunoComErroNoRA {
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
	public void testeSW() {
		driver.get("https://ts-scel.herokuapp.com/login");
		driver.manage().window().setSize(new Dimension(1040, 744));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("jose");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("button")).click();
		driver.findElement(By.linkText("Alunos")).click();
		driver.findElement(By.id("ra")).click();
		driver.findElement(By.id("ra")).sendKeys("12345");
		driver.findElement(By.id("nome")).click();
		driver.findElement(By.id("nome")).sendKeys("Jose alves");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("jose@email.com");
		driver.findElement(By.id("cep")).sendKeys("00000000");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
	}
}