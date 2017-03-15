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

public class usedForQATextTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://cs1632ex.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testUsedForQAText() throws Exception {
		// Given that I am on the Home Page I would like to see "Used for CS1632 Software Quality Assurance, taught by Bill Laboon"
		selenium.open("/");
		selenium.click("link=CS1632 D3 Home");
		selenium.waitForPageToLoad("30000");
		assertEquals("Used for CS1632 Software Quality Assurance, taught by Bill Laboon", selenium.getText("css=div.row > p.lead"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
