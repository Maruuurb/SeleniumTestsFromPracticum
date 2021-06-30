package Selenide;

import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FinalProject1 {

    @Test
    public void test(){
        // вход в профиль
        open("https://qa-mesto.praktikum-services.ru/signin");
        $(byId("email")).setValue("maria.asdkasio1@gmail.com");
        $(byId("password")).setValue("12345678");
        $(byText("Войти")).click();

        //клик по изображению
        $(byClassName("profile__image")).click();

        //нахождение поля для ссылки на изображения
        $(byId("owner-avatar")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenide.png");

        // сохранить новое изображение
        $(byXpath("/html/body/div/div/div[4]/div/form/button[2]")).click();

    }
}
