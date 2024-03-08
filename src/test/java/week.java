import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class week {
    public String generateWeek(WebDriver driver, String dayWeek, String dayName, String noClassesMessage) {
        StringBuilder result = new StringBuilder();

        if (dayWeek.contains("Занятий нет")) {
            result.append(dayName);
            result.append("\n\n");
            result.append(noClassesMessage);
            result.append("\n________________________________________________\n");
        } else {
            WebElement parentElement = driver.findElement(By.id(dayWeek));
            List<WebElement> disciplineListElements = parentElement.findElements(By.className("discipline-list"));

            result.append("\n                       ").append(dayName);
            result.append("\n__________________________");

            String time, nomerPari, disciplina, prepod, cabinet;

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

        return result.toString();
    }


}
