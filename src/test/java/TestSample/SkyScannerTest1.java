package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyScannerTest1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.skyscanner.com/");
      //  WebElement radiobutton = d.findElement(By.xpath("//span[contains(text(),'Multi-city')]"));
       // radiobutton.click();
   //     WebElement button = d.findElement(By.xpath("//button[contains(text(),'India (IN)')]"));
     //   button.click();

    }
}
