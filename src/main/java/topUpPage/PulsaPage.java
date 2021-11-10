package topUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PulsaPage {

    private WebDriver driver;

    //set element yang akan ditest
    private By displayPulsaText = By.xpath("//*[@id=\"mainLayout\"]/div[1]/div[3]/div[1]/div[2]/div/div/div[1]");
    private By formNomorHandphone = By.name("client_number");
    private By buttonSelectJumlahPulsa = By.className("css-191yyly");
    private By textHargaPulsa = By.xpath("//*[@id=\"mainLayout\"]/div[1]/div[3]/div[1]/div[2]/div/div/div[8]/span/div/strong");
    private By buttonBeliPulsa = By.xpath("//*[@id=\"mainLayout\"]/div[1]/div[3]/div[1]/div[2]/div/div/div[8]/div/button");

    public PulsaPage(WebDriver driver){
        this.driver = driver;
    }

    public String isPulsaTextDisplayed(){
        return driver.findElement(displayPulsaText).getText();
    }

    public void fillNomorHandphone(String noHp){
        driver.findElement(formNomorHandphone).sendKeys(noHp);
    }

    public void selectJumlahPulsa(int index){
        driver.findElements(buttonSelectJumlahPulsa).get(index).click();

    }

    public String getHargaPulsa(){
        return driver.findElement(textHargaPulsa).getText();
    }

    public LoginPage clickBeliPulsa(){
        driver.findElement(buttonBeliPulsa).click();
        return new LoginPage(driver);
    }






}
