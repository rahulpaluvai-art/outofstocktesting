package pages;

import framework.ReusableLibrary;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PLPPages extends ReusableLibrary {

    By lnk_Products= By.xpath("//span[text()='Sort By']/following::a[@title]");

    /************************************************************************************************************************/

    public PDPPage clickOnFirstProduct()
    {
        seleniumUtils.clickOn(lnk_Products,"Products");
        return new PDPPage();
    }


}
