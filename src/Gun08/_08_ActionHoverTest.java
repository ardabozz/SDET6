package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;

public class _08_ActionHoverTest extends BaseDriver{

    @Test
    public void Test1() {
        driver.get("https://hepsiburada.com");

        WebElement element= driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);

        Actions aksiyonlar= new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(element).build();
        aksiyon.perform();


    }


}
