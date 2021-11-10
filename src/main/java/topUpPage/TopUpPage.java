package topUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopUpPage {

    private WebDriver driver;
    //constructor
    public TopUpPage(WebDriver driver){
        this.driver = driver;
    }

    //membuat method untuk menuju page lain pada top up page
    //======//
    //Menuju page top up pulsa
    public PulsaPage goToTopUpPulsaPage(){
        searchElement("//*[@id=\"content\"]/div[1]/div/div[2]/div[2]/div/a[1]");
        return new PulsaPage(driver);
    }


    //Method untuk mencari element menggunakan xpath dan melakukan action click
    private void searchElement(String xPathString){
        driver.findElement(By.xpath(xPathString)).click();
    }

}
