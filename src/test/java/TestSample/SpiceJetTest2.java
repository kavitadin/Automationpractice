package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetTest2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.spicejet.com//");
        WebElement button = d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[2]/div/div/div[1]/div[6]"));
        button.click();
    }
}
