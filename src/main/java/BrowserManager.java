import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils {



    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");

    }


    public void quit() {
        driver.quit();

    }


}
