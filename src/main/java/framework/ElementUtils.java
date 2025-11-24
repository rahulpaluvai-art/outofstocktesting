package framework;

import framework.constants.LogStatus;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ElementUtils {

    WebDriver driver;

    public WebElement findElement(By by)
    {
        try {
            return driver.findElement(by);
        }

        catch (NoSuchElementException e2)
        {
            throw new GenericExceptions("Element is not found for the given locator: " + by);
        }

        catch (StaleElementReferenceException e1)
        {
            throw new GenericExceptions("Element is stale for the  please check it");
        }
    }

    public WebElement findElement(By by, String... labelName)
    {
        try {
            return driver.findElement(by);
        }

        catch (NoSuchElementException e4)
        {
            if(labelName.length>0)
                throw new GenericExceptions("Element is not found for the given locator: " + labelName[0]);
            else
                throw new GenericExceptions("Element is not found for the given locator");

        }

        catch (StaleElementReferenceException e5)
        {
            if(labelName.length>0)
                throw new GenericExceptions("Element is stale for the  " + labelName[0]+" please check it");
            else
                throw new GenericExceptions("Element is stale please check it");

        }
    }

    public WebElement findElement(By by, int time,String... labelName)
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

            //Return the webelement if it is found under the given time
            return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }

        catch (NoSuchElementException e4)
        {
            if(labelName.length>0)
                throw new GenericExceptions("Element is not found for the given locator: " + labelName[0]);
            else
                throw new GenericExceptions("Element is not found for the given locator");

        }

        catch (InvalidSelectorException e1)
        {
            if(labelName.length>0)
                throw new GenericExceptions("Xpath syntax is wrong for the given locator: " + labelName[0]);
            else
                throw new GenericExceptions("Xpath syntax is wrong for the given locator");

        }

        catch (TimeoutException e2)
        {
            if(labelName.length>0)
                throw new GenericExceptions("Element is not found for the given locator: " + labelName[0]+" after waiting for: "+time+" seconds");
            else
                throw new GenericExceptions("Element is not found for the given locator after waiting for: "+time+" seconds");
        }
    }

    public List<WebElement> findElements(By by)
    {
        return driver.findElements(by);
    }

    public List<WebElement> findElements(By by, int time)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));

        //Return the list of webelements if it is found under the given time
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
}
