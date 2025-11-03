package framework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestUtil {

     WebDriver driver;
     ExcelUtils excelUtils;
     SeleniumUtils seleniumUtils;
     JSFunctions jsFunctions;
     PropertiesUtil propertiesUtil;
     ElementUtils elementUtils;
     Reports reports;
     ExtentReports extentReports;
     ExtentTest extentTest;
     String scenarioName;
     Actions actions;
     String currentStep;
     SQLActions sqlActions;
     WaitManager waitManager;
    

     Map<String,String> testData=new HashMap<>();
     Map<String,Integer> tracker=new HashMap<>();

    public void setData(String key,String value)
    {
        testData.put(key,value);
    }

    public String getData(String key)
    {
        return testData.getOrDefault(key,"");
    }

    public synchronized void setTracker(String key,int value)
    {
        tracker.put(key,value);
    }

    public synchronized int getTracker(String key)
    {
        return tracker.getOrDefault(key,-1);
    }


}
