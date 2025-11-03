package pages;

import framework.ReusableLibrary;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PLPPages extends ReusableLibrary {

    By lnk_Products= By.xpath("//div[text()='ITEMS FOUND']/following::a[@title]");

    /************************************************************************************************************************/

    public PLPPages clickOnFirstProduct()
    {
        seleniumUtils.clickOn(lnk_Products,"Products");
        return this;
    }


}
