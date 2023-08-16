package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");

//        WebElement firstName = driver.findElement(By.className(("form-textbox"))); //classname ile bulma
        // findElement ayni locator da birden fazla element bulursa BIRINCISINI Gönderir
//        firstName.sendKeys("ismet");

        List<WebElement> labels = driver.findElements(By.className("sf-dod-mpQGL"));
        for (WebElement e : labels)
            System.out.println("e.getText() = " + e.getText());

        List<WebElement> labels2 = driver.findElements(By.className("sf-dod12345"));
        System.out.println("labels2. size() = " + labels2.size());


        MyFunc.Bekle(5);
        driver.quit();

    }
}
