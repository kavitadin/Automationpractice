package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHeroKaupp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("http://hotmail.com//");
        d.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a")).click();
       d.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("kavita.dineshkumar@hotmail.com");
        d.findElement(By.id("idSIButton9")).click();
        d.close();


       // WebElement Testing = d.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a"));
        //Testing.click();
        //WebElement Content = d.findElement(By.xpath("//*[@id=\"content\"]/ul/li[24]"));
        //Content.click();

    }
}
