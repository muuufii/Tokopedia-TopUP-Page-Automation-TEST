package topUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By loginPageText = By.tagName("h3");
    //private By loginPageText = By.xpath("//*[@id=\"zeus-root\"]/div/div[3]/section/div[1]/h3");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLoginText(){
        return driver.findElement(loginPageText).getText();
    }

}
