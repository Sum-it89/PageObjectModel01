import org.openqa.selenium.By;
import org.testng.Assert;

public class PrintVerify_Result extends Utils
{
    public void printsAndVerifiesResult(){
        String result = getTextElement(By.xpath("//div[@class=\"result\"]"));
        System.out.println(result);
        Assert.assertEquals(getTextElement(By.xpath("//div[@class=\"result\"]")), result, "Message does not match");
    }


}
