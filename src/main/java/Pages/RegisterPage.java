package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BaseLibrary {

    public RegisterPage nameDoldur(String name){
        driver.findElement(By.name("name")).sendKeys(name);
        return this;
    }

    public RegisterPage surnameDoldur(String surname){
        driver.findElement(By.name("surname")).sendKeys(surname);
        return this;
    }

    public RegisterPage emailDoldur(String email){
        driver.findElement(By.name("email")).sendKeys(email);
        return this;
    }

    public RegisterPage phoneDoldur(String phone){
        driver.findElement(By.id(":r5:")).sendKeys(phone);
        return this;
    }

    public RegisterPage passwordDoldur(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public RegisterPage repasswordDoldur(String repassword) {
        driver.findElement(By.name("rePassword")).sendKeys(repassword);
        return this;
    }

    public RegisterPage kvkKabul() {
        driver.findElement(By.name("acceptKvk")).click();
        return this;
    }

    public RegisterPage kampanyaKabul() {
        driver.findElement(By.name("allowMarketing")).click();
        return this;
    }

    public RegisterPage uyeOlTikla() {
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div[1]/form/div[3]/button")).click();
        return this;
    }



}
