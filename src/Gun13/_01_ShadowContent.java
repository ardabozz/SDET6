package Gun13;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class _01_ShadowContent extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.akakce.com/");

        WebElement shadowWebParent= driver.findElement(By.cssSelector("[class='efilli-layout-tuttur']"));

        SearchContext shadowContext= shadowWebParent.getShadowRoot(); // shadow u aldım

        WebElement kabulBtn = shadowContext.findElement(By.cssSelector("div+div > div+div"));
        System.out.println("kabulBtn.getText() = " + kabulBtn.getText());
        kabulBtn.click();

        BekleVeKapat();
    }
}
