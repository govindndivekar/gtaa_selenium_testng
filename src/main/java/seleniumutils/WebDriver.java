package seleniumutils;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

    public static final String webSite = "https://demoqa.com/";
    private static final org.openqa.selenium.WebDriver driver = new ChromeDriver();

    public static org.openqa.selenium.WebDriver getDriver() {
        return driver;
    }

}
