package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseLibrary {
    public HomePage uyeOlTikla(){
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[1]/div/button[2]")).click();
        return this;
    }

    public HomePage girisYapTikla(){
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[1]/div/button[1]")).click();
        return this;
    }

}
