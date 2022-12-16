package cookiesClicker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class cookiesClicker {
    static WebDriver driver;

    public static void main(String [] args) {
        WebDriverManager.chromedriver().setup(); // setting up the web driver manager

        driver = new ChromeDriver();

        driver.get("https://orteil.dashnet.org/cookieclicker/");

        long startTime = System.currentTimeMillis();

        WebElement languageSelect = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.id("langSelect-EN")));

        //WebElement languageSelect = driver.findElement(By.id("langSelect-EN"));


        languageSelect.click();


        WebElement cookiesClick = driver.findElement(By.id("bigCookie"));


//        long duration = 0;
//        while ( duration < 60000){
//            cookiesClick.click();
//            long endTime = System.currentTimeMillis();
//            duration = endTime - startTime;
//        }

        for(int clicksNumber = 0; clicksNumber <= 300; clicksNumber++)
            {
                cookiesClick.click();
            }
        driver.quit();
    }
}
