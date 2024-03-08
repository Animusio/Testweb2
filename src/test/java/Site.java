import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
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
            StringBuilder result = new StringBuilder("________________________________________________\n");
            week generate = new week();
            String dayWeek1 =(driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String dayWeek2 =(driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String dayWeek3 =(driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
            String dayWeek4 =(driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String dayWeek5 =(driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String dayWeek6 =(driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());

//            result.append(generate.generateWeek(driver, dayWeek1, "Понедельник","Занятий нет((МЕД))"));
//            result.append(generate.generateWeek(driver, dayWeek2, "Вторник","Занятий нет(очен жал)"));
//            result.append(generate.generateWeek(driver, dayWeek3, "Среда","Занятий нет((МЕД))"));
//            result.append(generate.generateWeek(driver, dayWeek4, "Четверг","Занятий нет((МЕД))"));
//            result.append(generate.generateWeek(driver, dayWeek5, "Пятница","Занятий нет((МЕД))"));
//            result.append(generate.generateWeek(driver, dayWeek6, "Суббота","Занятий нет((МЕД))"));


            if(dayWeek1.contains("Занятий нет")){
                result.append("Понедельник");
                result.append("""


                        """);
                result.append("Занятий нет((МЕД))");
                result.append("\n________________________________________________\n");
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek1"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result.append("\n                       Понедельник");
                result.append("\n__________________________");
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
                    result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                    result.append("\n__________________________");
                }
                  result.append("\n__________________________________________________________\n");
            }
            if(dayWeek2.contains("Занятий нет")){
                result.append("Вторник");
                result.append("""


                        """);
                result.append("Занятий нет(очен жал)");
                result.append("\n________________________________________________\n");
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek2"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result.append("\n                       Вторник");
                result.append("\n__________________________");
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
                    result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                    result.append("\n__________________________");
                }
                result.append("\n__________________________________________________________\n");
            }
            if(dayWeek3.contains("Занятий нет")){
                result.append("Среда");
                result.append("""


                        """);
                result.append("Занятий нет(ну вроде)");
                result.append("\n________________________________________________\n");
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek3"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result.append("\n                       Среда");
                result.append("\n__________________________");
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
                    result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                    result.append("\n__________________________");
                }
                result.append("\n__________________________________________________________\n");
            }
            if(dayWeek4.contains("Занятий нет")){
                result.append("Четверг");
                result.append("""


                        """);
                result.append("Занятий нет(умеренный балдеж 6/10)");
                result.append("\n________________________________________________\n");
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek4"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result.append("\n                       Четверг");
                result.append("\n__________________________");
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
                    result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                    result.append("\n__________________________");
                }
                result.append("\n________________________________________________\n");
            }
            if(dayWeek5.contains("Занятий нет")){
                result.append("Пятница");
                result.append("""


                        """);
                result.append("Занятий нет                   =)");
                result.append("\n________________________________________________\n");
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek5"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result.append("\n                       Пятница");
                result.append("\n__________________________");
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
                    result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                    result.append("\n__________________________________________________________\n");
                }

                result.append("\n__________________________________________________________\n");
            }
            if(dayWeek6.contains("Занятий нет")){
                result.append("Суббота");
                result.append("""


                        """);
                result.append("Занятий нет(extra hype 10/10)");
                result.append("\n________________________________________________\n");
            }else {
                WebElement parentElement = driver.findElement(By.id("dayWeek6"));
                List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                result.append("\n                       Суббота");
                result.append("\n__________________________");
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
                    result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                    result.append("\n__________________________");
                }
                result.append("\n__________________________________________________________\n");
            }
            return result.toString();
            }
        String todayInfo(){
             StringBuilder result = new StringBuilder("________________________________________________\n");

            String dayWeek1 =(driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String dayWeek2 =(driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String dayWeek3 =(driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
            String dayWeek4 =(driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String dayWeek5 =(driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String dayWeek6 =(driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());

            String denNedeli1 = (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String denNedeli2 = (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String denNedeli3 = (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
            String denNedeli4 = (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String denNedeli5 = (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String denNedeli6 = (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());

             if(denNedeli1.contains("сегодня")){
                 if(dayWeek1.contains("Занятий нет")){
                     result.append("Понедельник");
                     result.append("""


                        """);
                     result.append("Занятий нет((МЕД))");
                     result.append("\n________________________________________________\n");
                 }else {
                     WebElement parentElement = driver.findElement(By.id("dayWeek1"));
                     List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                     result.append("\n                       Понедельник");
                     result.append("\n__________________________");
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
                         result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                         result.append("\n__________________________");
                     }
                     result.append("\n__________________________________________________________\n");
                 }
             }
            if(denNedeli2.contains("сегодня")){
                if(dayWeek2.contains("Занятий нет")){
                    result.append("Вторник");
                    result.append("""


                        """);
                    result.append("Занятий нет(очен жал)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek2"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Вторник");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli3.contains("сегодня")){
                if(dayWeek3.contains("Занятий нет")){
                    result.append("Среда");
                    result.append("""


                        """);
                    result.append("Занятий нет(ну вроде)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek3"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Среда");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli4.contains("сегодня")){
                if(dayWeek4.contains("Занятий нет")){
                    result.append("Четверг");
                    result.append("""


                        """);
                    result.append("Занятий нет(умеренный балдеж 6/10)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek4"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Четверг");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n________________________________________________\n");
                }
            }
            if(denNedeli5.contains("сегодня")){
                if(dayWeek5.contains("Занятий нет")){
                    result.append("Пятница");
                    result.append("""


                        """);
                    result.append("Занятий нет                   =)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek5"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Пятница");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________________________________________\n");
                    }

                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli6.contains("сегодня")){
                if(dayWeek6.contains("Занятий нет")){
                    result.append("Суббота");
                    result.append("""


                        """);
                    result.append("Занятий нет(extra hype 10/10)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek6"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Суббота");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            return result.toString();
        }
        String tomorrowInfo(){
            StringBuilder result = new StringBuilder("________________________________________________\n");

            String dayWeek1 =(driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String dayWeek2 =(driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String dayWeek3 =(driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
            String dayWeek4 =(driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String dayWeek5 =(driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String dayWeek6 =(driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());

            String denNedeli1 = (driver.findElement(By.xpath("//*[@id=\"dayWeek1\"]")).getText());
            String denNedeli2 = (driver.findElement(By.xpath("//*[@id=\"dayWeek2\"]")).getText());
            String denNedeli3 = (driver.findElement(By.xpath("//*[@id=\"dayWeek3\"]")).getText());
            String denNedeli4 = (driver.findElement(By.xpath("//*[@id=\"dayWeek4\"]")).getText());
            String denNedeli5 = (driver.findElement(By.xpath("//*[@id=\"dayWeek5\"]")).getText());
            String denNedeli6 = (driver.findElement(By.xpath("//*[@id=\"dayWeek6\"]")).getText());

            if(denNedeli1.contains("сегодня")){
                if(dayWeek2.contains("Занятий нет")){
                    result.append("Вторник");
                    result.append("""


                        """);
                    result.append("Занятий нет(очен жал)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek2"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Вторник");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli2.contains("сегодня")){
                if(dayWeek3.contains("Занятий нет")){
                    result.append("Среда");
                    result.append("""


                        """);
                    result.append("Занятий нет(ну вроде)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek3"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Среда");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli3.contains("сегодня")){
                if(dayWeek4.contains("Занятий нет")){
                    result.append("Четверг");
                    result.append("""


                        """);
                    result.append("Занятий нет(умеренный балдеж 6/10)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek4"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Четверг");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n________________________________________________\n");
                }
            }
            if(denNedeli4.contains("сегодня")){
                if(dayWeek5.contains("Занятий нет")){
                    result.append("Пятница");
                    result.append("""


                        """);
                    result.append("Занятий нет                   =)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek5"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Пятница");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________________________________________\n");
                    }

                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli5.contains("сегодня")){
                if(dayWeek6.contains("Занятий нет")){
                    result.append("Суббота");
                    result.append("""


                        """);
                    result.append("Занятий нет(extra hype 10/10)");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek6"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Суббота");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            if(denNedeli6.contains("сегодня")){
                if(dayWeek1.contains("Занятий нет")){
                    result.append("Понедельник");
                    result.append("""


                        """);
                    result.append("Занятий нет((МЕД))");
                    result.append("\n________________________________________________\n");
                }else {
                    WebElement parentElement = driver.findElement(By.id("dayWeek1"));
                    List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));
                    result.append("\n                       Понедельник");
                    result.append("\n__________________________");
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
                        result.append("\n" + "Пара №: ").append(nomerPari).append("\n").append("\n").append(time).append("\n").append("\n").append(disciplina).append("\n").append("\n").append("Преподователь: ").append(prepod).append("\n").append("\n").append("Кабинет: ").append(cabinet);
                        result.append("\n__________________________");
                    }
                    result.append("\n__________________________________________________________\n");
                }
            }
            return result.toString();
        }
    }