import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://xstation5.xtb.com/?branch=int#/_/login");
        Thread.sleep(5000);
        //log in
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[1]/div[2]/div/div/form/div[1]/input"));
        searchInput.sendKeys("slavianich.iz.hearthstona@mail.ru");
        Thread.sleep(8000);
        //input password
        searchInput = driver.findElement(By.cssSelector("div.xs-login-form-row:nth-child(2) > input:nth-child(1)"));
        searchInput.sendKeys("EPAMTESTACC1");
        Thread.sleep(1000);
        //press login button
        searchInput = driver.findElement(By.cssSelector(".xs-btn"));
        searchInput.click();
        Thread.sleep(10000);
        //pick "CRYPTO" category
        searchInput = driver.findElement(By.cssSelector("div.xs-mws-menu-tab:nth-child(7)"));
        searchInput.click();
        Thread.sleep(8000);
        //pick "binancecoin" category
        searchInput = driver.findElement(By.xpath("//div[text()='BITCOIN']"));
        searchInput.click();
        Thread.sleep(8000);
        //take number of sell
        searchInput = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/div/div/div[3]/div/div[1]/div[1]/div[2]/div/div[5]/div/div[1]/div/click-and-trade-panel/div[2]/div[3]/div[3]/div/form/span/input"));
        searchInput.sendKeys("");
        Thread.sleep(8000);
        //press buy button
        searchInput = driver.findElement(By.xpath("//*[@id='clickAndTradeButtonBid']"));
        searchInput.click();
        Thread.sleep(8000);
        //open notifications
        searchInput = driver.findElement(By.cssSelector("#priceAlertsButton"));
        searchInput.click();
        driver.quit();
    }
}