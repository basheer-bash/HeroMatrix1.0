import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Get web driver
        System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //New Object
        WebDriver driver = new ChromeDriver();
        //Edge.get("https://www.heromatrix.online/");


        //open the full size window
       // driver.manage().window().maximize();

        //WebDriver driver = null;
        driver.get("https://www.heromatrix.online/");
        LoginPage lg = new LoginPage(driver);
        lg.enteruserName("basheer");
        lg.enterPassword("basheer");
        lg.clickbuttom();
        //Get the web with driver.get to open it
        //driver.get("https://www.heromatrix.online/");
        System.out.println("Test Sucsefuly");
        //back one page
        //driver.navigate().bacjk();









//        // -----------------------------------------------------------//
        //if i stand in the loging page
       // String ExpectedTitle = "HeroMatrix";
        //WebElement TitleForNow = driver.findElement(By.id("player"));

       // String TitleForNowACTUAL = TitleForNow.getText();
      //  System.out.println(TitleForNowACTUAL + "basheer");
       // assertEquals(ExpectedTitle , TitleForNowACTUAL);

//        //------------------------------------------------------------//






        //Get the Title of the web
        String Title = driver.getTitle();
        System.out.println("The Title is: " + Title);



        //find element
//        WebElement login = driver.findElement(By.id("login"));
//        WebElement password = driver.findElement(By.id("password"));
//
//        //send keys to the inputs field values
//        login.sendKeys("bash");
//        password.sendKeys("hello");
//        Thread.sleep(2000);
//
//
//        //Click by driver.find element
//        driver.findElement(By.className("button-1")).click();
//
//        System.out.println(login);
//        System.out.println(password);
//
//
//        //check if the welcome title equal to the username
//        WebElement TitleOfPlayer = driver.findElement(By.id("player"));
//        String LengthTitleOfPlayer = TitleOfPlayer.getText();
//        String actual = LengthTitleOfPlayer.substring(8,LengthTitleOfPlayer.length());
//        assertEquals("bash",actual);
//        System.out.println(actual);


     // close browser and Driver
        driver.quit();






    }
}
