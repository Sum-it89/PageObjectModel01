import org.openqa.selenium.By;

public class Electronics_Page extends Utils
{

    public void waitForCamerPhotoButtonToClickable(){
        waituntilclickable(5, By.xpath("//img[@alt=\"Picture for category Camera & photo\"]"));
    }

    public void clickOnThePhotoAndCameraLink(){
        //clicks on the Camera & photo sub-category...............................
        clickonElements(By.xpath("//img[@alt=\"Picture for category Camera & photo\"]"));
    }
}
