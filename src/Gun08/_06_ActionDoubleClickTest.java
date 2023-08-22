package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnDbClick= driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(btnDbClick).doubleClick().build();
        aksiyon.perform();

        BekleVeKapat();

    }
}
