package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");
        MyFunc.Bekle(2);

        driver.switchTo().frame(0); // ilk frame e geçildi.
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");
        // şu anda 1.frame in içindeyim , onun içinde ki frame gidicem
        // 1 tnae olduğu için index 0
        driver.switchTo().frame(0);
        WebElement chkbox=driver.findElement(By.id("a"));
        chkbox.click();

        //driver.switchTo().parentFrame(); // bir geri parente git
        //driver.switchTo().parentFrame(); // daha sonra bir geri parente yani ana sayfaya

        driver.switchTo().defaultContent(); // direk ana sayfaya gidildi

        driver.switchTo().frame(1); // 2. frame geçildi
        WebElement webSelect = driver.findElement((By.id("animals")));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByIndex(1);


        BekleVeKapat();
    }
}
