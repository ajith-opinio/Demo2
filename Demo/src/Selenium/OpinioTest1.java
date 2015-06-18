package Selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OpinioTest1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://pos.opinioapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testOpinioTest1() throws Exception {
    driver.get(baseUrl + "/#/orders");
    driver.findElement(By.cssSelector("#ember1405 > div.table-inner > div.table-number > div.table-number-circle")).click();
    driver.findElement(By.cssSelector("#ember1799 > div.menu-item-inner")).click();
    driver.findElement(By.cssSelector("#ember1803 > div.menu-item-inner")).click();
    driver.findElement(By.cssSelector("#ember1811 > div.menu-item-inner")).click();
    driver.findElement(By.cssSelector("#ember1815 > div.menu-item-inner")).click();
    driver.findElement(By.cssSelector("#ember1819 > div.menu-item-inner")).click();
    driver.findElement(By.cssSelector("#ember1823 > div.menu-item-inner")).click();
    driver.findElement(By.linkText("Create")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Settle')])[3]")).click();
    driver.findElement(By.cssSelector("#ember2641 > div.payment-button-pad > div.buttons.payment-methods > div.button-wrapper > div.button.payment-method")).click();
    driver.findElement(By.linkText("Done")).click();
    driver.findElement(By.cssSelector("a.left-off-canvas-toggle.menu-icon")).click();
    driver.findElement(By.id("ember921")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
