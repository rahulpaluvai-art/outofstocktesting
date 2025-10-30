package framework;

import lombok.AccessLevel;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;


@UtilityClass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BrowserUtils {

    OptionsManager options = new OptionsManager();

    @SneakyThrows
    public void killExistingBrowsers()
    {
        if(System.getProperty("os.name").toLowerCase().contains("win")) {
            Runtime.getRuntime().exec("TASKKILL -f -im msedgedriver.exe /T");
            Runtime.getRuntime().exec("TASKKILL -f -im chromedriver.exe /T");
            Runtime.getRuntime().exec("TASKKILL -f -im geckodriver.exe /T");
        }

        //System.getProperty("os.name") --> Fetch the latest operating system that we are working on
        else if(System.getProperty("os.name").toLowerCase().contains("mac") || System.getProperty("os.name").toLowerCase().contains("linux")) {
            Runtime.getRuntime().exec("pkill -f chromedriver");
            Runtime.getRuntime().exec("pkill -f firefoxdriver");
            Runtime.getRuntime().exec("pkill -f edgedriver");
        }

    }

    public WebDriver getDriver(String browserName)
    {
        //Below is the code that helps us in letting the driver know that someone is willing to listen to all the activities that webdriver is doing
        EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<>(new WebDriverListeners());
        return switch (browserName.toUpperCase())
        {
            case "CHROME" -> decorator.decorate(new ChromeDriver(options.getChromeOptions()));
            case "FIREFOX" -> decorator.decorate(new FirefoxDriver(options.getFirefoxOptions()));
            case "EDGE" -> decorator.decorate(new EdgeDriver(options.getEdgeOptions()));
            case "SAFARI" -> decorator.decorate(new SafariDriver(options.getSafariOptions()));

            default -> throw new RuntimeException("Given browser: "+browserName+" is not found");
        };
    }
}
