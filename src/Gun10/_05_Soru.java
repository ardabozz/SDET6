package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_Soru extends BaseDriver {

    @Test
    private void Test1(){
        driver.get("https://www.demoblaze.com/index.html");
        MyFunc.Bekle(2);

        WebElement link=driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepetEkle= driver.findElement(By.linkText("Add to cart"));
        sepetEkle.click();

        wait.until(ExpectedConditions.alertIsPresent()); // // alert gözükene kadar bekle
        driver.switchTo().alert().accept();

        WebElement anaSayfa=driver.findElement(By.id("nava"));
        anaSayfa.click();

        BekleVeKapat();
        
    }
}
