package framework;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class WaitManager {

    WebDriver driver;

    public boolean checkForPresenceOfElement(By by)
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        }

        catch (NoSuchElementException e2)
        {
            return false;
        }

        catch (TimeoutException e1)
        {
            return false;
        }
    }
}
