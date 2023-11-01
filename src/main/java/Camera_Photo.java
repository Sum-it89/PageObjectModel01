import org.openqa.selenium.By;

public class Camera_Photo extends Utils
{

    public void waitForThirdCameraLinkToBeVisible(){
        waituntilvisible(5, By.xpath("//div[@class=\"products-container\"]/div[2]/div/div/div[3]/div/div[2]/h2"));
    }

   public void userIsAbleToClickOnTheThirdCameraLink(){
       clickonElements(By.xpath("//div[@class=\"products-container\"]/div[2]/div/div/div[3]/div/div[2]/h2"));
   }

}
