package pages;

import framework.ReusableLibrary;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.By;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class PDPPage extends ReusableLibrary {

    By fld_Only= By.xpath("//div[contains(text(),'SAR')]/ancestor::div/descendant::span[contains(text(),'Only')]");
    By fld_SizeDetails=By.xpath("//div[text()='Pick your size']/following::div[contains(@class,'size-unit')]/descendant::div[@role='button']");
    By lnk_OutOfStock=By.xpath("//a[text() = 'Out of Stock']");
    By fld_SKUID=By.xpath("//div[text() = 'Product Code']//following-sibling::div//p");

    /************************************************************************************************************/

    public boolean checkForPresenceOfOnly()
    {
        return waitManager.checkForPresenceOfElement(fld_Only);
    }

    public String getOnlyText()
    {
        return seleniumUtils.getText(fld_Only,"Only Text");
    }

    public String fetchSKUID()
    {
        return seleniumUtils.getText(fld_SKUID,"SKU ID");
    }
}
