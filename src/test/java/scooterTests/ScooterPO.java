package scooterTests;

import org.junit.Test;
import scooterTests.POpac.PO;

import static com.codeborne.selenide.Selenide.open;

public class  ScooterPO{
    @Test
    public void test(){
        // открывается страница и создаётся экземпляр класса страницы
        PO orderPage = open("https://qa-scooter.praktikum-services.ru/", PO.class);

        orderPage.orderPage1("Тестер",
                "Тестерович",
                "Нижнее куйбышево",
                "89980912417");
        orderPage.orderPage2("Пожалуйста, простопривезите самокат");
    }

}
