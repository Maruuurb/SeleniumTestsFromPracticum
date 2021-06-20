package firstBlock;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FindLogin {
    private ChromeDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/signin");

        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[1]/form/button"));
        element.click();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

