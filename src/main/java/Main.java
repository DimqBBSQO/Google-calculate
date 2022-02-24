import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Games\\ChromeDrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://google.com");
            Thread.sleep(3000);

            WebElement find = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
            find.sendKeys("Калькулятор онлайн", Keys.ENTER);

            Thread.sleep(3000);

            WebElement but2 = driver.findElement(By.xpath("//div[@jsname='lVjWed']"));
            WebElement butPlus = driver.findElement(By.xpath("//div[@jsname='XSr6wc']"));
            WebElement butCalc = driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));


            but2.click();
            butPlus.click();
            but2.click();
            butCalc.click();

            WebElement result = driver.findElement(By.id("cwos"));
            int res = Integer.parseInt(result.getText());
            Assert.assertEquals(res, 4);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();

        }





    }
}
