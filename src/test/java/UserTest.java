import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.junit.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test(description = "Üye Ol Button Kontrolü")
    public void uyeOl() {
        homePage.uyeOlTikla();
    }

    @Test(description = "Giriş Yap Button Kontrolü")
    public void girisYap() {
        homePage.girisYapTikla();
    }

    @Test(description = "Başarlı Kullanıcı Oluşturma ")
    public void basariliUyeOlma() throws InterruptedException {
        homePage.uyeOlTikla();
        registerPage
                .nameDoldur(name)
                .surnameDoldur(surname)
                .emailDoldur(email);
        sleep(5000);
        registerPage
                .phoneDoldur(phone)
                .passwordDoldur(password)
                .repasswordDoldur(rePassword);
        sleep(5000);
        registerPage.kvkKabul();
        sleep(5000);
        registerPage.kampanyaKabul();
        sleep(5000);
        registerPage.uyeOlTikla();

    }

    @Test(description = "Sisteme Başarılı Bir Şekilde Giriş Yapma")
    public void basariliGirisYapma() throws InterruptedException {
        homePage.girisYapTikla();
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password);
        sleep(5000);
        loginPage.loginTikla();
    }

    @Test(description = "Sisteme Hatalı Şifre İle Giriş Kontolü")
    public void hatalisifre() throws InterruptedException {
        homePage.girisYapTikla();
        loginPage.emailDoldur(email).passwordDoldur("xxxyyyy");
        sleep(5000);
        loginPage.loginTikla();
    }

}



