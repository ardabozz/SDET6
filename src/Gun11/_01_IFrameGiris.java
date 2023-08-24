package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");
        long startTime = System.currentTimeMillis();

        //driver.switchTo().frame(0); // 24 index vererek geçilebilir : index sayfadaki sırası
        //driver.switchTo().frame("frame1"); // 20112 id vererek geçebilirsiniz, ancak yavaş
        //driver.switchTo().frame("iamframe"); // 163 name vererek geçilebilir, ancak hızlı
        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1); // 71 webelement olarak ta verebilirsin, ancak

        long endTime = System.currentTimeMillis();
        System.out.println("süre = " + (endTime-startTime));

        WebElement txtBox=driver.findElement(By.cssSelector("[id='topic']+input"));
        txtBox.sendKeys("Türkiye");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmen lazım.
        //driver.switchTo().frame(0); // ilgili odaya  (iframe geç)
        //driver.switchTo().parentFrame(); // bir önceki sayfaya geç, bi geri.
        driver.switchTo().defaultContent(); // direk en dıl sayfaya gider


        BekleVeKapat();
    }
}
