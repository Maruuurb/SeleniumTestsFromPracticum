package firstBlock;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
    /*
    Задание
    Найди все элементы с тэгом <img> по XPath. Примени относительный путь.
    Закрой браузер после тестирования.
     */
    private ChromeDriver driver;
    @Test
    public void test(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/signin");

        WebElement element = driver.findElement(By.cssSelector(".auth-form__title"));
    }
    @After
    public void teardown(){
        driver.quit();
    }
}
