package firstBlock;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HelloSelenium {
    private WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get(" https://qa-mesto.praktikum-services.ru/");

    }

    @After
    public void teardown(){
        driver.quit();
    }

}

