import org.testng.annotations.Test;

public class Test_Suite extends BaseTest
{
    HomePage homePage = new HomePage();
    Registration_Page registrationPage = new Registration_Page();
    Registration_Result registrationResult = new Registration_Result();
    Log_In logIn = new Log_In();
    Electronics_Page electronicsPage = new Electronics_Page();
    Camera_Photo cameraPhoto = new Camera_Photo();
    Click_Email_AFriend emailAFriend = new Click_Email_AFriend();
    Email_Friend_Successfully emailFriendSuccessfully = new Email_Friend_Successfully();
    PrintVerify_Result printVerifyResult = new PrintVerify_Result();


    @Test (priority = 1)
    public void userIsAbleToRegisterSuccessfully()
    {
        homePage.waitUntilRegistrationLinkClickable();//waits until the Registration button is clickable.
        homePage.clickOnRegisterLink();//clicks on the Register Link.
        registrationPage.verifyPageURL();//verify Weather the landing page is registration page.
        registrationPage.userSubmitRegistrationFormSuccessfully();//fills the registration form with personal details and submits.
        registrationResult.waitsForSubmitButtonToDisappear();//Page waits until the submit button is disappeared.
        registrationResult.verifiesTheRegisteredMessageIsCorrect();//captures and verifies the registration complete message.
    }

    @Test (priority = 2)
    public void userIsAbleToLogINSuccessfully()
    {
        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.
    }

    @Test (priority = 3)
    public void userIsAbleToClickAndLandOnElectronicsPageSuccessfully()
    {
        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.
        homePage.waitUntilUserisInHomepage(); //After logged in successfully the page waits until the homepage is loaded.
        homePage.userAbleToClickElectronicsCategory(); //click on the electronics category in the homepage.
    }

    @Test (priority = 4)
    public void userISAbleToClickAndLandOnCameraPhotoPageSuccessfully()
    {
        logIn.verifyIfUserisLoggedIn(); //Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully(); //clicks on log in button and fills log in information of registered user.
        homePage.waitUntilUserisInHomepage(); //After logged in successfully the page waits until the homepage is loaded.
        homePage.userAbleToClickElectronicsCategory(); //click on the electronics category in the homepage.
        electronicsPage.waitForCamerPhotoButtonToClickable(); //waits until the page is landed on the Camera and photos sub category.
        electronicsPage.clickOnThePhotoAndCameraLink(); //click on the Camera and photos sub category.
    }

    @Test (priority = 5)
    public void userIsAbleToClickOnTheDesiredItem()
    {
        logIn.verifyIfUserisLoggedIn();  //Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully(); //clicks on log in button and fills log in information of registered user.
        homePage.waitUntilUserisInHomepage(); //After logged in successfully the page waits until the homepage is loaded.
        homePage.userAbleToClickElectronicsCategory(); //click on the electronics category in the homepage.
        electronicsPage.waitForCamerPhotoButtonToClickable(); //waits until the page is landed on the Camera and photos sub category.
        electronicsPage.clickOnThePhotoAndCameraLink(); //click on the Camera and photos sub category.
        cameraPhoto.waitForThirdCameraLinkToBeVisible(); //waits for the desired camera category to be loaded.
        cameraPhoto.userIsAbleToClickOnTheThirdCameraLink(); //clicks on the desired camera from the category.
    }


    @Test (priority = 6)
    public void userIsAbleToClickOnEmailAFriendButton(){
        logIn.verifyIfUserisLoggedIn();  //Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully(); //clicks on log in button and fills log in information of registered user.
        homePage.waitUntilUserisInHomepage(); //After logged in successfully the page waits until the homepage is loaded.
        homePage.userAbleToClickElectronicsCategory(); //click on the electronics category in the homepage.
        electronicsPage.waitForCamerPhotoButtonToClickable(); //waits until the page is landed on the Camera and photos sub category.
        electronicsPage.clickOnThePhotoAndCameraLink(); //click on the Camera and photos sub category.
        cameraPhoto.waitForThirdCameraLinkToBeVisible(); //waits for the desired camera category to be loaded.
        cameraPhoto.userIsAbleToClickOnTheThirdCameraLink(); //clicks on the desired camera from the category.
        emailAFriend.waitsForButtonToBeClickable(); //waits for email a friend button to be clickable
        emailAFriend.clicksOnEmailAFriendButton(); //clicks on email a friend button.
    }

    @Test (priority = 7)
    public void userIsAbleToFillEmailAFriendForm()
    {
        logIn.verifyIfUserisLoggedIn();  //Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully(); //clicks on log in button and fills log in information of registered user.
        homePage.waitUntilUserisInHomepage(); //After logged in successfully the page waits until the homepage is loaded.
        homePage.userAbleToClickElectronicsCategory(); //click on the electronics category in the homepage.
        electronicsPage.waitForCamerPhotoButtonToClickable(); //waits until the page is landed on the Camera and photos sub category.
        electronicsPage.clickOnThePhotoAndCameraLink(); //click on the Camera and photos sub category.
        cameraPhoto.waitForThirdCameraLinkToBeVisible(); //waits for the desired camera category to be loaded.
        cameraPhoto.userIsAbleToClickOnTheThirdCameraLink(); //clicks on the desired camera from the category.
        emailAFriend.waitsForButtonToBeClickable(); //waits for email a friend button to be clickable
        emailAFriend.clicksOnEmailAFriendButton(); //clicks on email a friend button.
        emailFriendSuccessfully.waitsForUrlToBe(); //waits for URl to be loaded.
        emailFriendSuccessfully.fillEmailAFriendForm(); //fills email a friend form.
    }

    @Test (priority = 8)
    public void userIsAbleToPrintAndVerifyResult(){
        logIn.verifyIfUserisLoggedIn();  //Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully(); //clicks on log in button and fills log in information of registered user.
        homePage.waitUntilUserisInHomepage(); //After logged in successfully the page waits until the homepage is loaded.
        homePage.userAbleToClickElectronicsCategory(); //click on the electronics category in the homepage.
        electronicsPage.waitForCamerPhotoButtonToClickable(); //waits until the page is landed on the Camera and photos sub category.
        electronicsPage.clickOnThePhotoAndCameraLink(); //click on the Camera and photos sub category.
        cameraPhoto.waitForThirdCameraLinkToBeVisible(); //waits for the desired camera category to be loaded.
        cameraPhoto.userIsAbleToClickOnTheThirdCameraLink(); //clicks on the desired camera from the category.
        emailAFriend.waitsForButtonToBeClickable(); //waits for email a friend button to be clickable
        emailAFriend.clicksOnEmailAFriendButton(); //clicks on email a friend button.
        emailFriendSuccessfully.waitsForUrlToBe(); //waits for URl to be loaded.
        emailFriendSuccessfully.fillEmailAFriendForm(); //fills email a friend form.
        printVerifyResult.printsAndVerifiesResult(); //Captures and Compares the expected result with Actual result, and prints the result.
    }




}
