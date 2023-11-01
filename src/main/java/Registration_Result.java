import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration_Result extends Utils {



    public void waitsForSubmitButtonToDisappear() {

        waitforinvisible(5, (By.id("register-button")));
    }

    public void verifiesTheRegisteredMessageIsCorrect() {
        //Verifies the registered message is correct or not............................
        Assert.assertEquals(getTextElement(By.className("result")), "Your registration completed", "Expected message does not match the actual");
    }


}
