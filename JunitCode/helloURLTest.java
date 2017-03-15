package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class helloURLTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://cs1632ex.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testHelloURL() throws Exception {
		// Given that I am on the Home Page I would like to go to the Hello Page when I click Hello
		selenium.open("/");
		selenium.click("link=Hello");
		selenium.waitForPageToLoad("30000");
		assertEquals("https://cs1632ex.herokuapp.com/hello", selenium.getLocation());
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
