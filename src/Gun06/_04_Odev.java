package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.sql.Driver;

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);

public class _04_Odev extends BaseDriver {

    @Test
   public void FormTest(){
       driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);





   }
}
