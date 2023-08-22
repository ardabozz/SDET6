package Gun08;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.amazon.com/");

        WebElement webMenu= driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu=new Select(webMenu); // elementi daha rahat kullabiliri SELECT nesnesi haline dönüştürdü

        // bu element select tag i ile başlıyorsa, sen bunu SELECAT e cast yap ve öyle kullan.

        // ddMenu.selectByIndex(4); // ister bu şekilde seçebilirsin : index ile
        // ddMenu.selectByValue("search-alias=stripbooks-intl-ship"); // ister bu şekilde seçebilirsin : value ile


        ddMenu.selectByVisibleText("Electronics"); // ister bu şekilde seçebilirsin : görünen string ile

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        BekleVeKapat();
    }
}
