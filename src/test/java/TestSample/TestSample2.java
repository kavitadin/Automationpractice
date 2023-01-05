package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample2 {
    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://phptravels.net/");
               // WebElement citycontainer = d.findElement(By.xpath("//*[@id=\"select2-hotels_city-container\"]']"));
        //citycontainer.sendKeys("Delhi");
        WebElement Flights = d.findElement(By.xpath("//*[@id=\"flights-tab\"]/span[2]/span"));
        Flights.click();
        WebElement autocomplete = d.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
        autocomplete.sendKeys("London");
     WebElement ToDestination = d.findElement(By.xpath("//*[@id=\"autocomplete2\"]"));
      ToDestination.sendKeys("India");
      WebElement Departure = d.findElement(By.xpath("//*[@id=\"departure\"]"));
      Departure.click();
      WebElement Travellers = d.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/a/p"));
      Travellers.click();
      WebElement FlightSearch = d.findElement(By.xpath("//*[@id=\"flights-search\"]"));
      FlightSearch.click();


    }
}