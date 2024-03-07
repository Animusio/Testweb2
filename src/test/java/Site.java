import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
            WebElement Button = driver.findElement(By.xpath("//*[contains(text(), '" + groupLink + "')]"));
            Button.click();
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

        }
        String todayInfo(){

             String result = "________________________________________________\n";
            String denNedeli1 = (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String denNedeli2 = (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String denNedeli3 = (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
             String denNedeli4 = (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String denNedeli5 = (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String denNedeli6 = (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());

             if(denNedeli4.contains("понедельник") && denNedeli1.contains("сегодня")){
                 result += (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]/div[1]/span[1]")).getText());
                 result +="\n";
                 result += (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]/div[2]")).getText());
                 result += "\n________________________________________________\n";
             }
            if(denNedeli4.contains("вторник") && denNedeli2.contains("сегодня")){
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]/div[1]/span")).getText());
                result +="\n";
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]/div[2]")).getText());
                result += "\n________________________________________________\n";
            }
            if(denNedeli4.contains("среда") && denNedeli3.contains("сегодня")){
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]/div[1]/span")).getText());
                result +="\n";
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]/div[2]")).getText());
                result += "\n________________________________________________\n";
            }
            if(denNedeli4.contains("четверг") && denNedeli4.contains("сегодня")){
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[1]/span")).getText());
                result +="\n";
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[2]")).getText());
                result += "\n________________________________________________\n";
            }
            if(denNedeli4.contains("пятница") && denNedeli5.contains("сегодня")){
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[1]/span")).getText());
                result +="\n";
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[2]")).getText());
                result += "\n________________________________________________\n";
            }
            if(denNedeli4.contains("суббота") && denNedeli6.contains("сегодня")){
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[1]/span")).getText());
                result +="\n";
                result += (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[2]")).getText());
                result += "\n________________________________________________\n";
            }
              return result;
    }
}