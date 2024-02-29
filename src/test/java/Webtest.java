import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Webtest {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.ru/");


        WebElement registerButton = driver.findElement(By.xpath("//button[contains(text(),'Войти')]"));
        registerButton.click();


        //driver.findElement(By.id("username")).sendKeys("XXXXXXXXX");
        Thread.sleep(2000);


        driver.quit();


    }
}
