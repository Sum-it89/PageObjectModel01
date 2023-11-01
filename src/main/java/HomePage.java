import org.openqa.selenium.By;

public class HomePage extends Utils {


    public void waitUntilRegistrationLinkClickable(){
        waituntilclickable(10, By.linkText("Register"));
    }
    public void clickOnRegisterLink (){
        clickonElements(By.linkText("Register"));
    }

    public void waitUntilUserisInHomepage(){
        waitforUrltobe(5);
    }

    public void userAbleToClickElectronicsCategory(){
        clickonElements(By.xpath("//div[@class=\"category-item\"]/h2"));
    }



}
