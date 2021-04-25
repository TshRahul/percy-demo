import io.percy.selenium.Percy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {
    private static WebDriver driver;
    private static Percy percy;


    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Hp/Desktop/All Things/Dates Artifacts/16-04-2021/New folder (2)/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--window-size=1920,1200", "--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        percy = new Percy(driver);

        driver.get("https://www.bing.com/");
        percy.snapshot("Java example");
        driver.quit();
    }




}
