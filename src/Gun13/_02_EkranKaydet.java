package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

public class _02_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

        // kendine kod yazıyorsun
        driver.findElement(By.name("username")).sendKeys("Arda");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsj = driver.findElements(By.xpath("//*[text()='Invalid credentials']"));

        if (errorMsj.size() > 0){ // hata olmuşsa
            System.out.println("hata oldu");

            // ekran kaydet
            //Actions driverAksiyon=new Actions(driver);
            //JavascriptExecutor js = (JavascriptExecutor) driver;

            TakesScreenshot ts=(TakesScreenshot)driver; // 1. Aşama ekran görüntü alma değişkenini tanımladım
            File hafidakiHali=ts.getScreenshotAs(OutputType.FILE); // 2. Aşama ekran görüntüsü alındı, hafızada
            // hafızakdaki ekran kaydını, yolunu (path) ini ve ismini verdiğim şu dosyaya kaydet

            FileUtils.copyFile(hafidakiHali,new File("ekranGoruntuleri\\ScreenShot.png"));

            // TODO: öyle bir şey yapın ki her ekran kaydı , AYRI kaydedilsin.
        }


        BekleVeKapat();
    }
}
