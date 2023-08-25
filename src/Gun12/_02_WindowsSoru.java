package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSoru extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        MyFunc.Bekle(2);

        String anaSayfaWindowId=driver.getWindowHandle(); // ana sayfanın id sini aldım diğer sayfa açılmadan

        //_Blanka olan bütün a taglarını aldım
        List<WebElement> Linkler= driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement e: Linkler){
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> windowsIdler = driver.getWindowHandles();

        for (String id: windowsIdler){
            MyFunc.Bekle(2);
            driver.switchTo().window(id);
            System.out.println("title="+driver.getTitle()+", url="+driver.getCurrentUrl());
        }

        for (String id: windowsIdler){
            if (id.equals(anaSayfaWindowId)) continue; // ana sayfanın id si gelirse pas geç
            driver.switchTo().window(id);
            driver.close();
        }



        BekleVeKapat();
    }
}
