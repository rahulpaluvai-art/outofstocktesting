package stepDefs;

import business.CurofyBusiness;
import framework.ReusableLibrary;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class OutOfStockStepDefs extends ReusableLibrary
{
    CurofyBusiness business=new CurofyBusiness();

    @Given("Launch the Application")
    public void launchTheApplication() {
        seleniumUtils.launchApplication(propertiesUtil.getURL());
    }

    @And("Validate Out of Stock Products")
    public void validateOutOfStockProducts() {
       business.checkForOutOfStockItems();
    }
}
