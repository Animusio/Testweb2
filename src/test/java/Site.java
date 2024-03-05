import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.StringReader;
import java.util.concurrent.TimeUnit;


public class Site {
        WebDriver driver= new ChromeDriver();
        public Site(){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.ugrasu.ru/timetable/faculty/163");
        }
        void quit(){
            driver.quit();
        }
        void back(){
            driver.get("https://www.ugrasu.ru/timetable/faculty/163");
        }
        void enterGroup(String groupLink){
            WebElement registerButton = driver.findElement(By.xpath("//*[contains(text(), '" + groupLink + "')]"));
            registerButton.click();
            System.out.println("Группа - " + groupLink);
        }
        String generalInfo() {
            String result = "________________________________________________\n";

            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]/div[1]/span[1]")).getText());
            result +="\n";
            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]/div[2]")).getText());
            result += "\n________________________________________________\n";

            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]/div[1]/span")).getText());
            result +="\n";
            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]/div[2]")).getText());
            result += "\n________________________________________________\n";

            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]/div[1]/span")).getText());
            result +="\n";
            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]/div[2]")).getText());
            result += "\n________________________________________________\n";

            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[1]/span")).getText());
            result +="\n";
            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[2]")).getText());
            result += "\n________________________________________________\n";

            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[1]/span")).getText());
            result +="\n";
            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[2]")).getText());
            result += "\n________________________________________________\n";

            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[1]/span")).getText());
            result +="\n";
            result += (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[2]")).getText());
            result += "\n________________________________________________\n";
            return result;

        }}