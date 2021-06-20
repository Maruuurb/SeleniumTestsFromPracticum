package firstBlock;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAndPassword {
    private ChromeDriver driver;

    @Test
    public void test() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/signin");

        WebElement elementMail = driver.findElement(By.id("email"));
        elementMail.clear();
        elementMail.sendKeys("maria.asdkasio@gmail.com");

        WebElement elementPass = driver.findElement(By.id("password"));
        elementPass.clear();
        elementPass.sendKeys("23redwcs23edw");

        WebElement elementLogin = driver.findElement(By.xpath("/html/body/div/div/div[1]/form/button"));
        elementLogin.click();

    }

    @After
    public void teardown() throws InterruptedException {
        driver.quit();
    }
}
