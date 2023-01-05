package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.rightmove.co.uk/");
        WebElement TypeAheadInputField = d.findElement(By.xpath("//*[@id=\"_3OuiRnbltQyS534SB4ivLV\"]/div/div/div/div/input"));
    TypeAheadInputField.sendKeys("Audenshaw Tram Stop");
    WebElement ForSalebutton = d.findElement(By.xpath("//*[@id=\"_3OuiRnbltQyS534SB4ivLV\"]/div/div/div/button[2]"));
    ForSalebutton.click();
    WebElement FindProperties = d.findElement(By.xpath("//button[@id='submit']"));
    FindProperties.click();
   WebElement sortdropdown = d.findElement(By.xpath("//*[@id=\"sortDropdown\"]/label"));
   sortdropdown.sendKeys("Oldest Listed");
   WebElement SortType = d.findElement(By.xpath("//*[@id=\"sortType\"]"));
   SortType.sendKeys("Newest Listed");

    }
    }