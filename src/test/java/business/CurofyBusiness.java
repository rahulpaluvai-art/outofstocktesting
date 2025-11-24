package business;

import pages.HomeScreen;
import pages.PDPPage;
import pages.PLPPages;

public class CurofyBusiness {

    HomeScreen homeScreen=new HomeScreen();
    PLPPages plpPages=new PLPPages();
    PDPPage pdpPage=new PDPPage();

    public void checkForOutOfStockItems() {

       boolean onlyTextFound=homeScreen
                .checkForAdPopupAndCloseIt()
                .enterDataIntoSearch("Dresses")
                .clickOnFirstProduct()
                .checkForPresenceOfOnly();

       if(onlyTextFound)
           System.out.println(pdpPage.getOnlyText());

       pdpPage.fetchSKUID();
    }
}
