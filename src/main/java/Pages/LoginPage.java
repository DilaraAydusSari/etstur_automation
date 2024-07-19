package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseLibrary {

    public LoginPage emailDoldur(String email){
        driver.findElement(By.name("email")).sendKeys(email);
        return this;
    }

    public LoginPage passwordDoldur(String password){
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public LoginPage loginTikla(){
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div[1]/form/div[3]/button"));
        return this;
    }

}
