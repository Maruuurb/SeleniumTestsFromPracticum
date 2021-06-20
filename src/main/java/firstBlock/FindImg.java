package firstBlock;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class FindImg {

    /*
    Задание
    Найди все элементы с тэгом <img> по XPath. Примени относительный путь.
    Закрой браузер после тестирования.
     */

    private ChromeDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/signin");

        List<WebElement> elements = driver.findElements(By.xpath(".//img"));
        System.out.println(elements.size());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}


