import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.*;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/lau/Downloads/EXTOOLS/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        sleep(4000);
        WebElement uploadField = driver.findElement(By.id("file-upload-field"));
        sleep(4000);
        uploadField.sendKeys("file-to-upload.png");
        sleep(199000);

        driver.quit();
    }
}
