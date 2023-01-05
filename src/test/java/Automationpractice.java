import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://itera-qa.azurewebsites.net/home/automation");

        d.findElement(By.id("name")).sendKeys("ABC");
        d.findElement(By.id("phone")).sendKeys("1234");
        d.findElement(By.id("email")).sendKeys("abc@gmail.com");
        d.findElement(By.id("password")).sendKeys("23@ab");
        d.findElement(By.id("address")).sendKeys("Phase 1, A block, ABC building");
        d.findElement(By.name("submit")).click();

            }

}
