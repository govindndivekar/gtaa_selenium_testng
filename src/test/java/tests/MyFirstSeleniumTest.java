
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyFirstSeleniumTest {

    WebDriver driver = seleniumutils.WebDriver.getDriver();

    @Test
    public void test01() throws InterruptedException {

        driver.get(Constants.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Reporter.log("Opened the Website");
        driver.findElement(By.ByXPath.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Reporter.log("Navigated to the Path");
        driver.quit();
    }

    @AfterClass
    public void afterClassMethod(){
    }

}
