
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
import junit.framework.TestCase;
public class fibDecimalTest extends TestCase{
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://cs1632ex.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testFibDecimal() throws Exception {
		selenium.open("/");
		selenium.click("link=Fibonacci");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=tb1", "1.1");
		selenium.click("id=sub");
		selenium.waitForPageToLoad("30000");
		assertEquals("Fibonacci of 1.1 is 1!", selenium.getText("css=h2"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}