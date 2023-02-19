package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SGridDrivers {

    static WebDriver driver;

    public static WebDriver remoteDriverChromeOptions() {


        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.29:4444"), new ChromeOptions());
        } catch (MalformedURLException e) {

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }



    public static WebDriver remoteDriverFirefoxOptions() {


        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.29:4444"), new FirefoxOptions());
        } catch (MalformedURLException e) {

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }
}
