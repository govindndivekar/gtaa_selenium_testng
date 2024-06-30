import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderTest1 {

    //WebDriver driver = seleniumutils.WebDriver.getDriver();

    @DataProvider(name = "test1")
    public Object[][] createData(){
        return new Object[][]{
                {"Data1", 36},
                {"Data2", 37}
        };
    }

    @Test(dataProvider = "test1")
    public void test01(String n1, Integer n2) throws InterruptedException {
        System.out.println(n1 + " " + n2);
    }

    @AfterClass
    public void afterClassMethod(){
    }

}
