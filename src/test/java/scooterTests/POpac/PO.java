package scooterTests.PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO {
    //локатор кнопки заказа
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement buttonOrderTitle;
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement buttonOrderBody;

    //локатор кнопки поиска заказа
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement buttonOrderStatus;

    //локаторы полей 1 шага заказа
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[1]/input")
    private SelenideElement inputName;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[2]/input")
    private SelenideElement inputSurname;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[3]/input")
    private SelenideElement inputAddress;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[4]/div/div/input")
    private SelenideElement dropdownMetro;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[4]/div/div/input")
    private SelenideElement inputPhoneNumber;
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement buttonNext1Step;

    //локаторы полей 2 шага заказа
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input")
    private SelenideElement inputDate;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[2]/div[1]")
    private SelenideElement dropdownRentalPeriod;
    @FindBy(id = "black")
    public SelenideElement inputBlack;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[3]/label[2]/input")
    private SelenideElement inputComment;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[3]/button[2]")
    private SelenideElement buttonNext2Step;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[5]/div[2]/button[2]")
    private SelenideElement buttonOrderSuccess;

    
    //Выпадающий список в разделе «Вопросы о важном»
    
    @FindBy(xpath = "//*[text() = 'Сколько это стоит? И как оплатить?']")
    public SelenideElement divAccordionItemButton;
    @FindBy(xpath = "//*[text() = 'Хочу сразу несколько самокатов! Так можно?']")
    public SelenideElement divAccordionItemButton2;
    @FindBy(xpath = "//*[text() = 'Как рассчитывается время аренды?']")
    public SelenideElement divAccordionItemButton3;
    @FindBy(xpath = "//*[text() = 'Можно ли заказать самокат прямо на сегодня?']")
    public SelenideElement divAccordionItemButton4;
    @FindBy(xpath = "//*[text() = 'Можно ли продлить заказ или вернуть самокат раньше?']")
    public SelenideElement divAccordionItemButton5;
    @FindBy(xpath = "//*[text() = 'Вы привозите зарядку вместе с самокатом?']")
    public SelenideElement divAccordionItemButton6;
    @FindBy(xpath = "//*[text() = 'Можно ли отменить заказ?']")
    public SelenideElement divAccordionItemButton7;
    @FindBy(xpath = "//*[text() = 'Я жизу за МКАДом, привезёте?']")
    public SelenideElement divAccordionItemButton8;


    //Клик по кнопкам "заказать"
    public void clickButtonOrderTitle(){
        buttonOrderTitle.click();
    }
    public void clickButtonOrderBody(){
        buttonOrderBody.click();
    }

    //Методы заполнения полей на 1 шаге
    public void setInputName(String userName){
        inputName.setValue(userName);
    }
    public void setInputSurname(String userSurname){
        inputSurname.setValue(userSurname);
    }
    public void setInputAddress(String userAddress){
        inputAddress.setValue(userAddress);
    }
    public void setDropdownMetro(){
        dropdownMetro.click();
        dropdownMetro.selectOption("Черкизовская");
        dropdownMetro.click();
        //не уверенна, что именно так делается выбор из выпадающего списка
    }
    public void setInputPhoneNumber(String userNumber){
        inputPhoneNumber.setValue(userNumber);
    }

    //Клик по кнопке далее
    public void clickButtonNext1Step(){
        buttonNext1Step.click();
    }
    //Метод для заполнения всех полей на 1 шаге заказа и переход на 2 шаг
    public void orderPage1(String userName, String userSurname, String userAddress, String userNumber){
        setInputName(userName);
        setInputSurname(userSurname);
        setInputAddress(userAddress);
        setDropdownMetro();
        setInputPhoneNumber(userNumber);
        clickButtonNext1Step();
    }
    
    //Методы заполнения полей на 2 шаге
    public void setInputDate(){
        inputDate.click();
        inputDate.selectOption(25);
        inputDate.click();
    }
    public void setDropdownRentalPeriod(){
        dropdownMetro.click();
        dropdownMetro.selectOption("четверо суток");
        dropdownMetro.click();
        //не уверенна, что именно так делается выбор из выпадающего списка
    }
    public void setInputBlack(){
        inputBlack.click();
    }
    public void setInputComment(String userComment){
        inputComment.setValue(userComment);
    }
    public void clickButtonOrderSuccess(){
        buttonOrderSuccess.click();
        buttonOrderSuccess.shouldBe(Condition.not(Condition.visible));
    }
    //метод заполнения 2 шага и переход на страницу подтверждения
    public void orderPage2(String userComment){
        setInputDate();
        setDropdownRentalPeriod();
        setInputBlack();
        setInputComment(userComment);
        clickButtonOrderSuccess();
    }


    
    
    


    
    

    




}
