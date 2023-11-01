import org.openqa.selenium.By;

public class Email_Friend_Successfully extends Utils
{

    public void waitsForUrlToBe()
    {
        //waits for the URL to be
        waitforUrltobe(5);
    }
    public void fillEmailAFriendForm(){
        //fills in the email in the refer a friend form...........................
        TypetextofElements(By.className("friend-email"), "best_friend@yahoo.com");

        //Types in the personal message in the form.............................
        TypetextofElements(By.xpath("//textarea[@id=\"PersonalMessage\"]"), "Many Many Happy Returns of the day");

        //Clicks on the send email button........
        clickonElements(By.xpath("//button[@name=\"send-email\"]"));
    }


}
