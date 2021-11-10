package topUpPulsaTest;

import baseTest.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import topUpPage.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TopUpPulsaTest extends BaseTest {

    @Test
    @DisplayName("Test Top Pulsa Tanpa Login")
    public void topUpPulsaTest(){

        //Menuju top up pulsa page
        var topUpTest = thePage.goToTopUpPulsaPage();

        //Test Masukan no hp
        topUpTest.fillNomorHandphone("081212346666");

        //test masukan nominal isi pulsa menggunakan index
        //0,1,2,3,4....n
        topUpTest.selectJumlahPulsa(1);

        //print harga pulsa
        System.out.println(topUpTest.getHargaPulsa());

        //klik button beli pulsa
        //kondisi tanpa login
        var loginPage = topUpTest.clickBeliPulsa();
        assertEquals(loginPage.getLoginText(),"Masuk");

    }
}
