import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManager {


   @BeforeMethod
    public void setup(){
        OpenBrowser();

    }

   @AfterMethod
    public void tearDown(){
       quit();
    }



}
