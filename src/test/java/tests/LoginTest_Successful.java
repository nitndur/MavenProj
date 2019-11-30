package tests;
import org.testng.SkipException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserHomePage;

public class LoginTest_Successful extends BaseTest {

    @Test

    public void login() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        UserHomePage userHomePage = new UserHomePage(driver);

        homePage.launchAmazonUrl()
                .clickSignIn()
                .enterEmail("vinuanand_vinu@yahoo.com")
                .clickContinue()
                .enterPassword("Yahoochat1")
                .clickSignIn();
        userHomePage.verifySignIn();


    }

   /* @Test
    public void test1(){
        System.out.println("In test1 method. It always succeeds.");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void test2(){
        System.out.println("In test2 method that expects runtime exception");
    }

    @Test
    public void test3(){
        throw new SkipException("Skipping the test3 method");
    }*/


}
