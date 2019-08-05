package prop;

import org.openqa.selenium.By;

public class Waitings {

    public static void delay(long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitToBeVisible(By locator) {

    }
}
