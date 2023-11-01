import org.openqa.selenium.By;

public class Click_Email_AFriend extends Utils
{
    public void waitsForButtonToBeClickable(){
        waituntilclickable(5, By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));
    }

    public void clicksOnEmailAFriendButton(){
        //Clicks on the 3rd button refer a friend................................
        clickonElements(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));
    }
}
