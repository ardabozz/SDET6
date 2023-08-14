package Gun04;

import Utility.MyFunc;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByName {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // textBox ları name ile bulup adınızı ve soyadınızı doldurun
        // ve butonu da id veya name ile bulup tıklatın


        WebElement firstName=driver.findElement(By.name("q8_name[first]"));
        firstName.sendKeys("Arda");

        WebElement LastName= driver.findElement(By.name("q8_name[last]"));
        LastName.sendKeys("Boz");


        WebElement btnSubmit= driver.findElement(By.id("input_2"));
        btnSubmit.click();


        MyFunc.Wait(5);
        driver.quit();

    }
}
