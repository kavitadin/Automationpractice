package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceCalculator {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html");
        //WebElement NamePlate= d.findElement(By.xpath("//*[@id=\"model-select-render\"]/div[3]/div[1]/div/div[1]/a/span/div)"));
        //NamePlate.click();
      //  WebElement NamePlate = d.findElement(By.xpath("//*[@id=\"model-select-render\"]/div[3]/div[1]/div/div[5]/a/span"));
        //NamePlate.click();
        WebElement button = d.findElement(By.xpath("//*[@id=\"model-select-render\"]/div[2]/div[2]/button[2]"));
   button.click();
    }
}

