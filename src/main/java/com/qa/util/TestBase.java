package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	static final Logger logger = Logger.getLogger(TestBase.class);

	public TestBase() {

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	}

	/*
	 * To Launch browser
	 */
	public static void launchBrowserAndEnterURL(String url) {

		String chromeDriverPath = System.getProperty("user.dir") + prop.getProperty("chromeDriverPath");
		String ieDriverPath = System.getProperty("user.dir") + prop.getProperty("ieDriverPath");
		try {
			// To Open URL in Firefox browser
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", geckoDriverPath);
				driver = new FirefoxDriver();
			}

			// To Open URL in Chrome browser
			else if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				driver = new ChromeDriver();
			}

			// To Open URL in IE browser
			else if (prop.getProperty("browser").equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.chrome.driver", ieDriverPath);
				driver = new InternetExplorerDriver();
			}

		} catch (UnreachableBrowserException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

	}

	/*
	 * To get the WebElement based on the locator type
	 */
	public static WebElement getWebElement(String locator) {
		WebElement element = null;

		String[] locatorTypeAndValue = locator.split("--");
		String locatorValue = locatorTypeAndValue[0].trim();
		String locatorType = locatorTypeAndValue[1].trim();

		switch (locatorType.toLowerCase()) {

		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;

		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;

		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
			break;

		case "cssSelector":
			element = driver.findElement(By.cssSelector(locatorValue));
			break;

		case "className":
			element = driver.findElement(By.className(locatorValue));
			break;

		case "tagName":
			element = driver.findElement(By.tagName(locatorValue));
			break;

		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(locatorValue));
			break;

		default:
			element = null;

			break;

		}
		return element;
	}

	/*
	 * To highlight the WebElement
	 */
	public static boolean highLight(WebElement element) throws Exception {
		boolean status = false;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (element != null) {
			js.executeScript("arguments[0].style.border='3px solid red'", element);
			status = true;
		}
		Thread.sleep(2000);
		return status;

	}

	/*
	 * To Click the WebElement
	 */
	public static void click(String locator) throws Exception {
		boolean status;
		WebElement element = getWebElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			status = highLight(element);
			if (status) {
				element.click();
			}
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info("Unable to click web element: Actual Web element is: " + element + " Expected Web element is :"
					+ locator);
		}
	}

	/*
	 * Mouse Hover the WebElement
	 */
	public static void mouseHover(String locator) throws Exception {
		boolean status;
		WebElement element = getWebElement(locator);
		try {
			Actions action = new Actions(driver);
			status = highLight(element);
			if (status) {
				action.moveToElement(element).build().perform();
			}
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info("Unable to find web element: Actual Web element is: " + element + " Expected Web element is :"
					+ locator);
		}
	}

	/*
	 * To Select the dropdown value based on visible text
	 */
	public static void selectByVisibleText(String locator, String value) throws Exception {
		boolean status;
		WebElement element = getWebElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		try {
			status = highLight(element);
			if (status) {
				Select obj = new Select(element);
				obj.selectByVisibleText(value);
			}
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			logger.info("Unable to find web element: Actual Web element is: " + element + " Expected Web element is :"
					+ locator);
		}
	}

	/*
	 * To get and verify the text
	 */
	public static void verifyExpected(String locator, String expectedValue) throws Exception {
		boolean status;
		String actualValue;

		WebElement element = getWebElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		try {
			status = highLight(element);
			if (status) {
				actualValue = element.getText();
				Assert.assertTrue("Failed to verify expected value", actualValue.equalsIgnoreCase(expectedValue));
				Thread.sleep(2000);

			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info(
					"Unable to Verify text: Actual text is: " + element.getText() + " Expected text is :" + locator);
		}
	}

	/*
	 * To get the particular text from the WebElement
	 */
	public static void containsText(String locator, String expectedValue) throws Exception {
		boolean status;
		String actualValue;

		WebElement element = getWebElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		try {
			status = highLight(element);
			if (status) {
				actualValue = element.getText();
				Assert.assertTrue("Failed to verify expected value", actualValue.contains(expectedValue));
				Thread.sleep(2000);

			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info(
					"Unable to Verify text: Actual text is: " + element.getText() + " Expected text is :" + locator);
		}
	}

	/*
	 * To verify successful page navigation
	 */
	public static void verifyPageNavigation(String expectedValue) throws Exception {

		String actualValue = driver.getCurrentUrl();
		Assert.assertTrue("Page Navigation Unsuccesful", actualValue.equalsIgnoreCase(expectedValue));
		Thread.sleep(4000);

	}

	/*
	 * To verify the WebElement presence
	 */
	public static void isDisplay(String locator) throws Exception {

		boolean status;

		WebElement element = getWebElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			status = highLight(element);
			if (status) {
				Assert.assertTrue("Element not displayed", element.isDisplayed());
				Thread.sleep(2000);

			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info(
					"Unable to Verify the element: Actual element is: " + element + " Expected element is :" + locator);
		}
	}

	/*
	 * To enter the text
	 */
	public static void enterText(String locator, String valueToBeEntered) throws Exception {
		// boolean status;
		WebElement element = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			element = getWebElement(locator);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
			element.click();
			element.clear();
			element.sendKeys(valueToBeEntered);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info("Unable to find web element: Actual Web element is: " + element + " Expected Web element is :"
					+ locator);
		}
	}

	public static void pageNavigation(String url) throws Exception {

		driver.navigate().to(url);
		Thread.sleep(10000);

	}

	/*
	 * To switch to Frame
	 */
	public static void switchToFrame(String locator) throws Exception {

		boolean status;
		WebElement element = getWebElement(locator);
		try {
			status = highLight(element);
			if (status) {
				driver.switchTo().frame(element);
			}
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logger.info("No Frame available");
		}
	}

	public static void closeAllWindows() {

		driver.quit();

	}

}
