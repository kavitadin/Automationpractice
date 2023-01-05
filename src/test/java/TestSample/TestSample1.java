package TestSample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.saucedemo.com/");
        WebElement uname = d.findElement(By.xpath("//*[@id=\"user-name\"]"));
        uname.sendKeys("standard_user");
        WebElement upassword = d.findElement(By.xpath("//*[@id=\"password\"]"));
        upassword.sendKeys("secret_sauce");
        WebElement loginButton = d.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();
//   WebElement product_sort_container = d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
//   product_sort_container.getText("Price(high to low");
        WebElement addToCart1 = d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
         addToCart1.click();
         WebElement addToCart2 = d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
         addToCart2.click();
    }
}


