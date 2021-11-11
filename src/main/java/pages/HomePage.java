package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class HomePage {
    public  HomePage () {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);

    }
    @FindBy(name = "email")
    public WebElement userNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(linkText = "Homework")
    public WebElement HomeworkLink;

    @FindBy(linkText = "Meeting links")
    public WebElement MeetingsLink;

}
