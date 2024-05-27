//import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver firefox = new FirefoxDriver();
        //WebDriver Edge = new EdgeDriver();

        //Edge.get("https://www.heromatrix.online/");
        driver.get("https://www.heromatrix.online/");


        String Title = driver.getTitle();
        System.out.println("The Title is: " + Title);

        //driver.quit();// close browser

        //find element
        WebElement login = driver.findElement(By.id("login"));
        WebElement password = driver.findElement(By.id("password"));

        //send keys to the inpts field valuse
        login.sendKeys("basheer");
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
        System.out.println(actual == TitleOfPlayer.getText());
        System.out.println(actual == login.getText());





        driver.quit();/* close browser */
    }
}
