package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _03_RobotGiris extends BaseDriver {
    @Test
    public void Test1() throws AWTException {

        driver.get("https://www.google.com");
        MyFunc.Bekle(2);

        Robot robot = new Robot();

        // java ROBOT class
        robot.keyPress(KeyEvent.VK_CONTROL); // CTRL a bas
        robot.keyPress(KeyEvent.VK_T); // bu basılıyken T a bas
        robot.keyRelease(KeyEvent.VK_T); // T yi bırak
        robot.keyRelease(KeyEvent.VK_CONTROL); // CTRL yi bırak
        // yeni pencere açıldı mı

        // selenium windows handle switchTo
        // yeni açılan sekmeye geç

        Set<String> windowIdler = driver.getWindowHandles();
        Iterator gostergeler = windowIdler.iterator();
        String firtSekme= gostergeler.next().toString();
        String secondSekme= gostergeler.next().toString();
        //System.out.println("firtSekme = " + firtSekme);
        //System.out.println("secondSekme = " + secondSekme);


        MyFunc.Bekle(2);
        driver.switchTo().window(secondSekme);
        driver.get("https://www.facebook.com/");
        BekleVeKapat();
    }
}
