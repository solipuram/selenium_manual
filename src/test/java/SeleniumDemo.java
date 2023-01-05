import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.bonigarcia.wdm.WebDriverManager;

class SeleniumDemo {

    public WebDriver driver; 
    public String baseUrl = "https://www.lambdatest.com/";


    
    @Test
    void test() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
        driver.manage().window().maximize();  
        driver.get("https://www.jenkins.io/");
        assertThat(driver.getTitle()).contains("srinivas");
        driver.close();

        
    }

    

   

}