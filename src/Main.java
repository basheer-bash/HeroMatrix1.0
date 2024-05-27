import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Get web driver
        System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //New Object
        WebDriver driver = new ChromeDriver();
        //Edge.get("https://www.heromatrix.online/");


        //open the full size window
        driver.manage().window().maximize();

        //Get the web with driver.get to open it
        driver.get("https://www.heromatrix.online/");



        //Get the Title of the web
        String Title = driver.getTitle();
        System.out.println("The Title is: " + Title);



        //find element
        WebElement login = driver.findElement(By.id("login"));
        WebElement password = driver.findElement(By.id("password"));

        //send keys to the inputs field values
        login.sendKeys("bash");
        password.sendKeys("hello");


        //Click by driver.find element
        driver.findElement(By.className("button-1")).click();

        System.out.println(login);
        System.out.println(password);


        //check if the welcome title equal to the username

        WebElement TitleOfPlayer = driver.findElement(By.id("player"));
        System.out.println(TitleOfPlayer.getText());
        String LengthTitleOfPlayer = TitleOfPlayer.getText();
        System.out.println(LengthTitleOfPlayer);
        String actual = LengthTitleOfPlayer.substring(8,LengthTitleOfPlayer.length());
        System.out.println(actual);
        System.out.println(actual.equals(TitleOfPlayer.getText()));
        System.out.println(actual.equals(login.getText()));




        // close browser and Driver
        driver.quit();

    }
}
