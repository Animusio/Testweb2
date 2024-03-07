import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
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
        void enterGroup(String groupLink){
            WebElement Button = driver.findElement(By.xpath("//*[contains(text(), '" + groupLink + "')]"));
            Button.click();
        }
        String generalInfo() {
            String result = "________________________________________________\n";

            String zanatiyaest1 =(driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String zanatiyaest2 =(driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String zanatiyaest3 =(driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
            String zanatiyaest4 =(driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String zanatiyaest5 =(driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String zanatiyaest6 =(driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());


            if(zanatiyaest1.contains("Занятий нет")){
                result += "Понедельник";
                result +="\n"+"\n";
                result += "Занятий нет(хороший балдеж (МЕД))";
                result += "\n________________________________________________\n";
            }else {

                WebElement parentElement = driver.findElement(By.id("dayWeek1"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Понедельник";
                result += "\n__________________________";
                String time;
                String nomerPari ;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                  result += "\n__________________________________________________________\n";


            }
            if(zanatiyaest2.contains("Занятий нет")){
                result += "Вторник";
                result +="\n"+"\n";
                result += "Занятий нет(хмм....нуу...эмм... типо ок)";
                result += "\n________________________________________________\n";
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek2"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Вторник";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n__________________________________________________________\n";
            }
            if(zanatiyaest3.contains("Занятий нет")){
                result += "Среда";
                result +="\n"+"\n";
                result += "Занятий нет(ну вроде)";
                result += "\n________________________________________________\n";
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek3"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Среда";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n__________________________________________________________\n";
            }
            if(zanatiyaest4.contains("Занятий нет")){
                result += "Четверг";
                result +="\n"+"\n";
                result += "Занятий нет(умеренный балдеж 6/10)";
                result += "\n________________________________________________\n";
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek4"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Четверг";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n________________________________________________\n";
            }
            if(zanatiyaest5.contains("Занятий нет")){
                result += "Пятница";
                result +="\n"+"\n";
                result += "Занятий нет                   =)";
                result += "\n________________________________________________\n";
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek5"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Пятница";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________________________________________\n";
                }

                result += "\n__________________________________________________________\n";
            }
            if(zanatiyaest6.contains("Занятий нет")){
                result += "Суббота";
                result +="\n"+"\n";
                result += "Занятий нет(extra hypeовый 10/10)";
                result += "\n________________________________________________\n";
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek6"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Суббота";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n__________________________________________________________\n";
            }

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
                 WebElement parentElement = driver.findElement(By.id("dayWeek1"));
                 List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                 result+="\n                       Понедельник";
                 result += "\n__________________________";
                 String time;
                 String nomerPari;
                 String disciplina;
                 String prepod;
                 String cabinet;

                 for (WebElement element : disciplineListElements) {

                     time = element.findElement(By.className("disc-time")).getText();
                     nomerPari = element.findElement(By.className("disc-number")).getText();
                     disciplina = element.findElement(By.className("disc-name")).getText();
                     prepod = element.findElement(By.className("disc-teacher-link")).getText();
                     cabinet = element.findElement(By.className("disc-cab")).getText();
                     result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                     result += "\n__________________________";
                 }

                 result += "\n__________________________________________________________\n";
             }
            if(denNedeli4.contains("вторник") && denNedeli2.contains("сегодня")){
                WebElement parentElement = driver.findElement(By.id("dayWeek2"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Вторник";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n__________________________________________________________\n";
            }
            if(denNedeli4.contains("среда") && denNedeli3.contains("сегодня")){
                WebElement parentElement = driver.findElement(By.id("dayWeek3"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Среда";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n__________________________________________________________\n";
            }
            if(denNedeli4.contains("четверг") && denNedeli4.contains("сегодня")){
                WebElement parentElement = driver.findElement(By.id("dayWeek4"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Четверг";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }

                result += "\n________________________________________________\n";
            }
            if(denNedeli4.contains("пятница") && denNedeli5.contains("сегодня")){
                WebElement parentElement = driver.findElement(By.id("dayWeek5"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Пятница";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________________________________________\n";
                }

                result += "\n__________________________________________________________\n";
            }
            if(denNedeli4.contains("суббота") && denNedeli6.contains("сегодня")){
                WebElement parentElement = driver.findElement(By.id("dayWeek6"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result+="\n                       Суббота";
                result += "\n__________________________";
                String time;
                String nomerPari;
                String disciplina;
                String prepod;
                String cabinet;

                for (WebElement element : disciplineListElements) {

                    time = element.findElement(By.className("disc-time")).getText();
                    nomerPari = element.findElement(By.className("disc-number")).getText();
                    disciplina = element.findElement(By.className("disc-name")).getText();
                    prepod = element.findElement(By.className("disc-teacher-link")).getText();
                    cabinet = element.findElement(By.className("disc-cab")).getText();
                    result +="\n" + "Пара №: " + nomerPari + "\n" + "\n" + time + "\n" + "\n" + disciplina + "\n" + "\n" + "Преподователь: " + prepod + "\n" + "\n" + "Кабинет: " + cabinet;
                    result += "\n__________________________";
                }
                result += "\n__________________________________________________________\n";
            }
            return result;
        }

    }