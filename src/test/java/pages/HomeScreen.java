package pages;

import framework.ReusableLibrary;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class HomeScreen extends ReusableLibrary {

    By txt_Search= By.xpath("//div[text()='What are you looking for?']");
    By lnk_Women=By.xpath("//a[@role = 'button']//child::span[text() = 'WOMEN']");
    By lnk_Beauty=By.xpath("//a[@role = 'button']//child::span[text() = ‘BEAUTY’]");
    By lnk_Kids=By.xpath("//a[@role = 'button']//child::span[text() = ‘KIDS’]");
    By lnk_Home=By.xpath("//a[@role = 'button']//child::span[text() = ‘HOME’]");

    /************************************************************************************************************/

    public HomeScreen enterDataIntoSearch(String searchData)
    {
        seleniumUtils.typeOn(txt_Search,searchData,"Search");
        return this;
    }

    public HomeScreen clickOnWomen()
    {
        seleniumUtils.clickOn(lnk_Women, "Women");
        return this;
    }

    public HomeScreen clickOnBeauty()
    {
        seleniumUtils.clickOn(lnk_Beauty, "Beauty");
        return this;
    }

    public HomeScreen clickOnKids()
    {
        seleniumUtils.clickOn(lnk_Kids, "Kids");
        return this;
    }

    public HomeScreen clickOnHome()
    {
        seleniumUtils.clickOn(lnk_Home, "Home");
        return this;
    }





}
