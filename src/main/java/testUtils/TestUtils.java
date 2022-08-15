package testUtils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Random;

public class TestUtils {
    public static String getRandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static FluentWait fluentWait(WebDriver driver) {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofMillis(10000));
        wait.pollingEvery(Duration.ofMillis(250));
        wait.ignoring(NoSuchElementException .class);
        return wait;
    }
}
