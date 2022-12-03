package utilities;

import java.util.Iterator;
import java.util.Set;

import static utilities.DriverSetUp.getDriver;

public class WindowHandles{
//     static Set<String> window =getDriver().getWindowHandles();
//     static Iterator<String> it = window.iterator();
//     static String parent = it.next();
//      static String child =it.next();
    public void getWindowHandles(){
        Set<String> window =getDriver().getWindowHandles();
        Iterator<String> it = window.iterator();
         String parent = it.next();
         String child =it.next();
        getDriver().switchTo().window(child);
    }


}
