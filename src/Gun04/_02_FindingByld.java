package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByld {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

      //1-  1.texbox ı bul , ona bir isim ver mesela isimKutusu
      //2-   isimKutusuna "ismet" yazısını gönder

      //3- 2. texbox ı bul , ona bir isim ver mesela soyaddKutusu
      //4- soyadKutusu isimKutusu "temur" yazısını gönder

        WebElement isimKutusu= driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("Arda"); // kutucuklara yazı gönderme

        WebElement soyadKutusu= driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Boz");

        MyFunc.Wait(5);
        driver.quit();
    }
}
