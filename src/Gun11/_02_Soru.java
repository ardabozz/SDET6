package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
public class _02_Soru extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");
        MyFunc.Bekle(2);

        driver.switchTo().frame(0); // ilk frame e geçildi.
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        //driver.switchTo().parentFrame(); // bir geri parente git : ana sayfa
        driver.switchTo().defaultContent(); // direk olarak ana sayfaya git

        driver.switchTo().frame(1); // 2. frame e geçtim.
        WebElement webSelect = driver.findElement((By.id("animals")));

        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByVisibleText("Avatar");

        BekleVeKapat();
    }
}
