import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage {



    static String email = "simpsonhomer"+timeStamp()+"@outlook.co.uk";
    public static String timeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }


    public static void clickonElements(By by) {//click on elements........
        driver.findElement(by).click();
    }


    public static void TypetextofElements(By by, String text) {  //type text......
        driver.findElement(by).sendKeys(text);
    }


    public static String getTextElement(By by) {  //get text.................
        return driver.findElement(by).getText();
        //String registerSuccessText = driver.findElement((By.className("result"))).getText();
        //System.out.println(registerSuccessText);
    }

    public static void SelectElement(By by, String Text) {
        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByVisibleText(Text);
        // Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        // selectDay.selectByVisibleText("8");
    }

    public static void SelectbyIndex(By by, int index) {
        Select selectMonth = new Select(driver.findElement(by));
        selectMonth.selectByIndex(index);
//  Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")));
//  selectMonth.selectByIndex(5);
//  Select selectYear = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")));
//  selectYear.selectByIndex(10);
    }


    public static void waituntilclickable(int sec, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
//  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
    }

    public static void waituntilvisible(int sec, By by) {
        WebDriverWait visible = new WebDriverWait(driver, Duration.ofSeconds(sec));
        visible.until(ExpectedConditions.visibilityOfElementLocated(by));
//  WebDriverWait visible = new WebDriverWait(driver, Duration.ofSeconds(20));
//  visible.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-button")));
    }


    public static String waitforUrltobe(int sec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        String url = driver.getCurrentUrl();
        wait.until(ExpectedConditions.urlToBe(url));
        return url;
    }


    public static void waitforinvisible(int sec, By by) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(by));
//  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//  wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("register-button")));


    }


}
