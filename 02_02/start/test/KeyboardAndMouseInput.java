import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/lau/Downloads/EXTOOLS/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);

        name.sendKeys("Test name");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        driver.quit();

    }
}