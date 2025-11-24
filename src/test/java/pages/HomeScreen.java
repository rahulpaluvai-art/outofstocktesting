package pages;

import framework.PathUtils;
import framework.ReusableLibrary;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class HomeScreen extends ReusableLibrary {

    By txt_Search= By.xpath("//div[text()='What are you looking for?']");
    By txt_SearchData=By.xpath("//input[@placeholder='Search for latest fashion']");
    By lnk_Women=By.xpath("//a[@role = 'button']//descendant::span[text() = 'WOMEN']");
    By lnk_Beauty=By.xpath("//a[@role = 'button']//descendant::span[text() = ‘BEAUTY’]");
    By lnk_Kids=By.xpath("//a[@role = 'button']//descendant::span[text() = ‘KIDS’]");
    By lnk_Home=By.xpath("//a[@role = 'button']//descendant::span[text() = ‘HOME’]");
    By img_Ad=By.xpath("//img[@alt='inApp Popup']");
    By btn_CloseAd=By.xpath("//div[@class='no-gtm-banner']/descendant::span[@role='button']");

    /************************************************************************************************************/

    public HomeScreen checkForAdPopupAndCloseIt()
    {
        if(!waitManager.checkForPresenceOfElement(img_Ad))
        {
            PathUtils.applySleep(5000);
        }

        seleniumUtils.clickOn(btn_CloseAd,"Close Ad");
        return this;
    }
    public PLPPages enterDataIntoSearch(String searchData)
    {
        PathUtils.applySleep(5000);
        seleniumUtils.clickOn(txt_Search,"Search")
                .typeOn(txt_SearchData,searchData,"Search")
                .sendKeys(txt_SearchData, Keys.ENTER);

        return new PLPPages();
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
