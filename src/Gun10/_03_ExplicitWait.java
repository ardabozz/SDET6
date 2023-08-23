package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class _03_ExplicitWait extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        // text i "Web Driver" olana kadar bekle
        // bu durumda elemente özel kriter vermek gerekir.
        WebDriverWait bekle= new WebDriverWait(driver, Duration.ofSeconds(20)); // 1 kere tanımlanıyor
        // Duration gibi sadece süre ve drive tanımlaması yapıldı.
        bekle.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        // visibilityOfElementLocated : bu locator gözükene kadar BEKLE

        WebElement msj= driver.findElement(By.id("demo"));
        System.out.println("msj.getText() = " + msj.getText());

        BekleVeKapat();

    }

}
